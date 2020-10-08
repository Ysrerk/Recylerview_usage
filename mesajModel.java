package com.example.myapplication1_recy;

public class mesajModel {
    private String isim;
    private String mesaj;
    private int resimid;

    public mesajModel(String isim, String mesaj, int resimid) {
        this.isim = isim;
        this.mesaj = mesaj;
        this.resimid = resimid;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public int getResimid() {
        return resimid;
    }

    public void setResimid(int resimid) {
        this.resimid = resimid;
    }
}
