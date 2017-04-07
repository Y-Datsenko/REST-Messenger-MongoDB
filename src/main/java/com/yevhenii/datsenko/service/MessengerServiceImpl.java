package com.yevhenii.datsenko.service;

import com.yevhenii.datsenko.domain.Message;
import com.yevhenii.datsenko.repository.MessengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yevhenii on 4/7/2017.
 */
@Service
public class MessengerServiceImpl implements MessengerService {

    @Autowired
    private MessengerRepository messengerRepository;

    @Override
    public List<Message> findAll() {
        return this.messengerRepository.findAll();
    }

    @Override
    public List<Message> findMessagesBySenderAndReceiver(String sender, String receiver) {
        return this.messengerRepository.findMessagesBySenderAndReceiver(sender, receiver);
    }

    @Override
    public Message save(Message saved) {
        return this.messengerRepository.save(saved);
    }
}
