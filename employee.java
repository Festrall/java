package ru.geekbrains.java_one.lesson_d.home;


public class employee {
    private String name;
    private String position;
    private int age;
    private int salary;

    public employee(String name, String position, int age, int salary){
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary =salary;

    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }


    public int setSalary(){
        this.salary+=5000;
        return salary;
    }


}

/*
1Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
2Конструктор класса должен заполнять эти поля при создании объекта;
3Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
4Вывести при помощи методов из пункта 3 ФИО и должность.
5Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
6* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
7*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
 */