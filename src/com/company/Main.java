package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int countPersons = 0;

        System.out.print("введите кол-во людей в комапнии ");
        countPersons = scanner.nextInt();

        int[] personsSalaries = new int[countPersons];

        for (int i = 0; i < personsSalaries.length; i++) {
            personsSalaries[i] = random.nextInt(100000 - 20000 + 1) + 20000;//random.nextInt(max - min + 1) + min;
        }

        for (int i = 0; i < personsSalaries.length; i++) {
            System.out.println(String.format("salary #%d = %d", i + 1, personsSalaries[i]));
        }

        for (int i = 0; i < personsSalaries.length; i++) {
            personsSalaries[i] = personsSalaries[i] + personsSalaries[i] / 10;
        }

        System.out.println("salary after increase on 10%");

//        for (int i = 0; i < personsSalaries.length; i++) {
//            if(personsSalaries[i]>50000) {
//                System.out.println(String.format("salary #%d = %d", i + 1, personsSalaries[i]));
//            }
//        }

        for (int i = 0; i < personsSalaries.length; i++) {
            System.out.println(String.format("salary #%d = %d", i + 1, personsSalaries[i]));
        }

    }
}
