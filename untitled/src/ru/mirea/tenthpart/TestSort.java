package ru.mirea.tenthpart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TestSort {
    private static final ArrayList<Student> iDNumber = new ArrayList<>();

    public static void setArray(ArrayList<Student> iDNumber) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String name, surname, specialization, group;
            int course;
            System.out.println("Информация о студенте (имя, фамилия, специальность, группа, курс)");
            System.out.print("Имя: ");
            name = sc.nextLine();
            System.out.print("Фамилия: ");
            surname = sc.nextLine();
            System.out.print("Специальность: ");
            specialization = sc.nextLine();
            System.out.print("Группа: ");
            group = sc.nextLine();
            System.out.print("Курс: ");
            course = sc.nextInt();
            System.out.print("Полный балл: ");
            int scores = sc.nextInt();

            iDNumber.add(new Student(name, surname, specialization, group, course, scores));

            System.out.println("Добавить еще одного студента?\n1. Да\n2. Нет");
            if (sc.nextInt() == 1) {
                continue;
            } else {
                break;
            }
        }
    }

    public static void quickSort(ArrayList<Student> sortArr, int low, int high) {
        if (sortArr.size() == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        Student border = sortArr.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (sortArr.get(j).compareTo(border) < 0) j--;
            while (sortArr.get(i).compareTo(border) > 0) i++;
            if (i <= j) {
                Student swap = sortArr.get(i);
                sortArr.set(i, sortArr.get(j));
                sortArr.set(j, swap);
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    public static void selectionSort(Student[] list) {
        for (int i = 0; i < list.length; i++) {
            int pos = i;
            Student min = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(min) < 0) {
                    pos = j;
                    min = list[j];
                }
            }
            list[pos] = list[i];
            list[i] = min;
        }
    }

    public static void outArray(ArrayList<Student> iDNumber) {
        System.out.println(iDNumber);
    }

    public static void sortBy(ArrayList<Student> arr) {
        System.out.println("""
                Параметр соритровки:
                1. Имя
                2. Фамилия
                3. Специальность
                4. Группа
                5. Курс
                6. Баллы
                """);
        int choose = new Scanner(System.in).nextInt();

        switch (choose) {
            case 1 -> arr.sort(Comparator.comparing(Student::getName));
            case 2 -> arr.sort(Comparator.comparing(Student::getSurname));
            case 3 -> arr.sort(Comparator.comparing(Student::getSpecialization));
            case 4 -> arr.sort(Comparator.comparing(Student::getGroup));
            case 5 -> arr.sort(Comparator.comparing(Student::getCourse));
            case 6 -> arr.sort(Comparator.comparing(Student::getScores));
        }

        arr.forEach(System.out::println);

    }

    public static void main(String[] args) {
        iDNumber.add(new Student("Иван","Буленко","ИВТ", "КВБО-07-21",2,252));
        sortBy(iDNumber);
    }
}