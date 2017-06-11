package com.example.kingbob.myapplication;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KingBob on 6/11/2017.
 */

public class LvStudentAdapter extends ArrayAdapter<Student> {

    Activity context = null;

    ArrayList<Student> listStudent ;

    int layout_id;

    public LvStudentAdapter( Activity context1, ArrayList<Student> listStudent, int layout_id) {
        super(context1, layout_id, listStudent);
        this.context = context1;
        this.listStudent = listStudent;
        this.layout_id = layout_id;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(layout_id,null);
        if(listStudent.size() >0 && position >= 0){
            final TextView textName = (TextView) convertView.findViewById(R.id.tv_Name);
            textName.setText(listStudent.get(position).getSt_Name());
            final TextView textClass = (TextView) convertView.findViewById(R.id.tv_class);
            textClass.setText(listStudent.get(position).getSt_Class());
            final TextView textID = (TextView) convertView.findViewById(R.id.tv_studentid);
            textID.setText(listStudent.get(position).getSt_id());
            final TextView textStatus = (TextView) convertView.findViewById(R.id.tv_status);
            if(listStudent.get(position).getSt_Status() == 0) {
                textStatus.setText("AAAA");
            }
            else textStatus.setText("BBBB");

            final ImageView imageID = (ImageView) convertView.findViewById(R.id.img_location);

        }
        return super.getView(position, convertView, parent);
    }
}
