package cl.ejeldes.service;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today you will have a lucky day";
    }
}
