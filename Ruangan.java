/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruangan;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Ruangan.Kamar;

/**
 *
 * @author Martwartz
 */
public class Ruangan {
    private final List<Kamar> listKamar;
    private final Scanner scanner;
    
    public Ruangan(){
        this.listKamar = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void tambahKamar(){
        System.out.print("Masukkan Tipe Kamar: ");
        String tipe = scanner.next();
        System.out.print("Masukkan Nomor Kamar: ");
        int nomor = scanner.nextInt();
        System.out.print("Masukkan Lantai Kamar: ");
        int lantai = scanner.nextInt();
        
        Kamar kamar = new Kamar(tipe, nomor, lantai);
        listKamar.add(kamar);
        System.out.println("Data kamar telah ditambahkan!");
        System.out.println("-----------------------");
    }
    
    public void tampilData(){
        System.out.println("[Daftar Kamar di Beachwalk Hotel]");
        for (Kamar kamar : listKamar){
            System.out.println("Tipe Kamar: " + kamar.getTipe() + ", Nomor Kamar: " + kamar.getNomor() + ", Lantai Kamar: " + kamar.getLantai());
        }
    }
    public void menu(){
        int pilihan;
        
        do{
            System.out.println("[Data Ruang Kamar Beachwalk Hotel]");
            System.out.println("1. Tambah Data Kamar");
            System.out.println("2. Tampilkan Data Kamar");
            System.out.println("3. Keluar");
            System.out.println("-----------------------");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();
            System.out.println("-----------------------");
            
            
            switch(pilihan){
                case 1:
                    tambahKamar();
                    break;
                case 2: 
                    tampilData();
                    System.out.println("-----------------------");
                    break;
                case 3:
                    System.out.println("Terima kasih. Anda sudah bekerja keras!");
                    System.out.println("-----------------------");
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }
    public static void main(String[] args){
        Ruangan ruangan = new Ruangan();
        ruangan.menu();
    }
}
