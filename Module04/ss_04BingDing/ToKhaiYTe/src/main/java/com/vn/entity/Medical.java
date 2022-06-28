package com.vn.entity;

public class Medical {
    private String name;
    private int yearBDay;
    private boolean gender;
    private String CMND;
    private String country;
    private String vehicle;
    private String numberVehicle;
    private int seats;
    private String dayStart;
    private String dayEnd;
    private String note;

    private String address;
    private String number;
    private String email;

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

    public Medical() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBDay() {
        return yearBDay;
    }

    public void setYearBDay(int yearBDay) {
        this.yearBDay = yearBDay;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getNumberVehicle() {
        return numberVehicle;
    }

    public void setNumberVehicle(String numberVehicle) {
        this.numberVehicle = numberVehicle;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Medical(String name, int yearBDay, boolean gender, String CMND, String country, String vehicle, String numberVehicle, int seats, String dayStart, String dayEnd, String note, String address, String number, String email, boolean sot, boolean ho, boolean khoTho, boolean dauHong, boolean non, boolean tieuChay, boolean xuatHuyet, boolean noiBan, boolean tiepXucDVat, boolean tiepXucCov) {
        this.name = name;
        this.yearBDay = yearBDay;
        this.gender = gender;
        this.CMND = CMND;
        this.country = country;
        this.vehicle = vehicle;
        this.numberVehicle = numberVehicle;
        this.seats = seats;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.note = note;
        this.address = address;
        this.number = number;
        this.email = email;
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
