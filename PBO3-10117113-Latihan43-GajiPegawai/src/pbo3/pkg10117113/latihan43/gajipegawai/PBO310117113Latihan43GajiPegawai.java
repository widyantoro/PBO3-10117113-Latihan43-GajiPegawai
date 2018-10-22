/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan43.gajipegawai;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menghitung total gaji
 *            
 */
public class PBO310117113Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        
        gp.setNama("Eka Widyantoro");
        gp.setAlamat("Jl. Dahlia No. 5");
        gp.setUangTransport(250000);
        gp.setTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.setTotalGaji(gp.totalGaji(gp.getTunjangan(),gp.getUangTransport(), 
                        gp.getGajiPokok()));
        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getTunjangan(),
                      gp.getUangTransport(), gp.getGajiPokok(), 
                      gp.getTotalGaji());
    }
    
}
