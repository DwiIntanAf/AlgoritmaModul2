
package Matriks;


public class TugasPerkalian {
    public static void main(String[] args) {
    int[][] A = {
      {1, 1},
      {1, 1},
      {1, 1}
    };
    int[][] B = {
      {2, 2, 2},
      {2, 2, 2}
    };
    
    if(A[0].length == B.length) {
      //int [] [] C = new int [2][2]
      int[][] C = new int[A.length][B[0].length];
      
      for(int i=0; i<A.length; i++) { //i=0; 0<3-T 
        for(int j=0; j<B[0].length; j++) { //j=0; 0<3-T //j=1; 1<3-T
          for(int k=0; k<A[0].length; k++) { //k=0; 0<2-T //k=1; 1<2-T //k=2; 2<2-F
            C[i][j] += A[i][k] * B[k][j]; //C0,0 = A0,0*B0,0 //C0,0=A0,1+B1,0
          }
        }
      }
      
      for(int[] c: C) {
        for(int i: c) {
          System.out.print(i+" ");
        }
        System.out.println();
      }
    }
    else {
      System.out.println("Ukuran kolom A tidak sama dengan baris B");
    }
  }
}


