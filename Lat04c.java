/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lat04c;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Lat04c {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai: ");
    int nilai = input.nextInt();

    GradeConverter gradeConverter = new GradeConverter();
    String nilaiHuruf = gradeConverter.convert(nilai);

    System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}
