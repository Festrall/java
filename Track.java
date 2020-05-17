package JavaOOP.lesson2;

public class Track implements Obstacles{
    protected double distance;

    public Track(double distance){
        this.distance = distance;
    };

    @Override
    public boolean barrier(Participants nextParticipant) {
        return  (nextParticipant.getMaxRun()>=distance);

    }


}
