package ru.mirea.sixthpart.task6;

public class Processor implements Accessories {

    private final int freq;
    private final String name;

    public Processor(int freq, String name) {
        this.freq = freq;
        this.name = name;
    }

    public int getFreq() {
        return freq;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println(freq + ", " + name);
    }

    @Override
    public String toString() {
        return "Processor[Частота = " + freq + ", производитель = " + name + "]";
    }
}