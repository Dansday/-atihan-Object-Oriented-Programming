package Tugas2;

public class cetakGambar_1907433028 extends bentuk_1907433028{
    private void tampil(bentuk_1907433028[]obj){
        for (int i=0; i<obj.length; i++){
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("==============================");
        }
    }
    
    public static void main(String[] args){
        bentuk_1907433028[] obj = { new lingkaran_1907433028(),
                                    new elips_1907433028(),
                                    new segitiga_1907433028()
                                    };
        cetakGambar_1907433028 cetak = new cetakGambar_1907433028();
        
        cetak.gambar();
        cetak.hapus();
        System.out.println("==============================");
        
        cetak.tampil(obj);
    }
}
