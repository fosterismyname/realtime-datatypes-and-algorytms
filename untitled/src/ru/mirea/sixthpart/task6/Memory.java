package ru.mirea.sixthpart.task6;

import java.util.RandomAccess;

public class Memory implements Accessories {

    private final int RAMCapacity;
    private final int ROMCapacity;

    public Memory(int RAMcapacity, int ROMcapacity) {
        this.RAMCapacity = RAMcapacity;
        this.ROMCapacity = ROMcapacity;
    }

    public int getRAMCapacity() {
        return RAMCapacity;
    }

    public int getROMCapacity() {
        return ROMCapacity;
    }

    public void getInfo() {
        System.out.println(ROMCapacity + ", " + RAMCapacity);
    }

    @Override
    public String toString() {
        return "Memory[ROM capacity = " + ROMCapacity + ", RAM capacity = " + RAMCapacity + "]";
    }
}