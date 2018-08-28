/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramTokoBuku;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
class Transaksi extends DataPembeli{
    public Transaksi(int id_barang, int harga_barang,int jml_barang, String nama_barang, String merk_barang, int id_pembeli, String nama_pembeli, String alamat, String no_telp) {
        super(id_barang, harga_barang,jml_barang, nama_barang, merk_barang, id_pembeli, nama_pembeli, alamat, no_telp);
    }
        
    public static void main(String[] args) {
        DataPembeli trans = new DataPembeli(2,2,10000,"Pensil","FaberCastell",10000,"Senger","Taman","0341492554");
        trans.infokasir();
        System.out.println("===================================");
        System.out.println("Nama kasir : Clerk Kent");
        System.out.println("Tanggal Transaksi : 20-08-2018");
        System.out.println("===================================");
        System.out.println("TERIMA KASIH TELAH MEMBELI");
    }
}


