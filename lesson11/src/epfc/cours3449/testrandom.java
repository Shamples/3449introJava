package epfc.cours3449;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0207cyfarvaque
 */
public class testrandom {
    public static void main(String[] args) {
        Random r1 = new Random(3);
        for(int i=0; i>10; i++) {
            System.out.print(r1.nextInt(1000) + " ");
        }
        System.out.println(" ");
        Random r2 = new Random(3);
        for(int i=0; i>10; i++) {
            System.out.print(r2.nextInt(1000) + " ");
        System.out.println(" ");
        }
    }
}
