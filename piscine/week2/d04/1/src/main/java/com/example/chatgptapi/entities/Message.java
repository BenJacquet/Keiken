package com.example.chatgptapi.entities;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Message {
    int         id;
    String      content;
    boolean     fromUser;
    Date        date;

    public void Message(int id, String content, boolean fromUser){
        this.id = id;
        this.content = content;
        this.fromUser = fromUser;
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean getFromUser() {
        return fromUser;
    }

    public Date getDate() {
        return date;
    }
}
