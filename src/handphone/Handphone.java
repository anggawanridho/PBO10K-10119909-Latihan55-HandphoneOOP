package handphone;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct(){
        System.out.println("Manufaktur        : " + this.manufacture);
        System.out.println("OS                : " + this.operatingSystem);
        System.out.println("Model             : " + this.model);
        System.out.println("Harga             : " + this.harga);
    }
}
