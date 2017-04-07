package com.yevhenii.datsenko.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by Yevhenii on 4/7/2017.
 */
public class Message implements Serializable {
    @Id
    private String id;
    private String sender;
    private String receiver;
    private String timestamp;
    private String message;

    public Message() {}

    public Message(Builder builder) {
        this.timestamp = builder.timestamp;
        this.sender = builder.sender;
        this.receiver = builder.receiver;
        this.message = builder.message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format(
                "{\"id:\"%s, \"timestamp\":%s, \"sender\":%s, \"receiver\":%s, \"message\":%s}",
                this.id,
                this.timestamp,
                this.sender,
                this.receiver,
                this.message
        );
    }

    static class Builder {

        private String timestamp;
        private String sender;
        private String receiver;
        private String message;

        private Builder() {}

        Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        Builder message(String message) {
            this.message = message;
            return this;
        }

        Message build() {
            return new Message(this);
        }
    }
}
