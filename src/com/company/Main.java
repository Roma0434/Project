package com.company;

import Herbivores.*;

import Predators.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Boar boar = new Boar();
        Buffalo buffalo = new Buffalo();
        Caterpillar caterpillar = new Caterpillar();
        Deer deer = new Deer();
        Duck duck = new Duck();
        Goat goat = new Goat();
        Horse horse = new Horse();
        Mouse mouse = new Mouse();
        Rabbit rabbit = new Rabbit();
        Sheep sheep = new Sheep();
        Bear bear = new Bear();
        Eagle eagle = new Eagle();
        Fox fox = new Fox();
        Snake snake = new Snake();
        Wolf wolf = new Wolf();

//       Animal[] animals = new Animal[14];
//
//        animals[0] = new Bear();
//        animals[1] = new Buffalo();
//        animals[2] = new Horse();
//        animals[3] = new Caterpillar();
//        animals[4] = new Deer();
//        animals[5] = new Duck();
//        animals[6] = new Goat();
//        animals[7] = new Mouse();
//        animals[8] = new Rabbit();
//        animals[9] = new Sheep();
//        animals[10] = new Wolf();
//        animals[11] = new Eagle();
//        animals[12] = new Fox();
//        animals[13] = new Snake();
//
//
//        for (int i = 0; i < animals.length ; i++) {
//            System.out.println(animals[i]);
//
//        }

        Animal[][] animal = new Animal[20][20];

        for (int i = 0; i < animal.length; i++) {
            animal[i] = new Animal[20];

        }
        HashMap<Integer, String> myTable = new HashMap<>();
        myTable.put(0, "Wolf");
        myTable.put(1, "Snake");
        myTable.put(2, "Fox");
        myTable.put(3, "Bear");
        myTable.put(4, "Eagle");
        myTable.put(5, "Horse");
        myTable.put(6, "Deer");
        myTable.put(7, "Rabbit");
        myTable.put(8, "Mouse");
        myTable.put(9, "Goat");
        myTable.put(10, "Sheep");
        myTable.put(11, "Boar");
        myTable.put(12, "Buffalo");
        myTable.put(13, "Duck");
        myTable.put(14, "Caterpillar");

        int array [][] = new int[14][14];
        array[0][5] = 10;
        array[0][6] = 15;
        array[0][7] = 60;
        array[0][8] = 80;
        array[0][9] = 60;
        array[0][10] = 70;
        array[0][11] = 10;
        array[0][12] = 40;

        array[1][2] = 15;
        array[1][7] = 20;
        array[1][8] = 40;
        array[1][12] = 10;

        array[2][7] = 70;
        array[2][8] = 90;
        array[2][12] = 60;
        array[2][13] = 40;

        array[3][1] = 80;
        array[3][5] = 40;
        array[3][6] = 80;
        array[3][7] = 80;
        array[3][8] = 90;
        array[3][9] = 70;
        array[3][10] = 70;
        array[3][11] = 20;
        array[3][12] = 10;

        array[4][2] = 10;
        array[4][7] = 90;
        array[4][8] = 90;
        array[4][12] = 80;

        array[8][13] = 90;

        array[11][8] = 50;
        array[11][13] = 90;

        array[13][13] = 90;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.printf("%4d", (array[i][j]) );
            }
            System.out.println();

        }
    }















    Random random = new Random();
        
    }

