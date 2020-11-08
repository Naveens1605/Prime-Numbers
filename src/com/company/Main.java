package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Last number: ");
        int n = sc.nextInt();
        sc.close();
        if(n<=1){
            System.out.println( n + " is not prime or Composite");
        }
        else{
            for(int i = 2;i<=n;i++){
                boolean isTrue = false;
                for(int num = 2; num <=i/2; num++) {
                    if (i % num == 0) {
                        isTrue = true;
                        break;
                    }
                }
                if(!isTrue){
                    System.out.print(i + " ");
                }
            }
        }
    }
}

