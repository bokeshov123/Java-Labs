package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.model.Logic;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.util.ArrayInitializer;
import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12B.view.Printer;
import java.util.Arrays;

public class ArrayWorker {
    public static void FindMax(int[][] array){
    
        int MAX = array[0][0];

        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(MAX < array[i][j])
                {
                    MAX = array[i][j];
                }
            }  
        }      

        DeleteRowAndColumn(MAX, array);
    }
    
    public static void FindMin(int[][] array){

        int MIN = array[0][0];
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(MIN > array[i][j])
                {
                    MIN = array[i][j];
                }
            }  
        }      
        
        DeleteRowAndColumn(MIN, array);
    }
    
    public static void DeleteRowAndColumn(int value, int[][] array){
        int[][] BooleanMatrix = new int[array.length][array.length];
        int count = 0;
        
        ArrayInitializer.rndInit(BooleanMatrix, 1, 1);
        
        for(int i = 0; i < array.length; i++)
        {   
            for(int j = 0; j < array.length; j++)
            {
                if(array[i][j] == value)
                {
                     for(int k = 0; k < array.length; k++)
                     {
                         BooleanMatrix[i][k] = 0;
                         BooleanMatrix[k][j] = 0;
                     }
                }
            }
        }
        
        for(int i = 0; i < BooleanMatrix.length; i++)
        {   
            int row = 0;
            
            for(int j = 0; j < BooleanMatrix.length; j++)
            {
                row += BooleanMatrix[i][j];
            }
           
            if(row == 0)
            {
                count++;
            }
        }
        /*
        for(int i = 0; i < BooleanMatrix.length; i++)
        {   
            
            for(int j = 0; j < BooleanMatrix.length; j++)
            {
                System.out.print(BooleanMatrix[i][j] + " ");
            }
            
            System.out.print("\n");
        }
        
        System.out.print(array.length - count);
        */
        
        int[][] array2 = new int[array.length - count][array.length - count];
        int k = 0;
        
        for(int i = 0; i < BooleanMatrix.length; i++)
        {   
            boolean f = false;
            int m = 0;
            
            for(int j = 0; j < BooleanMatrix.length; j++)
            {
                if(BooleanMatrix[i][j] == 1)
                {
                    array2[k][m++] = array[i][j];
                    f = true;
                }
            }
        
            if(f)
            {
                k++;
            }
        }
        
        Printer.print("\nArray" + Arrays.deepToString(array2));
    }
}
