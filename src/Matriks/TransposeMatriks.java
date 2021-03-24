package Matriks;
import java.util.Scanner;

public class TransposeMatriks {
    public static void main(String[] args){
    int i, j, m, n; //m =ukuran baris //n= ukuran kolom
    int matriks[][] = new int[10][10]; 
    int transpose[][] = new int[10][10];
    Scanner scan = new Scanner(System.in); //perintah untuk mengambil nilai dari keyboard
    
    System.out.print("Masukkan jumlah baris matriks: "); //3
    m = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks: "); //2
    n = scan.nextInt();
    System.out.println("Masukkan elemen matriks: "); //20 //23 
    for(i = 0; i < m; i++){ //i=0, 0<5 
      for(j = 0; j< n; j++){ //j=0; 0<4 j=1
        matriks[i][j] = scan.nextInt(); //matriks0,0=20 //matriks0,1=23
      }
    }
    
    System.out.println("Hasil matriks: ");
    for(i = 0; i < m; i++){ //i=0
      for(j = 0; j< n; j++){ //j=0 //j=1
        System.out.print(matriks[i][j] + "\t");   //20  //23
      }
      System.out.println();
    }
    
    for(i = 0; i < m; i++){ //i=0
      for(j = 0; j< n; j++){ //j=0
        transpose[j][i] = matriks[i][j];   // //  matriks0,1 == transpose1,0
      }
    }
    
    System.out.println("Hasil transpose matriks: ");
    for(i = 0; i < n; i++){  //i=0
      for(j = 0; j< m; j++){ //j=0 // j=1
        System.out.print(transpose[i][j] + "\t");// 20      
      }
      System.out.println();
    }
  }
}
