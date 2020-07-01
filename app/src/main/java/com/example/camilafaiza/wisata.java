package com.example.camilafaiza;

import android.os.Parcel;
import android.os.Parcelable;

public class wisata implements Parcelable{
    private String nama;
    private String detail;
    private String desc;

    protected wisata(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        desc = in.readString();
        alamat = in.readString();
        rating = in.readFloat();
        foto = in.readInt();
    }

    public static final Creator<wisata> CREATOR = new Creator<wisata>() {
        @Override
        public wisata createFromParcel(Parcel in) {
            return new wisata(in);
        }

        @Override
        public wisata[] newArray(int size) {
            return new wisata[size];
        }
    };

    public wisata() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    private String alamat;
    private float rating;
    private int foto;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(detail);
        parcel.writeString(desc);
        parcel.writeString(alamat);
        parcel.writeFloat(rating);
        parcel.writeInt(foto);
    }
}
