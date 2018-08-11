package cl.ejeldes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods from the bean
        System.out.println(theCoach.getDailyWork());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
