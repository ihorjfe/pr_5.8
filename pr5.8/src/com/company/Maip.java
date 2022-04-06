package com.company;
import java.util.Scanner;
//завдання 3
public class Maip {
    public static void main(String[] args) {
        System.out.println("На який поверх бажаєте потрапити? ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = n;
        System.out.println("Ви вказали поверх "+n);
        if (a==1){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else if (n==2){
            System.out.println("Ви піднялись на "+(n+1)+ " поверх (Другий поверх не працює)");
        }else if (n==3){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else if (n==4){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else if (n==5){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else if (n==6){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else if (n==7){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else if (n==8){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else if (n==9){
            System.out.println("Ви піднялись на "+n+ " поверх");
        }else{
            System.out.println("Помилка");
        }


        System.out.println("На який поверх бажаєте потрапити? ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("Ви вказали поверх "+b);
        if (b==2){
            System.out.println("Ви спустились на "+(b-1)+" (Другий поверх не працює)");
        if (b<n){
            System.out.println("Ви спустились на "+b+" поверх");
            }
        }else{
            System.out.println("Ви піднялись на "+b+" поверх");
        }

    }
}
