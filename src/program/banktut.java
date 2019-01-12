/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

/**
 *
 * @author Who Am I
 */
public class banktut extends koneksi{
    
    //user
    private String nama;
    private String alamat;
    private int norek;
    private String ttl;
    private String user;
    private String password;
    
    //saldo
    private double hasil;
    private String answer;
    private double saldo;
    private int masukan;
    
    //konstruktor yang digunakan untuk kelas turunan user
    public banktut(String nama, String alamat, int norek, String ttl, String user, String password){
        
    }

    public banktut(String id, String nama, String alamat, int norek, String ttl, String user, String password, double hasil, String answer, double saldo, int masukan) {
        this.nama = nama;
        this.alamat = alamat;
        this.norek = norek;
        this.ttl = ttl;
        this.user = user;
        this.password = password;
        this.hasil = hasil;
        this.answer = answer;
        this.saldo = saldo;
        this.masukan = masukan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNorek() {
        return norek;
    }

    public void setNorek(int norek) {
        this.norek = norek;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getMasukan() {
        return masukan;
    }

    public void setMasukan(int masukan) {
        this.masukan = masukan;
    }
    
    
}
