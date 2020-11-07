/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan33.objectorienteduserlogin;

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

public class User {
    
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        if ((parUserName.equals(username)) && (parPassword.equals(password))) {
        return statusAkun = true;
        }else {
        return statusAkun = false;
        }
    }
    
    private void hasilLogin(boolean status, String parUserName){
    status = statusAkun;
        if (status){
        System.out.println();
        parUserName = parUserName.toUpperCase();
        System.out.println("******HALO " + parUserName + "******");
        System.out.println("Selamat Datang di Aplikasi ini");
        }else{
        System.out.println();
        System.out.println("Ooops, Username atau Password anda salah");
        }   
    }

    public void pengecekkanLogin(String parUsername, String parPassword){
    cekAkun(parUsername, parPassword);
    hasilLogin(statusAkun, parUsername);
    }
}
