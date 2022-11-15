package ru.mirea.thirdpart.formating;

public class Employee {

    private String name = "Surname Name";
    private double salary  = 0.0;

    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public String getname() {
        return name;
    }

    public double getsalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "{name: " + name + ", salary = " + salary + "}";
    }

}

class Report {

    public Report(Employee[] currArr) { }

    static void generateReport(Employee[] currArr) {
        System.out.println("Report: ");
        for (int i = 0; i < currArr.length; i++) {
            System.out.println(currArr[i]);
        }
    }
}

class checkerMain {

    public static void main(String[] args) {

        Employee firstWorker = new Employee("QQQQ WWWW", 100000);
        Employee secondWorker = new Employee("EEEE RRRR", 80000);
        Employee thirdWorker = new Employee("TTTTT YYYY", 70000);
        Employee fourthWorker = new Employee("QWERTY QWERTY", 130000);
        Employee fifthWorker = new Employee("NEW EMP", 900000);

        Employee[] subArr = new Employee[5];
        subArr[0] = firstWorker;
        subArr[1] = secondWorker;
        subArr[2] = thirdWorker;
        subArr[3] = fourthWorker;
        subArr[4] = fifthWorker;

        Report currentRep = new Report(subArr);
        currentRep.generateReport(subArr);

    }

}