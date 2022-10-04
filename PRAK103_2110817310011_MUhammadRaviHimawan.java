
package praktikum;

import java.util.Scanner;

public class PRAK103_2110817310011_MUhammadRaviHimawan {
    public static void main(String[] args) {
        Scanner number = new Scanner (System.in);
        int angka = number.nextInt();
        int i = 1;
        do {
            if (angka % 7 == 0) {
                continue;
            }
            else System.out.print(angka + ", ");
            i++;
            angka--;
        } while (i<=5);
    }
}
