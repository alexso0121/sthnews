package com.example.news_springbootbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @javax.persistence.Entity
    @Table(name = "history")
    public class History {

        @Id
        @GeneratedValue
        private int id;


        private String username;
        private int user_id;

      //  @OneToOne(mappedBy = "History")
        private int news_id;
        private LocalDate date;
        private String title;



    }


