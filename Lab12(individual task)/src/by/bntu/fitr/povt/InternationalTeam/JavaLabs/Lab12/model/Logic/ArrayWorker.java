package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12.model.Logic;

import by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12.view.Printer;

public class ArrayWorker {
    public static void EvenColums(int[][] array){
      String s  = "";
      int i, j;
        
      for(i = 0; i < array.length; i++)
      {
          boolean f = true;
          
          for(j = 0; j < array.length; j++)
          {
              if(Math.abs(array[j][i]) % 2 == 1){
                  f = false;
                  break;
              }
          }
          
          if(f == true)
          {
              s += (Integer.toString(i) + " ");
          }
      }
      
      Printer.printColums(s);
      ArrayWorker.NegativeDiagonal(array);
    }
    
    public static void NegativeDiagonal(int[][] array){
        boolean f = false;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i][i] < 0)
            {
                int sum = 0;
                for(int j = 0; j < array.length; j++)
                {
                    sum += array[j][i];
                }
                
                Printer.printDiagonal(sum, i);
                f = true;
            }
        }
        
        if(!f)
        {
            Printer.print("\nAll the elements on the Main Diagonal is Positive!");
        }
    }
   
}
