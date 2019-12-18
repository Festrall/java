package ru.geekbrains.java_one.lesson_5.home;

public class Dog extends Animal{

    public Dog (String name, String color, int age){
        super(name,color,age);
    }
    final int jumpLimit = 2;
    final int runLimit = 300;
    final int swimLimit = 10;


    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public int getSwimLimit(){
        return swimLimit;
    }



}
