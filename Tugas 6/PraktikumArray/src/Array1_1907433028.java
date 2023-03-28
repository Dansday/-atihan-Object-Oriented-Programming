public class Array1_1907433028 {
    private String[] MHS;
    private int[] DERET;
    private int hasilPenjumlahan;
    
    public void setMhs(String[] mhs){
        this.MHS = mhs;
        mhs = null;
    }
    
    public String[] getMhs(){
        return MHS;
    }
    
    public void setDeret(int[] deret){
        this.DERET = deret;
        deret = null;
    }
    
    public int[] getDeret(){
        return DERET;
    }

    public void setPenjumlahan(int[] deret){
        hasilPenjumlahan = 0;
        for (int i=0; i<deret.length; i++){
            hasilPenjumlahan += deret[i];
        }
        deret= null;
    }
    
    public int getPenjumlahan(){
        return hasilPenjumlahan;
    }
    
    public void tampil(String a){
        System.out.println(a);
        a = null;
    }
    
    public void tampil(String a[]){
        String data = "";
        for (int i=0; i<a.length; i++){
            if (i==0){
                data += a[i];
            } else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }
    
    public void tampil(int a[]){
        String data = "";
        for (int i=0; i<a.length; i++){
            if (i==0){
                data += a[i];
            } else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }
    
    public void tampil(int a){
        System.out.println(a);
    }
    
    public void hapus(){
        MHS = null;
        DERET = null;
        hasilPenjumlahan= 0;
    }
}
