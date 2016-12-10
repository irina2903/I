package ru.irina.comicsfilms;

import java.io.Serializable;

/**
 * Created by User on 12/3/2016.
 */
public class ComicsFilms implements Serializable {
    public String title;
    String photo;
    String названииеКинокомпании;
    int годРелиза;
    long бюджет;
    long сборы;
    boolean новыйФильм;

    public ComicsFilms(String title, String photo,String названииеКинокомпании,int годРелиза,long бюджет, long сборы, boolean новыйФильм) {
        this.title = title;
        this.photo = photo;
        this.названииеКинокомпании = названииеКинокомпании;
        this.годРелиза = годРелиза;
        this.бюджет = бюджет;
        this.сборы = сборы;
        this.новыйФильм = новыйФильм;
    }

    public String toString() {
        return title;
    }



}


