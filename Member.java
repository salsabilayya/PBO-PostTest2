/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author Martwartz
 */
public class Member {
    private final String nama;
    private final int idMember;
    
    public Member(String nama, int idMember ){
        this.nama = nama;
        this.idMember = idMember;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getIdMember(){
        return idMember;
    }
}
