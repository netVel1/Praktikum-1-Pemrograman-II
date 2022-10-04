package praktikum;

import java.util.Scanner;

public class PRAK101_2110817310011_MuhammadRaviHimawan {
      

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        //input 
        System.out.print("Masukkan Nama Lengkap: ");
        String name = myObj.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String place = myObj.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int date = myObj.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int months = myObj.nextInt();
        System.out.print("Masukkan Tahun lahir: ");
        int year = myObj.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int height = myObj.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double weight = myObj.nextDouble();
        
        //month
        String Month;
        switch (months) {
            case 1:
                Month = "Januari";
                break;
            case 2:
                Month = "Februari";
                break;
            case 3:
                Month = "Maret";
                break;
            case 4:
                Month = "April";
                break;
            case 5:
                Month = "Mei";
                break;
            case 6:
                Month = "Juni";
                break;
            case 7:
                Month = "Juli";
                break;
            case 8:
                Month = "Agustus";
                break;
            case 9:
                Month = "September";
                break;
            case 10:
                Month = "Oktober";
                break;
            case 11:
                Month = "November";
                break;
            case 12:
                Month = "Desember";
                break;
            default:
                Month = "Invalid";
                break;
        }
        
        //output
        System.out.println("Data Telah Ditambahkan");
        System.out.println("Nama Lengkap "+ name +", Lahir di "+ place +" pada Tanggal "+ date +" Bulan " + Month +" Tahun "+year);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " Kilogram.") ;
    }
}
