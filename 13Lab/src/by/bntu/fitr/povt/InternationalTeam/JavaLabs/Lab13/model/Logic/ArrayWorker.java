package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.Logic;

//import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.view.Printer;
import java.util.Arrays;

public class ArrayWorker {
    public static String SortByCharacteristic(int[][] array)
	{
            int[] sumOfElements = new int[array.length];
            int[][] finalArray = new int[array.length][array.length]; 
            int INF = -1000000000;
        
            for(int i = 0; i < array.length; i++)
            {
                int sum = 0;
                for(int j = 0; j < array.length; j++)
                {
                    sum += Math.abs(array[j][i]);
                }

                sumOfElements[i] = sum;
            }
            
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
                
               // System.out.print(indx + " ");

                for(int j = 0; j < sumOfElements.length; j++)
                {
                    finalArray[i][j] = array[j][indx];
                }

                sumOfElements[indx] = INF;
            }		

            return (Arrays.deepToString(finalArray));
        }
}
