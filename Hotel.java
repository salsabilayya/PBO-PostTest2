/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Hotel;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Hotel.Staff;
import Hotel.Member;

/**
 *
 * @author Martwartz
 */
public class Hotel {
    private final List<Staff> staffList;
    private final List<Member> memberList;
    private final Scanner scanner;
    
    public Hotel(){
        this.staffList = new ArrayList<>();
        this.memberList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void tambahStaff(){
        System.out.print("Masukkan Nama Staff: ");
        String nama = scanner.next();
        System.out.print("Masukkan Jabatan Staff: ");
        String jabatan = scanner.next();
        
        Staff staff = new Staff(nama, jabatan);
        staffList.add(staff);
        System.out.println("Data staff telah ditambahkan!");
        System.out.println("-----------------------");
    }
    
    public void tambahMember(){
        System.out.print("Masukkan Nama Member: ");
        String nama = scanner.next();
        System.out.print("Masukkan ID Member: ");
        int idMember = scanner.nextInt();
        
        Member member = new Member(nama, idMember);
        memberList.add(member);
        System.out.println("Data member telah ditambahkan!");
        System.out.println("-----------------------");
    }
    
    public void tampilData(){
        System.out.println("[Daftar Staff Beachwalk Hotel]");
        for (Staff staff : staffList){
            System.out.println("Nama: " + staff.getNama() + ", Jabatan: " + staff.getJabatan());
            System.out.println("-----------------------");
        }
        System.out.println("[Daftar Member Beachwalk Hotel]");
        for (Member member : memberList){
            System.out.println("Nama: " + member.getNama() + ", ID Member: " + member.getIdMember());
            System.out.println("-----------------------");
        }
    }
    
    public void menu(){
        int pilih;
        
        do{
            System.out.println("[Halo Staff BeachWalk Hotel!]");
            System.out.println("MENU UTAMA:");
            System.out.println("1. Tambah Staff");
            System.out.println("2. Tambah Member");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Keluar");
            System.out.println("-----------------------");
            System.out.print("Pilih menu (1-4): ");
            pilih = scanner.nextInt();
            System.out.println("-----------------------");
            
            
            switch (pilih){
                case 1:
                    tambahStaff();
                    break;
                case 2:
                    tambahMember();
                    break;
                case 3:
                    tampilData();
                    break;
                case 4:
                    System.out.println("Terima kasih. Anda telah bekerja keras <3");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 4);
    }
    
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.menu();
        
    }
}
