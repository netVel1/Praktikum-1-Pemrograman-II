package praktikum;

import java.util.Scanner;

public class PRAK102_2110817310011_MuhammadRaviHimawan {
   public static void main(String[] args) {
       Scanner  scan = new Scanner(System.in);
       int angka = scan.nextInt();
       int Angka;
       int i = 1;
      while (i < 8){
          if (angka % 2 == 0) {
              Angka = (angka / 2)- 1;
              System.out.print(Angka + ", ");
              angka++;
          }
          else {
              System.out.print(angka + ", ");
              angka++;
          }
          i++;
      }
   }
    
}
