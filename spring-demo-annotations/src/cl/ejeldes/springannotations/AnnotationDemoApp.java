package cl.ejeldes.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // load context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get beans
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach bootballCoach = context.getBean("footballCoach", Coach.class);

        // call beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        System.out.println(bootballCoach.getDailyWorkout());


        // close context
        context.close();

    }
}
