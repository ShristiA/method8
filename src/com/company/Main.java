package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

//	int a = randomMethod();
//        System.out.println(a);
//        System.out.println(randomMethod());
        randomMethod();
    }
    public static int randomMethod(){
        int x = 0 ;
        Random r = new Random();
        for(int i = 0; i<5; i++) {
            x = 1 + r.nextInt(5);
            System.out.println(x);
        }
        return x;

    }
}
