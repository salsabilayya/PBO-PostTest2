/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author Martwartz
 */
public class Staff {
    private final String nama;
    private final String jabatan;
    
    public Staff(String nama, String jabatan){
    this.nama = nama;
    this.jabatan = jabatan;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getJabatan(){
        return jabatan;
    }
}
