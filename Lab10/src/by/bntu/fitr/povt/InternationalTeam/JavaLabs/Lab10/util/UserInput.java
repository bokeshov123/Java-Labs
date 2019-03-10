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
                
    public static String inputInformation(String msg){
        System.out.print(msg);
        String value = scanner.nextLine();
        
        return value;
    }
     
}
