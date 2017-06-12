package com.example.kingbob.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> listStudent = new ArrayList<Student>(10);
    LvStudentAdapter lvStudentAdapter = null;
    Context context = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listStudent.add(new Student(1, "Hello W", "Class Englia", 1,"ss"));
        listStudent.add(new Student(2, "Hello W", "Class Englia",2, "Offline"));
        listStudent.add(new Student(3, "Hello W", "Class Englia",3, "Offline"));
        listStudent.add(new Student(11, "Hello W", "Class Englia", 1,"ss"));
        listStudent.add(new Student(22, "Hello W", "Class Englia",2, "Offline"));
        listStudent.add(new Student(33, "Hello W", "Class Englia",3, "Offline"));
        context = getApplicationContext();
        ListView lvStudent=(ListView) findViewById(R.id.lv_student1);

        lvStudentAdapter = new LvStudentAdapter(this,listStudent,R.layout.listview_student);

        lvStudent.setAdapter(lvStudentAdapter);
    }
}
