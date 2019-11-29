package com.abiraj.hotelreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    public EditText etName,etRoom,etChildren,etAdult;
    public TextView tvCheckIn, tvCheckOut,tvGrand,tvVat,tvTotal,tvAdult,tvChild,TvRoom;
    public Spinner spinCountry, spinRoom;
    public Button btnCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etRoom = findViewById(R.id.etRoom);
        etChildren = findViewById(R.id.etChildren);
        etAdult = findViewById(R.id.etAdult);
        tvCheckIn = findViewById(R.id.tvCheckIn);
        tvCheckOut = findViewById(R.id.tvCheckOut);
        tvGrand= findViewById(R.id.tvGrand);
        tvVat = findViewById(R.id.tvVat);
        tvTotal = findViewById(R.id.tvTotal);
        tvAdult = findViewById(R.id.tvTotal);
        tvChild = findViewById(R.id.tvChild);
        TvRoom = findViewById(R.id.TvRoom);
        spinCountry = findViewById(R.id.spinCountry);
        spinRoom = findViewById(R.id.spinRoom);
        btnCalculate = findViewById(R.id.btnCalculate);


//        tvCheckIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                loadDatePicker();
//            }
//        });

        String Countries[] = {"Nepal","China","Inida","Bangladesh","Bhutan","Pakistan","London","USA"};
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_checked, Countries);
        spinCountry.setAdapter(adapter);

        String Room [] = {"Delux", "Presidential","Platenium"};
        ArrayAdapter adapter1 = new ArrayAdapter<>(this, android.R.layout