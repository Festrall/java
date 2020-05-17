package JavaOOP.lesson2;

public class Human implements Participants{
    protected String name;
    protected double maxJump;
    protected double maxRun;

    public Human(String name, double maxJump, double maxRun){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public double getMaxJump() {
        return maxJump;
    }

    @Override
    public double getMaxRun() {
        return maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

}
