package com.fauziah.guest.layouting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //1 langkah awal dengan berkenalan terlebih dahulu pada button2 yang kita akan fungsikan
    Button btnScroll, btnRelative, btnLinier, btnFrame, btnConstraint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // 2 inisialisasi variabel sesuai dengan id button
        btnScroll = findViewById(R.id.btn_scroll);
        btnLinier = findViewById(R.id.btn_linier);
        btnRelative = findViewById(R.id.btn_relative);
        btnFrame = findViewById(R.id.btn_frame);
        btnConstraint = findViewById(R.id.btn_constraint);

        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(MenuActivity.this, "Menampilkan Toast", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(MenuActivity.this, ScrollActivity.class);
                startActivity(move);
            }
        });

        btnLinier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder message = new AlertDialog.Builder(MenuActivity.this);
                message.setTitle("Message Dialog");
                message.setMessage("Menampilkan Alert Dialog");
                message.setPositiveButton("Simpan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MenuActivity.this, "Berhasil Tersimpan", Toast.LENGTH_SHORT).show();
                        Intent move = new Intent(MenuActivity.this, MainActivity.class);
                        startActivity(move);
                    }
                });
                message.setNegativeButton("Batal", null);
                message.show();
                }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MenuActivity.this, RelativeActivity.class);
                startActivity(move);
            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MenuActivity.this, FrameActivity.class);
                startActivity(move);
            }
        });
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MenuActivity.this, ConstraintActivity.class);
                startActivity(move);
            }
        });
    }
}
