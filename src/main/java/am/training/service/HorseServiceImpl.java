package am.training.service;

import am.training.trainig.beans.Horse;

import java.util.List;

public class HorseServiceImpl implements HorseService{

    private List<Horse> horses;

    public HorseServiceImpl(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
