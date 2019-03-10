package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.util;

import java.util.Random;

public class ArrayInitializer {
    public static void rndInit(int[][] array, int min, int max){
        Random random = new Random();
        
        for(int i = 0; i < array.length; i++)
        {
              for(int j = 0; j < array.length; j++)
              {
                array[i][j] = random.nextInt(max - min + 1) + min; 
              }
        }
    }
}