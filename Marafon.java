package JavaOOP.lesson2;
/*
        -Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        -Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

        Создайте два класса: беговая дорожка и стена, при прохождении через которые,
        участники должны выполнять соответствующие действия (бежать или прыгать),
        результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.

        Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
*/
public class Marafon {

    public static void main (String [] args) {
        Cat c = new Cat("Kuzia", 2.0, 50.2);
        Human h = new Human("Руслан", 3.0, 1000);
        Robot r = new Robot("PX-01", 1.0, 2000);
        Wall w = new Wall(2.0);
        Track t = new Track(200);
        Participants[] meParticipants = {r,h,c};
        Obstacles[] meObstacles = {w,t};


        for (int i = 0; i < meParticipants.length ;i++){
                String  nameString  = meParticipants[i].getName() + " " + "может ";
                String eventName = String.format("подпрыгнуть максимум на %.2fm. Пробует прыгнуть на ", meParticipants[i].getMaxJump());
                String eventResult = (meObstacles[i].barrier(meParticipants[i])) ? " успешно" : " неудачно";
                System.out.println(nameString + eventName + w.height + " м. Результат" + eventResult);
                String eventName2 = String.format("подпрыгнуть максимум на %.2fm. Пробует пробежать  ", meParticipants[i].getMaxRun());
                String eventResult2 = (meObstacles[i].barrier(meParticipants[i])) ? " успешно" : " неудачно";
                System.out.println(nameString + eventName2 + t.distance + " м. Результат" + eventResult2);
        }




    }


}
