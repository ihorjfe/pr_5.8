package com.company;
import java.util.Scanner;
//завдання 1
public class Main1 {

    public static void main(String[] args) {
        System.out.print("Введіть будь-яке натуральне число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Ви ввели число " + n);
        if (n<=100 & n>=50){
            System.out.println("Число " + n + " не належить до проміжку (50;100)");
        }else {
            System.out.println("Число " + n + " не належить до проміжку (50;100)");
        }
    }
}
