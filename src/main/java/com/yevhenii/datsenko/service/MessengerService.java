package com.yevhenii.datsenko.service;

import com.yevhenii.datsenko.domain.Message;

import java.util.List;

/**
 * Created by Yevhenii on 4/7/2017.
 */
public interface MessengerService {

    List<Message> findAll();

    List<Message> findMessagesBySenderAndReceiver(String sender, String receiver);

    Message save(Message saved);
}
