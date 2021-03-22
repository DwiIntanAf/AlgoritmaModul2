package Matriks;
public class PenjumlahanMatriks {
    public static void main(String[] args) {
    int[][] A = {
      {3, 7, 1},
      {2, 4, 6},
      {5, 8, 9}
    };
    
      int[][] B = {
      {6, 2, 4},
      {3, 5, 1},
      {8, 7, 9}
    };
      
    if((A.length == B.length) && (A[0].length == B[0].length)) {
        
      int[][] C = new int[A.length][A[0].length];
      for(int i=0; i<A.length; i++) { //i=0; i<3-T  ----dst //i=3; 3<3-F
        for(int j=0; j<A[0].length; j++) { //j=0; 0<3-T //j=1
          C[i][j] = A[i][j] + B[i][j];  //C0,0=A0,0+B0,0=3+6=9 //C0,1=A0,1+B0,1=7+2=9
        }                               //dst            
    }                                      //C2,2=A2,2+B2,2=9+9=18
      
      for(int[] c: C) {
        for(int q: c) {
          System.out.print(q+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println(C[1][2]);
    }
    
    else {
      System.out.println("Ukuran matrix tidak sama");
    }
  }
}
    

