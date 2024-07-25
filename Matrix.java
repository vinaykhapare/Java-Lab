import java.util.Scanner;
 
public class Matrix
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter The Number Of Rows");
         
        int row = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int cols = sc.nextInt();
        
        int[][] matrix1 = new int[row][cols];
        int[][] matrix2 = new int[row][cols];
        int[][] sum = new int[row][cols];
        int[][] sub = new int[row][cols];
        System.out.println("Enter First Matrix Data");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
         
 
        System.out.println("Enter Second Matrix Data");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("Enter Your Choise:");
        int num = sc.nextInt();
        switch (num) {
            case 1:
            System.out.println("Addition is ");
         
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                     
                    System.out.print(sum[i][j]+"\t");
                }
                 
                System.out.println();
            }
                break;
            
            case 2 :
            System.out.println("Substraction is  ");
         
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    sub[i][j] = matrix1[i][j] - matrix2[i][j];
                     
                    System.out.print(sub[i][j]+"\t");
                }
                 
                System.out.println();
            }
        
            default:
                break;
        }
        
    }
}