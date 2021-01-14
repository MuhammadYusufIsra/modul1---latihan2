//Package
package latihan2;
//Mengimport Scanner
import java.util.Scanner;

/**
 *
 * @author Yusuf Isra
 */
//Class
public class Latihan2 {
    //Method
    public static void main(String[] args) {
//pilihan menu
    Scanner masukan = new Scanner(System.in);
    int pilihan = 9;
    //Perulangan do-While
    do{
      System.out.println("\nMENU LUAS BANGUN");
      System.out.println("1. Menghitung Luas Persegi");
      System.out.println("2. Menghitung Luas Persegi Panjang");
      System.out.println("3. Keluar");
      System.out.print("Masukkan Pilihan Anda : ");
      pilihan = masukan.nextInt();
      //Percabangan switch case
    switch(pilihan){
      case 1 : luasPersegi();break;
      case 2 : luasPersegiPanjang();break;
    }
    }while(pilihan !=3);
  }
//Method #2
  private static void luasPersegi(){
      //Membuat scanner
    Scanner masukan = new Scanner(System.in);
    //Deklarasi Variabel
    float sisi,luas;
    System.out.print("masukkan nilai sisi :");
    sisi = masukan.nextFloat();
    //Operator aritmatika
    luas = sisi * sisi;
    System.out.println("Luas Persegi adalah : " + luas);
  }

  private static void luasPersegiPanjang(){
    Scanner masukan = new Scanner(System.in);
    float panjang, lebar, luas;
    System.out.print("Masukkan nilai panjang : ");
    panjang = masukan.nextFloat();
    System.out.print("Masukkan nilai lebar : ");
    lebar = masukan.nextFloat();
    luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang adalah : " + luas);
  }
}
    
    

