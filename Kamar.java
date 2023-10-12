/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruangan;

/**
 *
 * @author Martwartz
 */
public class Kamar {
    private final String tipe;
    private final int nomor;
    private final int lantai;
    
    public Kamar(String tipe, int nomor, int lantai){
        this.tipe = tipe;
        this.nomor = nomor;
        this.lantai = lantai;
    }
    
    public String getTipe(){
        return tipe;
    }
    public int getNomor(){
        return nomor;
    }
    public int getLantai(){
        return lantai;
    }
}
