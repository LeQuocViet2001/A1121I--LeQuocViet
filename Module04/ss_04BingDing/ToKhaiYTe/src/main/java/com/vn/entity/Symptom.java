package com.vn.entity;

public class Symptom {
    private boolean sot;
    private boolean ho;
    private boolean khoTho;
    private boolean dauHong;
    private boolean  non;
    private boolean tieuChay;
    private boolean xuatHuyet;
    private boolean noiBan;

    private boolean tiepXucDVat;
    private boolean tiepXucCov;

    public boolean isSot() {
        return sot;
    }

    public void setSot(boolean sot) {
        this.sot = sot;
    }

    public boolean isHo() {
        return ho;
    }

    public void setHo(boolean ho) {
        this.ho = ho;
    }

    public boolean isKhoTho() {
        return khoTho;
    }

    public void setKhoTho(boolean khoTho) {
        this.khoTho = khoTho;
    }

    public boolean isDauHong() {
        return dauHong;
    }

    public void setDauHong(boolean dauHong) {
        this.dauHong = dauHong;
    }

    public boolean isNon() {
        return non;
    }

    public void setNon(boolean non) {
        this.non = non;
    }

    public boolean isTieuChay() {
        return tieuChay;
    }

    public void setTieuChay(boolean tieuChay) {
        this.tieuChay = tieuChay;
    }

    public boolean isXuatHuyet() {
        return xuatHuyet;
    }

    public void setXuatHuyet(boolean xuatHuyet) {
        this.xuatHuyet = xuatHuyet;
    }

    public boolean isNoiBan() {
        return noiBan;
    }

    public void setNoiBan(boolean noiBan) {
        this.noiBan = noiBan;
    }

    public boolean isTiepXucDVat() {
        return tiepXucDVat;
    }

    public void setTiepXucDVat(boolean tiepXucDVat) {
        this.tiepXucDVat = tiepXucDVat;
    }

    public boolean isTiepXucCov() {
        return tiepXucCov;
    }

    public void setTiepXucCov(boolean tiepXucCov) {
        this.tiepXucCov = tiepXucCov;
    }

    public Symptom() {
    }

    public Symptom(boolean sot, boolean ho, boolean khoTho, boolean dauHong, boolean non, boolean tieuChay, boolean xuatHuyet, boolean noiBan, boolean tiepXucDVat, boolean tiepXucCov) {
        this.sot = sot;
        this.ho = ho;
        this.khoTho = khoTho;
        this.dauHong = dauHong;
        this.non = non;
        this.tieuChay = tieuChay;
        this.xuatHuyet = xuatHuyet;
        this.noiBan = noiBan;
        this.tiepXucDVat = tiepXucDVat;
        this.tiepXucCov = tiepXucCov;
    }
}
