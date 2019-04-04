/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab10.util;

import java.util.Scanner;


public class UserInput {
    static Scanner scanner = new Scanner(System.in);
                
    public static String inputStr(String msg){
        System.out.print(msg);
        String value = scanner.nextLine();
        
        return value;
    }
    
    public static int inputInt(String msg){
        System.out.print(msg);
        int value = scanner.nextInt();
        
        return value;
    }
    
    public static float inputFloat(String msg){
        System.out.print(msg);
        float value = scanner.nextFloat();
        
        return value;
    }
     
}
