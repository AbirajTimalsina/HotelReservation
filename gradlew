<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">


    <EditText
        android:id="@+id/etName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Fullname"
        android:textSize="25dp"
        android:layout_margin="20dp" />

    <GridLayout

        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/tvCheckIn"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="CheckIn"
            android:layout_marginLeft="75dp"
            android:textSize="20dp" />

        <TextView
            android:id="@+id/tvCheckOut"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="65dp"
            android:text="CheckOut"
            android:textSize="20dp"/>

    </GridLayout>

    <TextView

        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Country:"
        android:layout_margin="20dp"
        android:textSize="20dp"/>

    <Spinner
        android:layout_width="match_parent"
        android:layout_height="35dp"
        android:id="@+id/spinCountry"/>

    <TextView

        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Room Type:"
        android:layout_margin="20dp"
        android:textSize="20dp"/>

    <Spinner
        android:layout_width="match_parent"
        android:layout_height="35dp"
        android:id="@+id/spinRoom"/>

    <GridLayout

        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/tvAdult"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="20dp"
            android:layout_marginLeft="60dp"
            android:text="Adult"
            android:textSize="20dp" />


        <TextView
            android:id="@+id/tvChild"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginRight="20dp"
            android:layout_margin="20dp"
            android:text="Children"
            android:textSize="20dp"/>

        <TextView
            android:id="@+id/TvRoom"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="20dp"
            android:text="Room"
            android:textSize="20dp"/>

        <EditText
            android:id="@+id/etAdult"
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_margin="70dp"
            android:layout_marginLeft="-270dp"
            android:hint="0"
            android:textSize="25dp" />

        <EditText
            android:id="@+id/etChildren"
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_margin="70dp"
            android:layout_marginLeft="-35dp"
            android:hint="0"
            android:textSize="25dp" />

        <EditText
            android:id="@+id/etRoom"
            android:layout_width="50dp"
            android:layout_height="wrap_content"
            android:layout_margin="70dp"
            android:layout_marginLeft="-35dp"
            android:hint="0"
            android:textSize="25dp" />


    </GridLayout>

    <Button
        android:id="@+id/btnCalculate"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginHorizontal="50dp"
        android:text="Calculate"
        android:textSize="25dp"
        android:background="@color/colorPrimary"/>

    <GridLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <TextView
            android:id="@+id/tvTotal"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="20dp"
            android:layout_marginLeft="30dp"
            android:text="Total:"
            android:textSize="25dp" />

        <TextView
            android:id="@+id/tvVat"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="20dp"
            android:layout_marginLeft="100dp"
            android:text="VAT:"
            android:textSize="25dp" />

    </GridLayout>

    <TextView
        android:id="@+id/tvGrand"
        android:layout_wi