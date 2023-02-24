package com.example.chatgptapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "conversations")
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int     id;

    @Column(nullable=false, length = 4096)
    private String  userMessage;
    @Column(nullable=false, length = 4096)
    private String  response;
    @Column(nullable=false)
    private Date    date;
}
