package com.example.kuis_bintangfauzandyan;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class print_nota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.transaksi2);
        //menerima data dari put extra
        String nama_nota = getIntent().getStringExtra("nama");
        String alamat_nota = getIntent().getStringExtra("alamat");
        String kelamin = getIntent().getStringExtra("jenis kelamin");
        String barang = getIntent().getStringExtra("nama barang");
        String jumlah_barang_beli = getIntent().getStringExtra("jumlah barang");
        String harga_barang = getIntent().getStringExtra("harga");
        String total_semua = getIntent().getStringExtra("total");
        String diskon_harga = getIntent().getStringExtra("diskon");
        String diskon_member_pelanggan = getIntent().getStringExtra("diskon member");
        String jumlah_bayar_semua = getIntent().getStringExtra("jumlah bayar");



        TextView nama_member = (TextView) findViewById(R.id.tv_pelanggan);
        TextView alamat_pelanggan = (TextView) findViewById(R.id.tv_nt_alamat);
        TextView jenis_kelamin = (TextView) findViewById(R.id.tv_kelamin);
        TextView nama_barang = (TextView) findViewById(R.id.tv_nt_nama_barang);
        TextView tv_jumlah_barang = (TextView) findViewById(R.id.tv_nt_jumlah_barang);
        TextView tv_harga_barang = (TextView) findViewById(R.id.nt_harga);
        TextView tv_total_semua = (TextView) findViewById(R.id.nt_total);
        TextView tv_diskon_harga = (TextView) findViewById(R.id.tv_nt_dis_harga);
        TextView tv_diskon_member = (TextView) findViewById(R.id.nt_dis_member);
        TextView tv_jumlah_bayar = (TextView) findViewById(R.id.nt_jumlah_bayar);



        nama_member.setText("Nama : " + nama_nota);
        alamat_pelanggan.setText("Alamat Pelanggan : " +alamat_nota);
        jenis_kelamin.setText("Jenis kelamin : " + kelamin);
        nama_barang.setText("Nama Barang : " + barang);
        tv_jumlah_barang.setText("Jumlah Barang : " + jumlah_barang_beli);
        tv_harga_barang.setText("Harga  : " + harga_barang);
        tv_total_semua.setText("Total Harga :" + total_semua);
        tv_diskon_harga.setText("Disc.Harga : " + diskon_harga);
        tv_diskon_member.setText("Disc. Member : " + diskon_member_pelanggan);
        tv_jumlah_bayar.setText("Jumlah Bayar : " + jumlah_bayar_semua);
    }


    //TextView navUsername = (TextView) headerview.findViewById(R.id.tvuser);

    //navUsername.setText(""+user_login);
}
