package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class Add {
    private long author;
    private String image;
    private String title;
    private int pk;
    private int price;
}
