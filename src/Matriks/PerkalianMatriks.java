package Matriks;

public class PerkalianMatriks {
    public static void main(String[] args) {
    int[][] A = {
      {3, 8},
      {4, 2},
      {5, 8}
    };
    int[][] B = {
      {3, 3, 7},
      {2, 8, 1}
    };
    
    if(A[0].length == B.length) {   //2=2 ??? 
      //int [] [] C = new int [2][2]
      int[][] C = new int[A.length][B[0].length]; //[3][3]
      
      for(int i=0; i<A.length; i++) { //i=0 ; 0<3-T
        for(int j=0; j<B[0].length; j++) { //j=0; 0<3-T //j=1
          for(int k=0; k<A[0].length; k++) { //k=0; 0<2-T //k=1; 1<-T
            C[i][j] += A[i][k] * B[k][j]; //C0,0=A0,0*B0,0
          }                                 //C0,0=A0,1*B1,0
        }                                   //C0,0=A0,0*B0,0+A0,1*B1,0 = 3*3+8*2 = 9+16=25
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
    
    

      
      
      
      
      
      
      
      
     