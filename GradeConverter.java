/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat04c;

/**
 *
 * @author LENOVO
 */
public class GradeConverter {
   public String convert(int nilai) {
    String nilaiHuruf;

    if (nilai >= 90) {
      nilaiHuruf = "A";
    } else if (nilai >= 80) {
      nilaiHuruf = "B";
    } else if (nilai >= 70) {
      nilaiHuruf = "C";
    } else if (nilai >= 60) {
      nilaiHuruf = "D";
    } else {
      nilaiHuruf = "E";
    }

    return nilaiHuruf;
   } 
}
