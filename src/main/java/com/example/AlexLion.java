package com.example;

import java.util.List;

public class AlexLion extends Lion {
    private final Feline feline;

    public AlexLion(String sex, Feline feline) throws Exception {
        super("Самец", new Feline());
        this.feline = feline;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        // У Алекса нет львят
        return 0;
    }

}
