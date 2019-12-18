package ru.geekbrains.java_one.lesson_5.home;

public class Horse extends Animal{

        public Horse (String name, String color, int age){
                super(name,color,age);
        }
        final int jumpLimit = 3;
        final int runLimit = 1500;
        final int swimLimit = 100;


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


