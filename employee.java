package ru.geekbrains.Java_one.lesson_4.home;

public class employee {
    private String name;
    private String position;
    private int age;
    private int salary;


    public employee(String name, String position,int age,int salary){
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;

    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
    public int setSalary(){
        if(age>=45){
            salary+=5000;
        }
        return salary;
    }
}

