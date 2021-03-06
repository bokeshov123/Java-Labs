/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.Controller;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.util.ArrayInitializer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.view.Printer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.model.Logic.ArrayWorker;


import java.util.Scanner;
import java.util.Arrays;

public class Lab12IndividualTaskB {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of the matrix: \n");
        int n = scanner.nextInt();
        
        int[][] array = new int[n][n];
        ArrayInitializer.rndInit(array, -10, 10);
        
        System.out.print("Enter 1 if you want to delete Maximum elements\n");
        System.out.print("Enter 2 if you want to delete Minimum elements\n");
        int k = scanner.nextInt();
        
        ArrayWorker.Sort(array, k);
        
        Printer.print("\nArray" + Arrays.deepToString(array));
    }
    
}
