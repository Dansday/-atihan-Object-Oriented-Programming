public class Tugas_1907433028 {
    private int[] BILANGAN;
    private float hasilRata;
    private int lokasi = 1, Max, Min, hasilMax, hasilMin;
    
    public void setBilangan(int[] bilangan){
        this.BILANGAN = bilangan;
        bilangan = null;
    }
    
    public int[] getBilangan(){
        return BILANGAN;
    }

    public void setRata(int[] bilangan){
        hasilRata = 0;
        for (int i=0; i<bilangan.length; i++){
            hasilRata = hasilRata + bilangan[i];
        }
        hasilRata = hasilRata / bilangan.length;
        bilangan= null;
    }
    
    public float getRata(){
        return hasilRata;
    }
    
    public void setMax(int[] bilangan){
        Max = bilangan[0];
        for (int i=0; i<bilangan.length; i++){
            if(bilangan[i]>Max){
                hasilMax=bilangan[i];
            }
        }
        bilangan= null;
    }
    
    public int getMax(){
        return hasilMax;
    }
    
    public void setMin(int[] bilangan){
        Min = bilangan[0];
        for (int i=0; i<bilangan.length; i++){
            if(bilangan[i]<Min){
                hasilMin=bilangan[i];
            }
        }
        bilangan= null;
    }
    
    public int getMin(){
        return hasilMin;
    }
    
    public void tampil(String a){
        System.out.print(a);
        a = null;
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
    
    public void tampil(float a){
        System.out.println(a);
    }
    
    public void tampil(int a){
        System.out.println(a);
    }
    
    public void hapus(){
        BILANGAN = null;
        hasilRata= 0;
        hasilMax= 0;
        hasilMin= 0;
    }
}
