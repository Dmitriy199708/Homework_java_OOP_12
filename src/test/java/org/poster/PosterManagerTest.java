package org.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    @Test
    public void test(){
        PosterManager manager = new PosterManager();

        manager.addNewFilm("Дурдом");
        manager.addNewFilm("Тупой еще Тупее");
        manager.addNewFilm("Как я научился (не научился) программировать");
        String[] actual = manager.findAllFilm();
        String[] expected = {"Дурдом","Тупой еще Тупее", "Как я научился (не научился) программировать"};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void displayingMoviesInReverseOrder7(){
        PosterManager manager = new PosterManager(7);
        manager.addNewFilm("Дурдом");
        manager.addNewFilm("Тупой еще Тупее");
        manager.addNewFilm("Как я научился (не научился) программировать");
        manager.addNewFilm("1");
        manager.addNewFilm("2");
        manager.addNewFilm("3");
        manager.addNewFilm("4");
        manager.findLastFilm();


        String[] actual = manager.findLastFilm();

        String[] expected = {"4","3","2","1", "Как я научился (не научился) программировать","Тупой еще Тупее","Дурдом" };
        Assertions.assertArrayEquals(expected ,actual);
    }

    @Test
    public void displayingMoviesInReverseOrder5(){
        PosterManager manager = new PosterManager();
        manager.addNewFilm("Дурдом");
        manager.addNewFilm("Тупой еще Тупее");
        manager.addNewFilm("Как я научился (не научился) программировать");
        manager.addNewFilm("1");
        manager.addNewFilm("2");
        manager.findLastFilm();


        String[] actual = manager.findLastFilm();

        String[] expected = {"2","1", "Как я научился (не научился) программировать","Тупой еще Тупее","Дурдом" };
        Assertions.assertArrayEquals(expected ,actual);
    }
    @Test
    public void displayingMoviesInReverseOrder4(){
        PosterManager manager = new PosterManager();
        manager.addNewFilm("Дурдом");
        manager.addNewFilm("Тупой еще Тупее");
        manager.addNewFilm("Как я научился (не научился) программировать");
        manager.addNewFilm("1");

        manager.findLastFilm();


        String[] actual = manager.findLastFilm();

        String[] expected = {"1", "Как я научился (не научился) программировать","Тупой еще Тупее","Дурдом" };
        Assertions.assertArrayEquals(expected ,actual);
    }






}