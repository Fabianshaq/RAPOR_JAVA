/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

        package Fabian2;
        import java.util.Scanner;
        public class RemedPRORPL {
    
    static void nama() {
    System.out.println("Fabian Shaquille Fachrudin");}
    
    static void kelas() {
    System.out.println("X RPL 3 / 14 ");}
    
    static void usia() {
    System.out.println("Usia :15 " + (2020 - 2005));}
        public static void main(String[] args) {      
        // TODO code application logic here
        Scanner sken = new Scanner(System.in);
        int tugas1, tugas2, tugas3, nilaiMTK, rerataMTK;
        boolean keluar = true;
        String ulang;
        
        nama();
        kelas();
        usia();
        
        System.out.println("\n");
        System.out.println("Nilai Rapor MTK");
        
        System.out.println("Masukkan nilai tugas 1 anda :");
        tugas1 = sken.nextInt();
        
        System.out.println("Masukkan nilai tugas 2 anda :");
        tugas2 = sken.nextInt();
        
        System.out.println("Masukkan nilai tugas 3 anda :");
        tugas3 = sken.nextInt();
        
        nilaiMTK = (tugas1 + tugas2 + tugas3);
        rerataMTK = (nilaiMTK / 3);
        System.out.println("Nilai rapor MTK anda = " + rerataMTK);
        
        if (rerataMTK >= 85) {
        System.out.println("Grade anda adalah A");}
        
        if (rerataMTK >= 75 && rerataMTK <= 85) {
        System.out.println("Grade anda adalah B");}
        
        if (rerataMTK >= 70 && rerataMTK <= 75) {
        System.out.println("Grade anda adalah C");}
        
        else {
        System.out.println("Mohon Maaf, anda tidak naik kelas");}
        
        System.out.println("\n");
        
            while( keluar ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab Ya atau Tidak ");

            ulang = sken.nextLine();
           
            if (ulang.equalsIgnoreCase("ya") ){
                keluar = false;
            }
        
    }
    
    }
}
    
    

