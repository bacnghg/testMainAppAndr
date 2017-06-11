package com.example.kingbob.myapplication;

/**
 * Created by KingBob on 6/11/2017.
 */

public class Student{
    private int St_id;
    private String St_Name;
    private String St_Class;
    private int St_Status;
    private String St_Img_src;

    public int getSt_id() {
        return St_id;
    }

    public void setSt_id(int st_id) {
        St_id = st_id;
    }

    public String getSt_Name() {
        return St_Name;
    }

    public void setSt_Name(String st_Name) {
        St_Name = st_Name;
    }

    public String getSt_Class() {
        return St_Class;
    }

    public void setSt_Class(String st_Class) {
        St_Class = st_Class;
    }

    public int getSt_Status() {
        return St_Status;
    }

    public void setSt_Status(int st_Status) {
        St_Status = st_Status;
    }

    public String getSt_Img_src() {
        return St_Img_src;
    }

    public void setSt_Img_src(String st_Img_src) {
        St_Img_src = st_Img_src;
    }

    public Student() {
    }

    public Student(int st_id, String st_Name, String st_Class, int st_Status, String st_Img_src) {

        St_id = st_id;
        St_Name = st_Name;
        St_Class = st_Class;
        St_Status = st_Status;
        St_Img_src = st_Img_src;
    }
}
