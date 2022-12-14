package ru.mirea.ninthpart;

import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Student[] students = new Student[]{
                new Student(3, 321),
                new Student(165, 32),
                new Student(322, 543),
                new Student(9, 43)
        };
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("");
        insertionSort(students);
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("");
        qSort(students, students.length-1, 0);
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\n");
        Student[] students2 = new Student[]{
                new Student(2, 432),
                new Student(76, 386),
                new Student(74, 254),
                new Student(14, 65)
        };
        Student[] allStudents = new Student[students.length + students2.length];
        System.arraycopy(students, 0, allStudents,0,students.length);
        System.arraycopy(students2, 0, allStudents,students.length, students2.length);
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void insertionSort(Student[] arr){
        Student temp;
        for (int i = 1; i < arr.length; i++) {
            Student current = arr[i];
            int j = i-1;
            for(; j >= 0 && current.compareTo(arr[j]) < 0; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = current;
        }
    }

    private  static SortingStudentsByGPA comp = new SortingStudentsByGPA();
    public static void qSort(Object[] array, int high, int low){
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }

}



class Student implements Comparable{
    private int idNum, GPA;

    public Student(int idNum, int GPA) {
        this.idNum = idNum;
        this.GPA = GPA;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNum=" + idNum +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student))
            throw new IllegalArgumentException("???????????? ???? ???????????????? ??????????????????!");
        return this.idNum - ((Student) o).idNum;
    }
}

class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Student && o2 instanceof Student))
            throw new IllegalArgumentException("?????????????? ???? ???????????????? ????????????????????!");
        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }
}