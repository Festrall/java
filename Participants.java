package JavaOOP.lesson2;

public interface Participants {

    default void run(){
        System.out.println("бежит");
    };

    default void jump(){
        System.out.println("прыгает");
    };
    double getMaxJump();
    double getMaxRun();
    String getName();


}
