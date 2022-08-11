import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
        int matrixSize, i, j;

        try {
          System.out.println("This project is done with two square arrays of size n");
          System.out.print("Please indicate the size of the matrix 'M': ");
          matrixSize = inputs.nextInt();

          int[][] matrix1 = new int[matrixSize][matrixSize];
          int[][] matrix2 = new int[matrixSize][matrixSize];

          int[][] resultMatrix = new int[matrixSize][matrixSize];

          for (i = 0; i < matrix1.length; i++) {
            for(j = 0; j < matrix1.length; j++) {
              System.out.print("Type de value for row " + i + " and column " + j + " of the matrix 1 : " );
              matrix1[i][j] = inputs.nextInt();

              System.out.print("Type de value for row " + i + " and column " + j + " of the matrix 2 : " );
              matrix2[i][j] = inputs.nextInt();

              resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
          }

          System.out.println("Matrix 1");
          readMatrix(matrix1);

          System.out.println("Matrix 2");
          readMatrix(matrix2);

          System.out.println("Result Matrix");
          readMatrix(resultMatrix);

        } catch(Exception ex) {
          System.out.println("An error has ocurred" + ex.getMessage());
        } finally {
          inputs.close();
        }    
        
    }

    public static void readMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          System.out.print(matrix[i][j] + " ");
        }

        System.out.println("");
      }
    }
}
