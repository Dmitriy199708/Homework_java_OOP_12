package org.poster;

public class PosterManager {
    private String[] posters = new String[0];
    private int limitFilm;

    public PosterManager() {
        this.limitFilm = 5;
    }

    public PosterManager(int limitFilm) {
        this.limitFilm = limitFilm;
    }

    public void addNewFilm(String poster) {         //Добавление нового фильма
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        this.posters = tmp;
    }

    public String[] findAllFilm() {       //Вывод всех фильмов в порядке добавления
        return posters;
    }

    public String[] findLastFilm() {      //Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке
        int resultLength;
        if (posters.length < limitFilm) {
            resultLength = posters.length;
        } else {
            resultLength = limitFilm;
        }
        String[] tmp = new String[resultLength];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }

}
