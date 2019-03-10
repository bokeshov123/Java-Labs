/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */
package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab11.Controller;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab11.util.ArrayInitializer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab11.model.logic.ArrayWorker;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab11.view.Printer;


import java.util.Scanner;
import java.util.Arrays;

public class Lab11IndividualTask {

    public static void main(String[] args) {
    
    System.out.print("Input the Size of the Vector:\n");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    int[] array = new int[n];
    ArrayInitializer.rndInit(array, -10, 10);
    String str = ArrayWorker.MultiplicationOfPossitiveNumbers(array);
    
    Printer.print("\nArray: " + Arrays.toString(array));
    Printer.print("\nArray: " + str);
    }
}
