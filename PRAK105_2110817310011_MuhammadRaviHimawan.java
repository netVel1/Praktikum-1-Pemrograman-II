/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;


import java.util.Scanner;

public class PRAK105_2110817310011_MuhammadRaviHimawan {
     public static void main(String[] args) {
        final float PI = 3.14f;
        float radius, height, volume;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jari-jari: ");
        radius = input.nextFloat();

        System.out.print("Masukan tinggi: ");
        height = input.nextFloat();

        volume = PI * radius * radius * height;

        System.out.println("Volume tabung dengan jari-jari "+ radius + " cm dan tinggi " + height + " cm adalah " + volume + " m^3 ");
    }
}
