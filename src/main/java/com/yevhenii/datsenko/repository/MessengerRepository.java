package com.yevhenii.datsenko.repository;

import com.yevhenii.datsenko.domain.Message;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by Yevhenii on 4/7/2017.
 */
public interface MessengerRepository extends Repository<Message, String> {
    /**
     * Finds all message entries from the database.
     * @return  The information of all message entries that are found from the database.
     */
    List<Message> findAll();

    List<Message> findMessagesBySenderAndReceiver(String sender, String receiver);

    /**
     * Saves a new message entry to the database.
     * @param saved The information of the saved message entry.
     * @return      The information of the saved message entry.
     */
    Message save(Message saved);
}
