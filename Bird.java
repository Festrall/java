package ru.geekbrains.java_one.lesson_5.home;

public class Bird extends Animal{

    public Bird (String name, String color, int age){
        super(name,color,age);
    }
    final int jumpLimit = 1;
    final int runLimit = 5;


    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }



    @Override
    public boolean swim(int s){
        System.out.println("Птицы не плавают!");
        return false;
    }

}
