package ru.geekbrains.java_one.lesson_5.home;

public class Bird extends Animal{

    public Bird (String name, String color, int age){
        super(name,color,age);
    }
    final int jumpLimit = 2;
    final int runLimit = 300;


    @Override
    public boolean swim(int s){
        System.out.println("Птицы не плавают!");
        return false;
    }

}
