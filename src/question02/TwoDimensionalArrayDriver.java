/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class TwoDimensionalArrayDriver {
     
    public static void main(String[] args) {
        System.out.println("Question:2 By Venkat Sai Jarugula");
        Scanner scanner = new Scanner(System.in);
        int[][] m1 = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = scanner.nextInt();
            }
        }
        int[][] m2 = new int[3][3];
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = scanner.nextInt();
            }
        }
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        ArrayList<Boolean> matchResultList = new ArrayList<>();
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                matchResultList.add(m1[row][col] == m2[row][col]);
            }
        }
        return !matchResultList.contains(false);
    }
}
