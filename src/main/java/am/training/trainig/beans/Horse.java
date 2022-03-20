package am.training.trainig.beans;

public class Horse {

    private String beard;

    private int raceNumber;

    private String rider;

    public Horse(String beard, int raceNumber, String rider) {
        this.beard = beard;
        this.raceNumber = raceNumber;
        this.rider = rider;
    }

    public String getBeard() {
        return beard;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public String getRider() {
        return rider;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "beard='" + beard + '\'' +
                ", raceNumber=" + raceNumber +
                ", rider='" + rider + '\'' +
                '}';
    }
}
