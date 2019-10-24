package com.company;
import java.util.Scanner;

class Person {
    private static Scanner sc = new Scanner(System.in);
    static void fullname() {
        System.out.println("Nhap ho va ten: ");
        String name = sc.next();
    }

    static void age() {
        System.out.println("Nhap tuoi cua ban: ");
        int age;
        age = sc.nextInt();
    }
}
