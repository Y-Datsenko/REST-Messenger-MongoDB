package com.yevhenii.datsenko.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by Yevhenii on 4/7/2017.
 */
public class POJOGetMessagesObject implements Serializable{
    @NotEmpty
    private String sender;
    @NotEmpty
    private String receiver;

    public POJOGetMessagesObject() {}

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return String.format(
                "{\"sender\":%s, \"receiver\":%s}",
                this.sender,
                this.receiver
        );
    }
}
