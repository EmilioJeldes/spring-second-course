package cl.ejeldes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCicleApp {

    public static void main(String[] args) {

        // load context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCicle-applicationContext.xml");

        // get beans
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // use the beans
        System.out.println(theCoach.getDailyWork());
        System.out.println(theCoach.getDailyFortune());

        // close context
        context.close();
    }
}
