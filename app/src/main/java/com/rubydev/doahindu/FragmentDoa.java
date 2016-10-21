package com.rubydev.doahindu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class FragmentDoa extends Fragment{
    private ListView mListView;
    private List<String> mListJudul;
    private List<String> mListDoa;
    private List<String> mListArti;


    public FragmentDoa() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_doa, container, false);
        mListView = (ListView) fragmentView.findViewById(R.id.ListDoa);

        mListJudul = new ArrayList<String>();
        mListJudul.add(getResources().getString(R.string.jDoa_panganjali));
        mListJudul.add(getResources().getString(R.string.jDoa_Baru_Bangun_Pagi));
        mListJudul.add(getResources().getString(R.string.jDoa_Cuci_Muka));
        mListJudul.add(getResources().getString(R.string.jMenggosok_Gigi));
        mListJudul.add(getResources().getString(R.string.jDoa_Berkumur));
        mListJudul.add(getResources().getString(R.string.jDoa_Membersihkan_Kaki_));
        mListJudul.add(getResources().getString(R.string.jDoa_Mandi));
        mListJudul.add(getResources().getString(R.string.jDoa_Pada_Waktu_Mengenakan_Pakaian));
        mListJudul.add(getResources().getString(R.string.jDoa_Menghadapi_Makanan));
        mListJudul.add(getResources().getString(R.string.jDoa_Yadnya_Sesa));
        mListJudul.add(getResources().getString(R.string.jDoa_Mulai_Makan));
        mListJudul.add(getResources().getString(R.string.jDoa_Sesudah_Makan));
        mListJudul.add(getResources().getString(R.string.jDoa_Memulai_Pekerjaan));
        mListJudul.add(getResources().getString(R.string.jDoa_Selesai_Bekerja));
        mListJudul.add(getResources().getString(R.string.jDoa_Mohon_Bimbingan_Tuhan));
        mListJudul.add(getResources().getString(R.string.jDoa_Mohon_Inspirasi));
        mListJudul.add(getResources().getString(R.string.jDoa_Mohon_Kecerdasan));
        mListJudul.add(getResources().getString(R.string.jDoa_Waktu_Mulai_Membaca_Veda));
        mListJudul.add(getResources().getString(R.string.jDoa_Mulai_Belajar));
        mListJudul.add(getResources().getString(R.string.jDoa_Mengheningkan_Cipta));
        mListJudul.add(getResources().getString(R.string.jDoa_Memotong_Hewan));
        mListJudul.add(getResources().getString(R.string.jDoa_Mengunjungi_Orang_Sakit));
        mListJudul.add(getResources().getString(R.string.jDoa_Mendengar_Atau_Melayat_Orang_Mati));
        mListJudul.add(getResources().getString(R.string.jDoa_Para_Pedagang));
        mListJudul.add(getResources().getString(R.string.jDoa_Saat_Sakit));
        mListJudul.add(getResources().getString(R.string.jDoa_Menghilangkan_Rasa_Takut));
        mListJudul.add(getResources().getString(R.string.jDoa_Menghindari_Malapetaka));
        mListJudul.add(getResources().getString(R.string.jDoa_Resepsi_Pengantin));
        mListJudul.add(getResources().getString(R.string.jDoa_Mohon_Ketenangan_Rumah_Tangga));
        mListJudul.add(getResources().getString(R.string.jDoa_Kelahiran_Bayi));
        mListJudul.add(getResources().getString(R.string.jDoa_Ulang_Tahun_Kelahiran));
        mListJudul.add(getResources().getString(R.string.jDoa_Menolak_Bahaya));
        mListJudul.add(getResources().getString(R.string.jDoa_Sebelum_Melakukan_Hubungan_Suami_Istri));
        mListJudul.add(getResources().getString(R.string.jDoa_Pembuka_Rapat));
        mListJudul.add(getResources().getString(R.string.jDoa_Menutup_Rapat));
        mListJudul.add(getResources().getString(R.string.jDoa_Pramasanti_));


        mListDoa = new ArrayList<String>();
        mListDoa.add(getResources().getString(R.string.Doa_panganjali));
        mListDoa.add(getResources().getString(R.string.Doa_Baru_Bangun_Pagi));
        mListDoa.add(getResources().getString(R.string.Doa_Cuci_Muka));
        mListDoa.add(getResources().getString(R.string.Menggosok_Gigi));
        mListDoa.add(getResources().getString(R.string.Doa_Berkumur));
        mListDoa.add(getResources().getString(R.string.Doa_Membersihkan_Kaki_));
        mListDoa.add(getResources().getString(R.string.Doa_Mandi));
        mListDoa.add(getResources().getString(R.string.Doa_Pada_Waktu_Mengenakan_Pakaian));
        mListDoa.add(getResources().getString(R.string.Doa_Menghadapi_Makanan));
        mListDoa.add(getResources().getString(R.string.Doa_Yadnya_Sesa));
        mListDoa.add(getResources().getString(R.string.Doa_Mulai_Makan));
        mListDoa.add(getResources().getString(R.string.Doa_Sesudah_Makan));
        mListDoa.add(getResources().getString(R.string.Doa_Memulai_Pekerjaan));
        mListDoa.add(getResources().getString(R.string.Doa_Selesai_Bekerja));
        mListDoa.add(getResources().getString(R.string.Doa_Mohon_Bimbingan_Tuhan));
        mListDoa.add(getResources().getString(R.string.Doa_Mohon_Inspirasi));
        mListDoa.add(getResources().getString(R.string.Doa_Mohon_Kecerdasan));
        mListDoa.add(getResources().getString(R.string.Doa_Waktu_Mulai_Membaca_Veda));
        mListDoa.add(getResources().getString(R.string.Doa_Mulai_Belajar));
        mListDoa.add(getResources().getString(R.string.Doa_Mengheningkan_Cipta));
        mListDoa.add(getResources().getString(R.string.Doa_Memotong_Hewan));
        mListDoa.add(getResources().getString(R.string.Doa_Mengunjungi_Orang_Sakit));
        mListDoa.add(getResources().getString(R.string.Doa_Mendengar_Atau_Melayat_Orang_Mati));
        mListDoa.add(getResources().getString(R.string.Doa_Para_Pedagang));
        mListDoa.add(getResources().getString(R.string.Doa_Saat_Sakit));
        mListDoa.add(getResources().getString(R.string.Doa_Menghilangkan_Rasa_Takut));
        mListDoa.add(getResources().getString(R.string.Doa_Menghindari_Malapetaka));
        mListDoa.add(getResources().getString(R.string.Doa_Resepsi_Pengantin));
        mListDoa.add(getResources().getString(R.string.Doa_Mohon_Ketenangan_Rumah_Tangga));
        mListDoa.add(getResources().getString(R.string.Doa_Kelahiran_Bayi));
        mListDoa.add(getResources().getString(R.string.Doa_Ulang_Tahun_Kelahiran));
        mListDoa.add(getResources().getString(R.string.Doa_Menolak_Bahaya));
        mListDoa.add(getResources().getString(R.string.Doa_Sebelum_Melakukan_Hubungan_Suami_Istri));
        mListDoa.add(getResources().getString(R.string.Doa_Pembuka_Rapat));
        mListDoa.add(getResources().getString(R.string.Doa_Menutup_Rapat));
        mListDoa.add(getResources().getString(R.string.Doa_Pramasanti_));

        mListArti = new ArrayList<String>();
        mListArti.add(getResources().getString(R.string.aDoa_panganjali));
        mListArti.add(getResources().getString(R.string.aDoa_Baru_Bangun_Pagi));
        mListArti.add(getResources().getString(R.string.aDoa_Cuci_Muka));
        mListArti.add(getResources().getString(R.string.aMenggosok_Gigi));
        mListArti.add(getResources().getString(R.string.aDoa_Berkumur));
        mListArti.add(getResources().getString(R.string.aDoa_Membersihkan_Kaki_));
        mListArti.add(getResources().getString(R.string.aDoa_Mandi));
        mListArti.add(getResources().getString(R.string.aDoa_Pada_Waktu_Mengenakan_Pakaian));
        mListArti.add(getResources().getString(R.string.aDoa_Menghadapi_Makanan));
        mListArti.add(getResources().getString(R.string.aDoa_Yadnya_Sesa));
        mListArti.add(getResources().getString(R.string.aDoa_Mulai_Makan));
        mListArti.add(getResources().getString(R.string.aDoa_Sesudah_Makan));
        mListArti.add(getResources().getString(R.string.aDoa_Memulai_Pekerjaan));
        mListArti.add(getResources().getString(R.string.aDoa_Selesai_Bekerja));
        mListArti.add(getResources().getString(R.string.aDoa_Mohon_Bimbingan_Tuhan));
        mListArti.add(getResources().getString(R.string.aDoa_Mohon_Inspirasi));
        mListArti.add(getResources().getString(R.string.aDoa_Mohon_Kecerdasan));
        mListArti.add(getResources().getString(R.string.aDoa_Waktu_Mulai_Membaca_Veda));
        mListArti.add(getResources().getString(R.string.aDoa_Mulai_Belajar));
        mListArti.add(getResources().getString(R.string.aDoa_Mengheningkan_Cipta));
        mListArti.add(getResources().getString(R.string.aDoa_Memotong_Hewan));
        mListArti.add(getResources().getString(R.string.aDoa_Mengunjungi_Orang_Sakit));
        mListArti.add(getResources().getString(R.string.aDoa_Mendengar_Atau_Melayat_Orang_Mati));
        mListArti.add(getResources().getString(R.string.aDoa_Para_Pedagang));
        mListArti.add(getResources().getString(R.string.aDoa_Saat_Sakit));
        mListArti.add(getResources().getString(R.string.aDoa_Menghilangkan_Rasa_Takut));
        mListArti.add(getResources().getString(R.string.aDoa_Menghindari_Malapetaka));
        mListArti.add(getResources().getString(R.string.aDoa_Resepsi_Pengantin));
        mListArti.add(getResources().getString(R.string.aDoa_Mohon_Ketenangan_Rumah_Tangga));
        mListArti.add(getResources().getString(R.string.aDoa_Kelahiran_Bayi));
        mListArti.add(getResources().getString(R.string.aDoa_Ulang_Tahun_Kelahiran));
        mListArti.add(getResources().getString(R.string.aDoa_Menolak_Bahaya));
        mListArti.add(getResources().getString(R.string.aDoa_Sebelum_Melakukan_Hubungan_Suami_Istri));
        mListArti.add(getResources().getString(R.string.aDoa_Pembuka_Rapat));
        mListArti.add(getResources().getString(R.string.aDoa_Menutup_Rapat));
        mListArti.add(getResources().getString(R.string.aDoa_Pramasanti_));

        mListView.setAdapter(new MyAdapter());

        return fragmentView;
    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mListJudul.size();
        }

        @Override
        public Object getItem(int position) {
            return mListJudul.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View rowView = getActivity().getLayoutInflater().inflate(R.layout.row, null);

            TextView textView = (TextView) rowView.findViewById(R.id.textNama);
            textView.setText(mListJudul.get(position));

            TextView textViewDoa = (TextView) rowView.findViewById(R.id.textDoa);
            textViewDoa.setText(mListDoa.get(position));
            return rowView;
        }
    }

}