package ru.geekbrains.java_one.lesson_5.home;

public class Cat extends Animal {

    public Cat (String name, String color, int age){
        super(name,color,age);
    }
    final int jumpLimit = 2;
    final int runLimit = 200;



    @Override
    public boolean swim(int s){
        System.out.println("Коты не плавают!");
        return false;
    }

}
