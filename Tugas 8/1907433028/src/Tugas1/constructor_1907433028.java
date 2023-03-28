package Tugas1;

public class constructor_1907433028 {
    private String merk;
    private static String pemilik;
    
    protected constructor_1907433028(){
        merk = null;
    }
    
    protected constructor_1907433028(String merk){
        this.merk = merk;
        merk = null;
    }
    
    protected void setMerk(String Merk){
        this.merk = merk;
    }
    
    protected String getMerk(){
        return merk;
    }
    
    protected static void setPemilik(String pemilik){
        constructor_1907433028.pemilik = pemilik;
    }
    
    protected static String getPemilik(){
        return constructor_1907433028.pemilik;
    }
    
    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }
    
    protected void hapus(){
        merk = null;
        pemilik = null;
    }
}
