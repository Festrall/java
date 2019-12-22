package ru.geekbrains.java_one.lesson_7.home;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            FileOutputStream fos1 = new FileOutputStream("part1.txt");
            PrintStream ps1 = new PrintStream(fos1);
            ps1.println("This is first text what should be linked with another ");
            fos1.close();

            FileOutputStream fos2 = new FileOutputStream("part2.txt");
            PrintStream ps2 = new PrintStream(fos2);
            ps2.println(" text, that was added here, because of information problems!");
            fos2.close();
            /*
            "Нас не устаивает - так как записывает ссылку, а не текст"
            FileOutputStream fos3 = new FileOutputStream("part3.txt", true);
            PrintStream ps3 = new PrintStream(fos3);
            ps3.println(fos1 + " " + fos2);
            fos3.close();


            FileInputStream fis1 = new FileInputStream("part3.txt");
            Scanner sc1 = new Scanner(fis1);
            while (sc1.hasNext()) {
                System.out.print(sc1.nextLine());
            }
            fis1.close();
            */
            file("part1.txt");
            file("part2.txt");
            findWord("another");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


    private static void file(String fos1) {
        try {
            FileInputStream fis1 = new FileInputStream(fos1);
            Scanner sc1 = new Scanner(fis1);
            while (sc1.hasNext()) {
                System.out.print(sc1.nextLine());
            }
            fis1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void findWord(String x) {
        File file;
        file = new File("D:\\Project\\java\\part4.txt");
            if ((file).equals(x)) {
            System.out.println("Файл содержит слово " + "another");
        }
    }
    /*
    private boolean findWord(x){
        File file;
        file = new File("D:\\Project\\java\\part3.txt");
        if(file.equals(x)){
            System.out.println("Файл содержит слово "+ "another");
        }
        return false;
    }

     */



}
    /*
    1.Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);+
    2.Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.+
    3.* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей)
    4.** Написать метод, проверяющий, есть ли указанное слово в папке
     */