
/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.Controller;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.view.Printer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.util.ArrayInitializer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.Logic.ArrayWorker;
import java.util.Arrays;

import java.util.Scanner;

public class Lab13 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solution slv = new Solution();

        Printer.print("Input the size of the Matrix:");
        int n = scanner.nextInt();
        
        int[][] array = new int[n][n];
        ArrayInitializer.rndInit(array, -10, 10);
        
        ArrayWorker.SortByCharacteristic(array);
        
        //Printer.print("\nArray:" + Arrays.deepToString(array));
    }
    
}
