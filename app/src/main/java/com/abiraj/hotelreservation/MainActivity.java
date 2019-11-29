package com.abiraj.hotelreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.time.Year;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    public Spinner spinCountry, spinRoom;
    public TextView tvchkin, tvchkout, tvcountry, tvrooms, tvcost, tvVat, tvsc, tnettotal, tvroomcost, tvroomno, totaldays;
    public EditText etroom, etchild, etadult, etname;
    public Button btncal;
    int y1, y2, m1, m2, d1, d2, diff;
    double servicecharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinCountry=findViewById(R.id.spinCountry);
        spinRoom=findViewById(R.id.spinRoom);
        tvchkin=findViewById(R.id.tvchkin);
        tvchkout=findViewById(R.id.tvchkout);
        tvcountry=findViewById(R.id.tvcountry);
        tvrooms=findViewById(R.id.tvrooms);
        etchild=findViewById(R.id.etchild);
        etadult=findViewById(R.id.etadult);
        etname=findViewById(R.id.etname);
        btncal=findViewById(R.id.btncal);

        //output data binding
        tvcost=findViewById(R.id.tvcost);
        tvVat=findViewById(R.id.tvVat);
        tvsc=findViewById(R.id.tvsc);
        tnettotal=findViewById(R.id.tnettotal);
        tvroomcost=findViewById(R.id.tvroomcost);
        tvroomno=findViewById(R.id.tvroomno);
        totaldays=findViewById(R.id.totaldays);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(etname.getText())){
                    etname.setError("Please enter your name");
                    etname.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(etadult.getText()))
                {
                    etadult.setError("Please enter number of adults");
                    etadult.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(etchild.getText())) {
                    etchild.setError("Please enter number of Children");
                    etchild.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(etroom.getText())) {
                    etroom.setError("Please enter number of rooms");
                    etroom.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(tvchkin.getText())){
                    tvchkin.setError("Please enter check in Date");
                    tvchkin.requestFocus();
                    return;
                }
                else if(TextUtils.isEmpty(tvchkout.getText())){
                    tvchkout.setError("Please enter check out Date");
                    return;
                }

                Calendar cal1 = Calendar.getInstance();
                Calendar cal2 = Calendar.getInstance();
                cal1.set(y1,m1,d1);
                cal2.set(y2,m2,d2);
                long milis1= cal1.getTimeInMillis();
                long milis2 = cal2.getTimeInMillis();
                long diff = milis1-milis2;
                long diffDays=(diff / (86400000));

                int numRoom = Integer.parseInt(etroom.getText().toString());
                //calculate net total

                double roomprice, totalprice;
                double vat, servicecharge, nettotal;

                String roomtype = spinRoom.getSelectedItem().toString();

                if(roomtype=="Deluxe"){
                    roomprice=2500;
                    totalprice= roomprice * numRoom * diffDays;
                    vat=(0.13 * totalprice) + totalprice;
                    nettotal= servicecharge = (0.10 * vat) + vat;
                    tvcost.setText("Total cost is:" +totalprice);
                    tvVat.setText("Price after VAT inclusion:" +vat);
                    tnettotal.setText("Overall Price:" +nettotal);
                }

                else if(roomtype=="Platenium"){
                    roomprice=3500;
                    totalprice= roomprice * numRoom * diffDays;
                    vat=(0.13 * totalprice) + totalprice;
                    nettotal= servicecharge = (0.10 * vat) + vat;
                    tvcost.setText("Total cost is:" +totalprice);
                    tvVat.setText("Price after VAT inclusion:" +vat);
                    tnettotal.setText("Overall Price:" +nettotal);
                }

                else if(roomtype=="Presidential"){
                    roomprice=4500;
                    totalprice= roomprice * numRoom * diffDays;
                    vat=(0.13 * totalprice) + totalprice;
                    nettotal= servicecharge = (0.10 * vat) + vat;
                    tvcost.setText("Total cost is:" +totalprice);
                    tvVat.setText("Price after VAT inclusion:" +vat);
                    tnettotal.setText("Overall Price:" +nettotal);
                }
            }
        });

        String countries[] = {"Nepal", "China", "Bhutan", "USA", "London", "Dubai"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_checked, countries );
        spinCountry.setAdapter(adapter);

        String Room[] = {"Delux","Presidential","Platenium"};
        ArrayAdapter adapter1 = new ArrayAdapter(this,android.R.layout.simple_list_item_checked, Room);
        spinRoom.setAdapter(adapter1);

        tvchkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDatePicker();
            }
        });

        tvchkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDate();
            }
        });

    }

    private void loadDatePicker(){
        final Calendar c= Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this, year, month, day);
        datePickerDialog.show();

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = "CheckIn Date:" + (month+1) + "/" + dayOfMonth + "/" + year;
        y1= year;
        m1= month;
        d1= dayOfMonth;
        tvchkin.setText(date);
    }

    private void loadDate(){ // out
        final Calendar c1= Calendar.getInstance();
        int year=c1.get(Calendar.YEAR);
        int month=c1.get(Calendar.MONTH);
        final int day = c1.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String date = "Check Out Date:" + (month+1) + "/" + dayOfMonth + "/" + year;
                y2= year;
                m2= month;
                d2= dayOfMonth;
                tvchkout.setText(date);
            }
        },year,month,day);
        datePickerDialog.show();
    }
}
