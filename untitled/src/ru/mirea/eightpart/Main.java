package ru.mirea.eightpart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task8_1();
        task8_2();
        task8_3();
        task8_4();
        task8_5();
        task8_6();
        task8_7();
        task8_8();
        task8_9();
        task8_10();
        task8_11();
        task8_12();
        task8_13();
        task8_14();
        task8_16();
    }


    public static void firstArray(int number) {
        int step = 1;
        for (int i = 1; i < number + 1; i++) {
            System.out.print(step + " ");
            if (i == step * (step + 1) / 2) step = step + 1;
        }
    }

    public static void task8_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int num = in.nextInt();
        firstArray(num);
    }


    public static void secondArray(int number) {
        for (int i = 1; i < number + 1; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task8_2() {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int num = in.nextInt();
        secondArray(num);
    }


    public static void thirdArray(int a, int b) {
        if (a < b) {
            for (int i = a; i < b + 1; i++) {
                System.out.print(i + " ");
            }
        } else if (a > b) {
            for (int i = b ; i > a - 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(a);
        }
    }

    public static void task8_3() {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int firstNum = in.nextInt();
        System.out.print("b = ");
        int secondNum = in.nextInt();
        thirdArray(firstNum, secondNum);
    }


    public static int sum(int number) {
        int result = 0;
        while (number != 0) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }

    public static int brute(int power, int equ) {
        int counter = 0;
        for (int i = (int) Math.pow(10, power - 1); i < Math.pow(10, power); i++) {
            if (sum(i) == equ) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public static void task8_4() {
        Scanner in = new Scanner(System.in);
        System.out.print("k = ");
        int k = in.nextInt();
        System.out.print("s = ");
        int s = in.nextInt();
        System.out.println("Количество таких чисел = " + brute(k, s));
    }


    public static int sumDigits(int number) {
        int result = 0;
        if (number / 10 != 0) {
            return (number % 10 + sumDigits(number / 10));
        }
        else {
            return (number % 10);
        }
    }

    public static void task8_5() {
        Scanner in = new Scanner(System.in);
        System.out.print("number = ");
        int num = in.nextInt();
        System.out.println("Сумма цифр числа = " + sumDigits(num));
    }


    public static boolean trivChecker(int number, int d) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % d == 0) return false;
        if (number / 2 > d) return trivChecker(number, d + 1);
        return true;
    }

    public static void task8_6() {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int num = in.nextInt();
        String result = trivChecker(num, 2) ? "составное" : "простое";
        System.out.println("Введенное число " + result);
    }


    public static void factorize(int number, int d) {
        if (d > number / 2) {
            System.out.println(number + " ");
            return ;
        }
        if (number % d == 0) {
            System.out.println(d + " ");
            factorize(number / d, number);
        }
        else {
            factorize(number, d + 1);
        }
    }

    public static void task8_7() {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int num = in.nextInt();
        factorize(num, 2);
    }


    public static boolean palindrome(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;

        return palindrome(word.substring(1, word.length() - 1));
    }

    public static void task8_8() {
        Scanner in = new Scanner(System.in);
        System.out.print("str = ");
        String currWord = in.nextLine();
        String result = palindrome(currWord) ? "палиндром" : "не палиндром";
        System.out.println("Введенная строка "+ result);
    }


    public static int checker(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return checker(a, b - 1) + checker(a - 1, b - 1);
    }

    public static void task8_9() {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.println("Результат = " + checker(a, b));
    }


    public static int reverse(int number) {
        if (number / 10 == 0) {
            System.out.print(number);
            return number;
        }
        System.out.print(number % 10);
        return reverse(number / 10);
    }

    public static void task8_10() {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int num = in.nextInt();
        System.out.print("Результат = ");
        reverse(num);
    }


    public static int arrayChecker() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return arrayChecker() + n + m;
            } else {
                int l = in.nextInt();
                if (l == 1) {
                    return arrayChecker() + n + m + l;
                } else {
                    return n + m + l;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return arrayChecker() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void task8_11() {
        System.out.println(arrayChecker());
    }


    public static void firstArrCheck() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.print(n + " ");
                firstArrCheck();
            } else firstArrCheck();
        }
    }

    public static void task8_12() {
        firstArrCheck();
    }


    public static void secondArrCheck() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.print(n + " ");
            if (m > 0) {
                secondArrCheck();
            }
        }
    }

    public static void task8_13() {
        secondArrCheck();
    }

    public static void task8_14() {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int num = in.nextInt();
        reverse(num);
    }


    public static void thirdArrCheck(int maximum, int counter) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0) {
            if (num > maximum) {
                thirdArrCheck(num, 1);
            } else if (num == maximum) {
                thirdArrCheck(maximum, ++counter);
            } else {
                thirdArrCheck(maximum, counter);
            }
        }
        else {
            System.out.println("Результат = " + counter);
        }
    }

    public static void task8_16() {
        thirdArrCheck(0, 0);
    }
}

