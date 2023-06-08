package com.example.demondex;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Review {
    @PrimaryKey(autoGenerate = true)
    int id;

    String name;
    String description;
    float rating;

    public Review(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
