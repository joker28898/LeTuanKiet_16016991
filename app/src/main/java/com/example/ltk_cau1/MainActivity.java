package com.example.ltk_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mButtonDangNhap, mButtonThoat;
    private CheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mButtonDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCheckBox.isChecked()){
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu", Toast.LENGTH_LONG).show();
                }
            }
        });

        mButtonThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog();
            }
        });
    }

    private void initView() {
        mButtonDangNhap = findViewById(R.id.button_DangNhap);
        mCheckBox = findViewById(R.id.checkBox_LuuTT);
        mButtonThoat = findViewById(R.id.button_Thoat);
    }

    protected void Dialog(){
        AlertDialog.Builder ad =  new AlertDialog.Builder(this);
        ad.setTitle("Thông báo");
        ad.setMessage("Bạn muốn thoát không ?");
        ad.setPositiveButton("không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        ad.setNegativeButton("có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        ad.show();

    }
}
