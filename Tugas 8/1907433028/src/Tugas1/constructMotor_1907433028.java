package Tugas1;

public class constructMotor_1907433028 extends constructor_1907433028{
    private String warna;
    
    protected constructMotor_1907433028(String merk, String warna){
        super(merk);
        this.warna = warna;
        
        merk = null;
        warna = null;
    }
    
    protected String getWarna(){
        return warna;
    } 
    
    protected void hapus(){
        warna = null;
        super.hapus();
    }
}
