package ru.geekbrains.java_one.lesson_5.home;


public class Homework5 {

    public static void main(String[] args) {
        Horse horse = new Horse("Steeve", "brown", 3);
        Dog dog = new Dog("Bobik", "Black", 2);
        Cat cat = new Cat("Vasya", "checked", 5);
        Bird bird = new Bird("Tweete", "yellow", 1);

        Animal[] animalZoo = {dog, horse, cat, bird};


        for (int i = 0; i < animalZoo.length; i++) {
            if (animalZoo[i] instanceof Cat) {
                ((Cat) animalZoo[i]).getJumpLimit();
                ((Cat) animalZoo[i]).getRunLimit();
                ((Cat) animalZoo[i]).getSwimLimit();
                animalZoo[i].jump(2);
                animalZoo[i].swim(15);
                animalZoo[i].run(10);
            }
        }
        for (int i = 0; i < animalZoo.length; i++){
            if (animalZoo[i] instanceof Bird) {
                ((Bird) animalZoo[i]).getJumpLimit();
                ((Bird) animalZoo[i]).getRunLimit();
                ((Bird) animalZoo[i]).getSwimLimit();
                animalZoo[i].jump(1);
                animalZoo[i].swim(20);
                animalZoo[i].run(5);

            }
        }

        for (int i = 0; i < animalZoo.length; i++) {
            if (animalZoo[i] instanceof Horse) {
                ((Horse) animalZoo[i]).getJumpLimit();
                ((Horse) animalZoo[i]).getRunLimit();
                ((Horse) animalZoo[i]).getSwimLimit();
                animalZoo[i].jump(2);
                animalZoo[i].swim(50);
                animalZoo[i].run(1200);
            }
        }
        for (int i = 0; i < animalZoo.length; i++) {
            if (animalZoo[i] instanceof Dog) {
                ((Dog) animalZoo[i]).getJumpLimit();
                ((Dog) animalZoo[i]).getRunLimit();
                ((Dog) animalZoo[i]).getSwimLimit();
                animalZoo[i].jump(2);
                animalZoo[i].swim(9);
                animalZoo[i].run(199);
            }

        }

    }
}
    /*
    Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
    Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.+

    В качестве параметра каждому методу передается величина, означающая или длину
    препятствия (для бега и плавания), или высоту (для прыжков).+

    У каждого животного есть ограничения на действия
    (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
     прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
      плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).+

    При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
    (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')+

    Добавить животным разброс в ограничениях.
    То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
     */

