package ru.geekbrains.java_one.lesson_d.home;

public class Main {


    public static void main(String[] args){
        employee[] peopleList = new employee[5];
        peopleList[0] = new employee("George","Manager",45,42000);
        peopleList[1] = new employee("Alex","Workerer",36,35000);
        peopleList[2] = new employee("Mikhael","Chef",41,28000);
        peopleList[3] = new employee("Vadim","Workerer",28,31000);
        peopleList[4] = new employee("Petr","Developer",47,34000);

        for (int i=0;i<peopleList.length;i++) {
            if (peopleList[i].getAge() >= 40) {
                System.out.println("Name: " + peopleList[i].getName() + " Position: " + peopleList[i].getPosition()
                        + " Age: " + peopleList[i].getAge());
            }
        }




      for (int i=0;i<peopleList.length;i++) {
          if (peopleList[i].getAge() >= 45) {
              peopleList[i].setSalary();
              System.out.println("Name: " + peopleList[i].getName() + " New salary: " + peopleList[i].getSalary());
          }
      }

    }


}






