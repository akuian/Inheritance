/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramTokoBuku;

import java.util.Scanner;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class DataPembeli extends TokoBuku{
    public int id_pembeli;
    public String nama_pembeli;
    public String alamat;
    public String no_telp;
    
    public DataPembeli(int jml_barang,int id_barang,int harga_barang,String nama_barang,String merk_barang,int id_pembeli,String nama_pembeli,String alamat,String no_telp){
        super(id_barang,harga_barang,nama_barang,merk_barang,jml_barang);
        this.id_pembeli=id_pembeli;
        this.nama_pembeli=nama_pembeli;
        this.alamat=alamat;
        this.no_telp=no_telp;
    }
    
     public void infokasir(){
         super.infokasir();
        System.out.println("Nama Pembeli : "+this.nama_pembeli);
        System.out.println("ID Pembeli  : "+this.id_pembeli);
            System.out.println("Alamat : "+this.alamat);
            System.out.println("No.Telp : "+this.no_telp);
            System.out.println("Total Harga : "+this.jml_barang *harga_barang);
            
     }
}
