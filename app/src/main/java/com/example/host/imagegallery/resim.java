package com.example.host.imagegallery;

/**
 * Created by Java3 on 8/16/2016.
 */
public class resim {

    public String getDuzenlenmisadres() {
        return duzenlenmisadres;
    }

    public void setDuzenlenmisadres(String duzenlenmisadres) {
        this.duzenlenmisadres = duzenlenmisadres;
    }

    String duzenlenmisadres;
    String myvideos="";

    public String getMyvideos() {
        return myvideos;
    }

    public void setMyvideos(String myvideos) {
        this.myvideos = myvideos;
    }

    public String getVidID() {
        return vidID;
    }

    public void setVidID(String vidID) {
        this.vidID = vidID;
    }

    private String baslik,resimUrl,vidID;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getResimUrl() {
        return resimUrl;
    }

    public void setResimUrl(String resimUrl) {
        this.resimUrl = resimUrl;
    }

    public resim(String baslik, String resimUrl, String vidID) {
        this.baslik = baslik;
        this.resimUrl = resimUrl;
        this.vidID=vidID;

    }
    public resim(String baslik, String resimUrl, String vidID, String myvideos) {
        this.baslik = baslik;
        this.resimUrl = resimUrl;
        this.vidID=vidID;
        this.myvideos=myvideos;
    }
    public resim(String duzenlenmisadres){
        this.duzenlenmisadres=duzenlenmisadres;
    }
}
