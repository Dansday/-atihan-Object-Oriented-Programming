public class mobil_1907433028 extends kendaraan_1907433028{
    private long harga;
    protected String namaClass = "Mobil";
    
    protected void setHarga(String harga){
        this.harga = Long.parseLong(harga);
        harga = null;
    }
    
    protected long getHarga(){
        return harga;
    }
    
    protected String keterangan(){
        return (namaClass+": ini adalah class"+namaClass);
    }
    
    public String ket_kendaraan(){
        return super.namaClass+" : "+super.keterangan();
    }
    
    protected void hapus(){
        harga = 0;
        super.hapus();
    }
}
