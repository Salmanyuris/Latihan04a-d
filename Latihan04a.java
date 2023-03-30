/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan04a;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Latihan04a {

    public static void main(String[] args) {
       String nama;
       int anak, gaji, tanak, total;
       
       Scanner oscan01 = new Scanner(System.in);
       
       System.out.println("Hitung Tunj. anak ");
       System.out.println("===================");
       System.out.print("Nama       : ");
       nama = oscan01.nextLine();
       System.out.print("Anak       : ");
       anak = oscan01.nextInt();
       System.out.print("Gaji       : ");
       gaji = oscan01.nextInt();
       
       //hitung tunj. anak............
       if (anak > 3)
           tanak = 3 * 200000;
       else
           tanak = anak * 200000;
       
       total = anak + tanak;
       
       System.out.println("Tunj anak    : " + tanak);
       System.out.println("Total        : " + total);
       
    }
}
