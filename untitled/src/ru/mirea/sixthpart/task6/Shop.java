package ru.mirea.sixthpart.task6;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    ArrayList<Computer> currArr;

    public Shop(ArrayList<Computer> currArr) {
        this.currArr = currArr;
    }

    public void deleteComputer(int index) {
        if (currArr.size() > 0) {
            if (!(currArr.size() - 1 >= index && index >= 0)) {
                currArr.remove(index);
            }
        } else {
            System.out.println("Магазин пуст!");
        }
    }

    public void showComputer(int index) {
        if (currArr.size() > 0) {
            System.out.println(currArr.get(index));
        } else {
            System.out.println("Магазин пуст!");
        }
    }

    public void fullInfo() {
        if (currArr.size() > 0) {
            for (Computer computer : currArr) {
                System.out.println(computer);
            }
        } else {
            System.out.println("Магазин пуст!");
        }
    }

    public void Search() {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите комплектующее для поиска (1 - Processor, 2 - Memory, 3 - Monitor): ");
        int checker = in.nextInt();
        switch(checker) {
            case 1:
                processorSearch();
                break;
            case 2:
                memorySearch();
                break;
            case 3:
                monitorSearch();
                break;
            default:
                System.out.println("Введите корректный параметр!");
                break;
        }
    }

    public void processorSearch() {
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите параметр поиска (1 - Частота, 2 - Производитель): ");
        int check = in.nextInt();

        if (check == 1) {

            System.out.print("Введите искомое значение: ");
            int frequency = in.nextInt();

            for (int i = 0; i < currArr.size(); i++) {
                if (currArr.get(i).getProcessor().getFreq() == frequency) {
                    System.out.println(currArr.get(i));
                    flag = true;
                }
                if (!flag) System.out.println("Ничего не удалось найти!");
            }
        } else if (check == 2) {

            System.out.print("Введите искомого производителя: ");
            String name = in.nextLine().toLowerCase();

            for (int i = 0; i < currArr.size(); i++) {
                if (currArr.get(i).getProcessor().getName().toLowerCase().equals(name)) {
                    System.out.println(currArr.get(i));
                    flag = true;
                }
            } if (!flag) System.out.println("Ничего не удалось найти");

        } else {
            System.out.println("Введите корректный параметр для поиска");
        }
    }

    public void memorySearch() {
        System.out.println("analogichno poisky po processory");
    }

    public void monitorSearch() {
        System.out.println("analogichno poisky po monitory");
    }
}