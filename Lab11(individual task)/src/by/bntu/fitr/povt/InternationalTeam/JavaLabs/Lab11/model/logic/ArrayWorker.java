package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab11.model.logic;

public class ArrayWorker {
    public static String MultiplicationOfPossitiveNumbers(int[] array){
        int Mul = 1;
        
        for(int i = 0; i < array.length; i++)
        {
            Mul *= array[i];
        }
        
        int sum = ArrayWorker.SumOfElements(array);
        
        return "The Multiplication of Elements is : " + Mul 
                + "\n The Sum of Elements before Minimum Element is : " + sum 
                + "\n";
    }
    
    public static int SumOfElements(int[] array){
        
        int indx = ArrayWorker.FindIndxOfMin(array);
        int sum = 0;
        
        for(int i = 0; i < indx; i++)
        {
            sum += array[i];
        }
        
        return sum;
    }
    
    public static int FindIndxOfMin(int[] array)
    {
        int MIN = array[0];
        int indx = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(MIN > array[i])
            {
                MIN = array[i];
                indx = i;
            }
        }
        
        return indx;
    }
}
