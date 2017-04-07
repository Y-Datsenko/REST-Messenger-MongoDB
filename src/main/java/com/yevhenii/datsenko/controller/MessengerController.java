package com.yevhenii.datsenko.controller;

import com.yevhenii.datsenko.domain.Message;
import com.yevhenii.datsenko.domain.POJOGetMessagesObject;
import com.yevhenii.datsenko.service.MessengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * This controller provides the public API that is used to manage the information
 * of message entries.
 * @author Yevhenii
 */
@RestController
@RequestMapping("/api/messenger")
public class MessengerController {

    @Autowired
    private MessengerService messengerService;

    @RequestMapping(method = RequestMethod.POST, value = "/save")
    @ResponseStatus(HttpStatus.CREATED)
    Message save(@RequestBody @Valid Message message) {
        return this.messengerService.save(message);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Message> findAll() {
        return this.messengerService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/messages")
    List<Message> findMessagesBySenderAndReceiver(@RequestBody POJOGetMessagesObject pojoGetMessagesObject) {
        return this.messengerService.findMessagesBySenderAndReceiver(
                pojoGetMessagesObject.getSender(), pojoGetMessagesObject.getReceiver());
    }
}
