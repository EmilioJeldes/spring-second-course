package cl.ejeldes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // load beans
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);


        // use the beans
//        System.out.println(theCoach.getDailyWork());
//        System.out.println(theCoach.getDailyFortune());
//
//        System.out.println(alphaCoach.getDailyWork());
//        System.out.println(alphaCoach.getDailyFortune());
        boolean result = theCoach.equals(alphaCoach);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nIn memory location for theCoach: " + theCoach);
        System.out.println("\nIn memory location for theCoach: " + alphaCoach);

        // close context
        context.close();
    }
}
