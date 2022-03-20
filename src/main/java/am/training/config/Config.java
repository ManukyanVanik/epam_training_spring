package am.training.config;

import am.training.service.*;
import am.training.trainig.beans.Horse;
import am.training.trainig.beans.Race;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class Config {

    @Bean
    public Horse horse() {
        return new Horse("araba", 50, "Ton");
    }

    @Bean
    public Race race1() {
        return new Race();
    }

    @Bean
    public EmulationService emulationService(RaceService raceService) {
        return new EmulationService(raceService);
    }

    @Bean
    public RaceService raceService(HorseService horseService){
        RaceService raceService = new RaceServiceImpl(horseService);
        return raceService;
    }

    @Bean
    public HorseService horseService(@Qualifier("horses") List<Horse> horses){
        HorseService horseService = new HorseServiceImpl(horses);
        return horseService;
    }

    @Bean("horses")
    public List<Horse> getHorses() {
        List<Horse> horses = new ArrayList<>();
        horses.add(horse());
        return horses;
    }

}

