package cl.ejeldes.springdemo;

import cl.ejeldes.springdemo.service.FortuneService;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CrocketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: inside setter method - setFortuneService");
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
    }


    public void setTeam(String team) {
        this.team = team;
        System.out.println("CricketCoach: inside setter method - setTeam");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWork() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
