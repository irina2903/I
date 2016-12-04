package ru.irina.comicsfilms;

/**
 * Created by User on 12/3/2016.
 */
public class ComicsFilms {
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


