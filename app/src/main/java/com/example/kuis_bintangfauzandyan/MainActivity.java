package com.example.kuis_bintangfauzandyan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etnama_pelanggan, etalamat_pelanggan,etjumlah_barang;
    private Button btn_proses, btn_cancel;
    private RadioGroup rgjenis_kelamin,rg_tipe_pelanggan,rgNamaBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaksi);

        etnama_pelanggan = (EditText)findViewById(R.id.etnama_pelanggan);
        etalamat_pelanggan = (EditText) findViewById(R.id.etalamat_pelanggan);
        btn_proses = (Button) findViewById(R.id.btn_proses);
        btn_cancel = (Button) findViewById(R.id.btn_cancel);
        rgjenis_kelamin = (RadioGroup) findViewById(R.id.rgjenis_kelamin);
        rg_tipe_pelanggan = (RadioGroup) findViewById(R.id.rg_tipe_pelanggan);
        rgNamaBarang = (RadioGroup) findViewById(R.id.rgNamaBarang);
        etjumlah_barang = (EditText) findViewById(R.id.et_jumlahBarang);

        btn_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                print_sukses();
            }
        });

    }

    private void print_sukses() {
        Intent i = new Intent(MainActivity.this,print_nota.class);

        String nama_pelanggan = etnama_pelanggan.getText().toString();
        String alamat_pelanggan = etalamat_pelanggan.getText().toString();
        String jumlah_barang = etjumlah_barang.getText().toString();
        final String jenis_kelamin = ((RadioButton) findViewById(rgjenis_kelamin.getCheckedRadioButtonId())).getText().toString();
        final String tipe_pelanggan = ((RadioButton) findViewById(rg_tipe_pelanggan.getCheckedRadioButtonId())).getText().toString();
        final String nama_barang = ((RadioButton) findViewById(rgNamaBarang.getCheckedRadioButtonId())).getText().toString();

        //faktur
        int harga = 0;
        double diskon;

        if(nama_barang.equalsIgnoreCase("android")){
            harga = 1000000;
        }
        if(nama_barang.equalsIgnoreCase("iphone")){
            harga = 2000000;
        }
        if(nama_barang.equalsIgnoreCase("windows phone")){
            harga = 3000000;
        }

        int barang = Integer.parseInt(jumlah_barang);
        diskon = barang * (harga * (double) 20/100);

        int diskonMember = 0;
        if(tipe_pelanggan.equalsIgnoreCase("gold")){

        }
        if(tipe_pelanggan.equalsIgnoreCase("silver")){

        }
        if(tipe_pelanggan.equalsIgnoreCase("biasa")){

        }

        int jumlah_bayar = ((barang * harga) - (int) diskon) - diskonMember;
        int total = barang * harga;

        String sHarga = String.valueOf(harga);
        String sTotal = String.valueOf(total);
        String sDiskon = String.valueOf(diskon);
        String sdiskon_member = String.valueOf(diskonMember);
        String sJumlah_bayar = String.valueOf(jumlah_bayar);

        //mengirim data pelanggan
        i.putExtra("nama",nama_pelanggan);
        i.putExtra("alamat",alamat_pelanggan);
        i.putExtra("jenis kelamin",jenis_kelamin);
        i.putExtra("tipe pelanggan", tipe_pelanggan);
        i.putExtra("nama barang",nama_barang);
        i.putExtra("jumlah barang", jumlah_barang);
        i.putExtra("harga" , sHarga);
        i.putExtra("total", sTotal);
        i.putExtra("diskon", sDiskon);
        i.putExtra("diskon member" , sdiskon_member);
        i.putExtra("jumlah bayar", sJumlah_bayar);
        startActivity(i);
    }
}