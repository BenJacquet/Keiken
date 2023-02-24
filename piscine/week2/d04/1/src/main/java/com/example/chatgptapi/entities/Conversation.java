package com.example.chatgptapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.Date;

@Component

public class Conversation {
    private int     id;
    private String  userMessage;
    private String  response;
    private Date    date;
}
