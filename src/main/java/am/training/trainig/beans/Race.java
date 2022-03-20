package am.training.trainig.beans;

import java.time.LocalDate;
import java.util.List;

public class Race {

    private List<Horse> participatingHorses;
    private long length;
    private LocalDate startDate;

    public List<Horse> getParticipatingHorses() {
        return participatingHorses;
    }

    public void setParticipatingHorses(List<Horse> participatingHorses) {
        this.participatingHorses = participatingHorses;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Race{" +
                "participatingHorses=" + participatingHorses +
                ", length=" + length +
                ", startDate=" + startDate +
                '}';
    }
}
