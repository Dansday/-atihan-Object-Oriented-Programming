public class Tugas1_028 {
    private String merek;
    private long harga;
    
    public void setMerek(String mrkMotor){
       merek = mrkMotor; 
    }
    
    public String getMerek(){
        return merek;
    }
    
    public long harga (long hargaMotor){
        return harga = hargaMotor;
    }
    
    public static void main(String [] args){
        Tugas1_028 motor = new Tugas1_028();
        motor.setMerek("Suzuki");
        System.out.println("Motor ini bermerk "+motor.getMerek());
        System.out.println("Motor ini berharga "+motor.harga(11000028));
    }
}
