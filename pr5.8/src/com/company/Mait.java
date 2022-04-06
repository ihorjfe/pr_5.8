package com.company;
import java.util.Scanner;
//завдання 2
public class Mait {

    public static void main(String[] args) {
        System.out.println("Введіть трьох значне число :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 100 % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a>b){
            if (a>c){
                System.out.println("Найбільше число : "+a);
            }else{
                System.out.println("Найбільше число : "+c);
            }
        }else if (b>c){
            System.out.println("Найбільше число : "+b);
        }else{
            System.out.println("Найбільше число : "+c);
        }
    }
}









