package ru.mirea.sixthpart.task6;

public class Computer {

    private final Memory memory;
    private final Monitor monitor;
    private final Processor processor;
    private final ComputerTypes type;

    public Computer(Memory memory, Processor processor, Monitor monitor, ComputerTypes type) {
        this.memory = memory;
        this.processor = processor;
        this.monitor = monitor;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer[memory: " + memory + "\n" +
                ", processor: " + processor + "\n" +
                ", monitor: " + monitor + "\n" +
                ", type: " + type + "]";
    }

    public Memory getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public ComputerTypes getType() {
        return type;
    }

}