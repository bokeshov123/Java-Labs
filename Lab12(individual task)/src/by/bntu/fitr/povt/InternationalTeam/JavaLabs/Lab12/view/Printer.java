package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab12.view;

public class Printer {
    public static void print(String msg)
    {
        System.out.print(msg);
    }
    
    public static void printColums(String msg){
        
        if(msg.length() > 0)
        {
            System.out.print("\nAll Elements of these colums is even: " + msg);
        }
        else 
        {
            System.out.print("\nThere is no colums where all elements are even!");
        }
    }
    
    public static void printDiagonal(int sum, int column){
        System.out.print("\nThe " + column + " column has negative "
            + "element on main diagonal and the "
            + "sum of all the elements " + sum);
    }
}
