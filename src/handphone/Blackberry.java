package handphone;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Blackberry extends Handphone {
    private String pinBB;

    public Blackberry(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }

    public String getPinBB(){
        return pinBB;
    }

    public void setPinBB(String pinBB){
        this.pinBB = pinBB;
    }
}
