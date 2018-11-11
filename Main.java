package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("Input 2 numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        Calc c=new Calc();
        int d=c.Add(a,b);


        System.out.println("Result: "+d);

    }
}
