/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pratikum.pkg2;

import java.util.Scanner;

/**
 *
 * @author Angga
 */
public class tampil {
    public static void main(String[] args) {
        NamaKota a = new NamaKota();
        a.JumlahKasus();
        a.tanggal="Tanggal kejadian 19 Februari 2022";
        System.out.println(""+a.tanggal);
        
        a.Kota1="Kota Malang";
        System.out.println(""+a.Kota1);
        a.TotalksspositivKota1=22817;
        
        
        a.Kota2="Kota Surabaya";
        System.out.println(""+a.Kota2);
        a.TotalksspositivKota2=93307;
        
        a.Kota3="Kota Madiun";
        System.out.println(""+a.Kota3);
        a.TotalksspositivKota3=8353;
        
        a.Kota4="Kabupaten Nganjuk";
        System.out.println(""+a.Kota4);
        a.TotalksspositivKota4=14021;
        
        a.Kota5="Kota Blitar";
        System.out.println(""+a.Kota5);
        a.TotalksspositivKota5=7250;
        
        
        System.out.println("Total Kasus Positif Kota 1 "+a.totalkss1(22817));
        System.out.println("Total Kasus Positif Kota 2 "+a.totalkss2(93307));
        System.out.println("Total Kasus Positif Kota 3 "+a.totalkss3(8353));
        System.out.println("Total Kasus Positif Kota 4 "+a.totalkss4(14021));
        System.out.println("Total Kasus Positif Kota 5 "+a.totalkss5(7250));
    }
    
}
