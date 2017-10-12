package com.example.hidarah42.sekeranjang;

/**
 * Created by hidarah42 on 10/10/17.
 */

public class Data {
    private int Data_image;
    private String Data_deskripsi;

    public Data(){}

    public Data(int Data_image,String Data_deskripsi){
        this.Data_image = Data_image;
        this.Data_deskripsi = Data_deskripsi;
    }


    public void setData_image(int data_image) {
        Data_image = data_image;
    }

    public int getData_image() {
        return Data_image;
    }

    public void setData_deskripsi(String data_deskripsi) {
        Data_deskripsi = data_deskripsi;
    }

    public String getData_deskripsi() {
        return Data_deskripsi;
    }
}
