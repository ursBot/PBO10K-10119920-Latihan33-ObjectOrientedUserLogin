/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan33.objectorienteduserlogin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class Latihan33Login {
    
    private static String usName, passWord;
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Masukkan Username = ");
         usName = scanner.nextLine();
         System.out.print("Masukkan Password = ");
         passWord = scanner.nextLine();
         User u = new User();
         u.pengecekkanLogin(usName, passWord);
    }
}