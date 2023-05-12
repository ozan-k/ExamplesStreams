package org.example;

import java.security.SecureRandom;

public class Ex16 {
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Exercise ~ with loop
    public static void main(String[] args) {
        int[] results = new int[6];
        //Random r = new Random();
        SecureRandom r = new SecureRandom();
        for (int i=0;i<6000000;i++){
            results[r.nextInt(6)]++;
        }
        for (int i=0;i<6;i++){
            System.out.println((i+1) + " : " + results[i]);
        }
    }
}
