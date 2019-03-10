/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12.Controller;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12.util.ArrayInitializer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12.view.Printer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12.model.Logic.ArrayWorker;


import java.util.Scanner;
import java.util.Arrays;

public class Lab12IndividualTask {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of the matrix: \n");
        int n = scanner.nextInt();
        
        int[][] array = new int[n][n];
        ArrayInitializer.rndInit(array, -100, 100);
        ArrayWorker.EvenColums(array);
        
        Printer.print("\nArray" + Arrays.deepToString(array));
    }
    
}
