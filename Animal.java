package ru.geekbrains.java_one.lesson_5.home;

public class Animal {
    private String name;
    private String color;
    private int age;
    final int jumpLimit = 2;
    final int runLimit = 300;
    final int swimLimit = 10;



    Animal(String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;

    }


    public boolean jump(int j) {
        if (j <= jumpLimit) {
            System.out.println(this.name + " перепрыгнул высоту в " + j + " метров.");
        }else System.out.println(name + " не перепрыгнул данную высоту!");
        return false;
    }
    public boolean run(int r) {
        if (r <= runLimit) {
            System.out.println(this.name + " пробежал дистанцию " + r + " метров.");
        }else System.out.println(name + " не пробежал дистанцию!");
        return false;
    }
    public boolean swim(int s) {
        if (s <= swimLimit) {
            System.out.println(this.name + " проплыл " + s + " метров.");
        }else System.out.println(name + " не проплыл!");
        return false;
    }
}

