package am.training.trainig.spring;
import am.training.service.EmulationService;
import am.training.trainig.beans.Horse;
import am.training.trainig.beans.Race;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("am.training");

        Horse race = context.getBean("horse", Horse.class);
        System.out.println(race);

        Race race1 = context.getBean("race1",Race.class);
        System.out.println(race1);


        EmulationService emulationService = context.getBean("emulationService" ,EmulationService.class);
        System.out.println(emulationService);
        emulationService.run();

    }
}