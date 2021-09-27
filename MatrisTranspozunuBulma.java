
package matristranspozunubulma;

public class MatrisTranspozunuBulma {

    public static void main(String[] args) {
       int[][] arr = { { 1, 2 }, { 3, 4 } };
       int [] [] transpozArray = new int[2][2];
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
               transpozArray[i][j] = arr[j][i];
                
            }
        }
        
         for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("transpozArray[" + i + "][" + j + "] = "
                                   + transpozArray[i][j]);
    }
}
    }
    
}
