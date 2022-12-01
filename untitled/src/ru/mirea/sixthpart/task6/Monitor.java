package ru.mirea.sixthpart.task6;

public class Monitor implements Accessories {

    private final int freq;
    private final String name;

    public Monitor(int freq, String name) {
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
        return "Monitor[Герцовка = " + freq + ", производитель = " + name + "]";
    }
}