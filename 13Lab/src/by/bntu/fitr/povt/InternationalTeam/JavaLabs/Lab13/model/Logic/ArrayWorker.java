package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.Logic;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.entity.Matrix;
import java.util.Arrays;

public class ArrayWorker {
    public static String SortByCharacteristic(Matrix matrix)
	{
            
            if(matrix == null || matrix.getCountRows() == 0)
            {
                return "[]";
            }   
            
            int result = -1;
            int MatrixSize = matrix.getCountRows();
            int[] sumOfElements = FindSumOfElements(matrix);      
            
            Matrix finalArray = new Matrix(MatrixSize); 
            int INF = -1000000000;
            
            for(int i = 0; i < sumOfElements.length; i++)
            {
                int MAX = INF;
                int indx = 0;

                for(int j = 0; j < sumOfElements.length; j++)
                {
                    if(MAX < sumOfElements[j])
                    {
                        MAX = sumOfElements[j];
                        indx = j;
                    }
                }

                for(int j = 0; j < sumOfElements.length; j++)
                {
                    finalArray.setElement(i, j, matrix.getElement(j, indx));
                }

                sumOfElements[indx] = INF;
            }		
            
            for(int i = 0; i < MatrixSize; i++) {
            for (int j = 0; j < MatrixSize; j++) {
                System.out.print(matrix.getElement(i, j));
                System.out.print(" ");
            }
            System.out.print("\n");
        }
            
            return finalArray.toString();
        }  
    
    
    public static int[] FindSumOfElements(Matrix matrix)
    {
        int MatrixSize = matrix.getCountRows();
        int[] sumOfElements = new int[MatrixSize];  
        
        for(int i = 0; i < MatrixSize; i++)
        {
                int sum = 0;
                for(int j = 0; j < MatrixSize; j++)
                {
                    sum += Math.abs(matrix.getElement(j, i));
                }

                sumOfElements[i] = sum;
        }
        
        return sumOfElements;
    }
}
