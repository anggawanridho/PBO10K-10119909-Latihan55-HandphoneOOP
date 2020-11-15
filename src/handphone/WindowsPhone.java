package handphone;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class WindowsPhone extends Handphone {
    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }

    public String getWpKeyStore(){
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore){
        this.wpKeyStore = wpKeyStore;
    }
}
