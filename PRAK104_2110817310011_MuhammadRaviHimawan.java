
package praktikum;

import java.util.Scanner;

public class PRAK104_2110817310011_MuhammadRaviHimawan {
    public static void main(String[] args) {
        Scanner dadu = new Scanner (System.in);
        int i = 1;
        int SkorAndi = 0;
        int SkorBudi = 0;
        //input andi
        while(i<4) {
        System.out.print("Andi");
        int andi = dadu.nextInt();
        if (andi >= 2 && andi <=10){
            System.out.print("Budi");
            int budi = dadu.nextInt();
            if (budi >= 2 && budi <=10){
                if (andi > budi){
                    SkorAndi++;
                }
                if (andi < budi){
                    SkorBudi++;
            }
        }
            else {
                System.out.println("Input harus lebih dari 2 dan kurang dari 10");
            } 
        }
        else {
            System.out.println("Input harus lebih dari 2 dan kurang dari 10");
        }
        i++;
        }
     //contesting   
     if (SkorAndi > SkorBudi){
         System.out.println("Andi");  
     }       
     if (SkorAndi < SkorBudi){
        System.out.println("Budi");
    }
    else {
             System.out.println("Seri");
        }
    }
}
