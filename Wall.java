package JavaOOP.lesson2;

public class Wall implements Obstacles{
    protected double height;

    public Wall(double height){
        this.height = height;
    };

    @Override
    public boolean barrier(Participants nextParticipants) {
        return (nextParticipants.getMaxJump() >= height);
    }

}
