package am.training.service;

import am.training.trainig.beans.Race;

import java.time.LocalDate;

public class RaceServiceImpl implements RaceService {

    private HorseService horseService;


    public RaceServiceImpl(HorseService horseService){
        this.horseService = horseService;
    }

    @Override
    public Race getRace() {

        Race race = new Race();
        race.setLength(10);
        race.setParticipatingHorses(horseService.getHorses());
        race.setStartDate(LocalDate.of(2020, 6, 10));
        return race;
    }

    public HorseService getHorseService() {
        return horseService;
    }

    public void setHorseService(HorseService horseService) {
        this.horseService = horseService;
    }
}
