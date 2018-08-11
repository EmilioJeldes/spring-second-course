package cl.ejeldes.springdemo;

import cl.ejeldes.springdemo.service.FortuneService;

public class FutballlCoach implements Coach {

    private FortuneService fortuneService;

    public FutballlCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWork() {
        return "Practice how to pass the ball";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
