package ru.geekbrains.Java_one.lesson_4.home;



public class Main {

    /*
    1   Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    2   Конструктор класса должен заполнять эти поля при создании объекта;
    3   Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    4   Вывести при помощи методов из пункта 3 ФИО и должность.
    5   Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    6   * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    7   *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный
         уникальный идентификационный порядковый номер
     */
    public static void main(String[] args) {
        employee[] peopleList = new employee[5];
        peopleList[0] = new employee("Artem","Manager",45,39000);
        peopleList[1] = new employee("Vasya","Tester",38,40000);
        peopleList[2] = new employee("Mikhael","Chef",29,34000);
        peopleList[3] = new employee("Vlad","Developer",46,60000);
        peopleList[4] = new employee("Petr","Tester",45,42000);

        for(int i=0;i<peopleList.length;i++){
            if(peopleList[i].getAge()>40) {
                System.out.println("Name: "+ peopleList[i].getName()+ " Position: "+ peopleList[i].getPosition());
            }
        }

        for(int i=0;i<peopleList.length;i++) {
            if (peopleList[i].getAge() >= 45){
                peopleList[i].setSalary();
                System.out.println("Name: "+ peopleList[i].getName()+ " Position: "+ peopleList[i].getPosition()+
                        " New salary: "+ peopleList[i].getSalary());
            }


        }
    }
}

