package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("ЗАДАЧА 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] arrDouble = {1.57, 7.654, 9.986};

        char[] symbol = {'a', 'b', 'c'};


        System.out.println("ЗАДАЧА 2");

        for (int i = 0; i < numbers.length; i++) {
            if (i != 2) {
                System.out.print(numbers[i] + ", ");

            } else {
                System.out.println(numbers[i]);
            }
        }
        for (int i = 0; i < arrDouble.length; i++) {
            if (i != 2) {
                System.out.print(arrDouble[i] + ", ");

            } else {
                System.out.println(arrDouble[i]);
            }
        }
        for (int i = 0; i < symbol.length; i++) {
            if (i != 2) {
                System.out.print(symbol[i] + ", ");

            } else {
                System.out.println(symbol[i]);
            }

        }
        System.out.println("ЗАДАЧА 3");

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");

            } else {
                System.out.println(numbers[i]);
            }
        }
        for (int i = arrDouble.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrDouble[i] + ", ");

            } else {
                System.out.println(arrDouble[i]);
            }
        }
        for (int i = symbol.length - 1; i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(symbol[i] + ", ");

            } else {
                System.out.println(symbol[i]);
            }

        }

        System.out.println("ЗАДАЧА 4");

        for (int i = 0; i < numbers.length; i++) {
            if (i %2 == 0) {
                numbers[i] += +1;

                System.out.print(numbers[i] + " ");

        }
            else {
                System.out.print(+ numbers[i]+ " ");
            }
            }






    }
}