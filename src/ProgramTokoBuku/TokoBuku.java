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
public class TokoBuku {
        public int id_barang,harga_barang,jml_barang;
        public String nama_barang,merk_barang;
        
        public TokoBuku(int id_barang,int harga_barang,String nama_barang,String merk_barang, int jml_barang){
        this.id_barang=id_barang;
        this.harga_barang=harga_barang;
        this.nama_barang=nama_barang;
        this.merk_barang=merk_barang;
        this.jml_barang=jml_barang;
        
        
    }
        public void infokasir(){
            System.out.println("SELAMAT DATANG DI TOKO BUKU REVIVE");
            System.out.println("===================================");
        System.out.println("Nama Barang : "+this.nama_barang);
        System.out.println("ID Barang  : "+this.id_barang);
            System.out.println("Merk Barang : "+this.merk_barang);
            System.out.println("Harga Barang : "+this.harga_barang);
            System.out.println("Jumlah Barang : "+this.jml_barang);
            
}
        
}
