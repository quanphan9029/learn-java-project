package com.company;

import java.util.Scanner;
import com.company.Person;

import static com.company.Person.age;
import static com.company.Person.fullname;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao he so a,b,c cua phuong trinh bac 2 can giai:");
        System.out.print("He so a: ");
        int a = sc.nextInt();
        System.out.print("He so ba: ");
        int b = sc.nextInt();
        System.out.print
                ("He so c: ");
        int c = sc.nextInt();
        double x1 ,x2;
        double delta = (b*b) - (4*a*c) ;

        x1 = ((-1)*b + Math.sqrt(delta))/(2*a);
        x2 = ((-1)*b - Math.sqrt(delta))/(2*a);

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");

        }

        else if (delta == 0) {
            int x  = ((-1)*b)/(2*a);
            System.out.println("Phuong trinh co 1 nghiem kep.");
            System.out.println(x);
        }

        else {
            System.out.println("Phuong trinh co 2 nghiem phan biet.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        fullname();
        age();


    }
}
