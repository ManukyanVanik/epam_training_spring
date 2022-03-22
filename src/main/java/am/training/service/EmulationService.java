package am.training.service;

import am.training.trainig.beans.Horse;
import am.training.trainig.beans.Race;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class EmulationService {

    RaceService raceService;

    public EmulationService(RaceService raceService) {
        this.raceService = raceService;
    }

    public void run() {

        Race race = raceService.getRace();
        race.setStartDate(LocalDate.now());
        Random random = new Random(race.getLength());
        int count  = 0;
        while (count<10){
            for(Horse horse:race.getParticipatingHorses()){
                System.out.println("Horse " +horse.getRaceNumber() +" position: "+
                        random.longs(0,race.getLength()).findFirst().getAsLong());
            }

            sleep();
            count++;
        }

    }

    private void sleep() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("not sleep");
        }
    }

    @Override
    public String toString() {
        return "EmulationService{" +
                "raceService=" + raceService +
                '}';
    }
}