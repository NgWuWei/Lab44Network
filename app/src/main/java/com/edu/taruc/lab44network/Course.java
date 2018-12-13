package com.edu.taruc.lab44network;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Course {
    private String code;
    private String title;
    private String credit;

    public Course(String code, String title, String credit) {
        this.code = code;
        this.title = title;
        this.credit = credit;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titile) {
        this.title = titile;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }



    public Course(){

    }


}
