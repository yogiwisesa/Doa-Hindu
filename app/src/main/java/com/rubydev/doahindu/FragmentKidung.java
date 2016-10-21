package com.rubydev.doahindu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class FragmentKidung extends Fragment{
    private ListView mListView;
    private List<String> mList;
    public FragmentKidung() {
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
        View fragmentView = inflater.inflate(R.layout.fragment_kidung, container, false);
        mListView = (ListView) fragmentView.findViewById(R.id.ListKidung);

        mList = new ArrayList<String>();
        mList.add("Tes 1");
        mList.add("Tes 2");
        mList.add("Tes 3");
        mList.add("Tes 1");
        mList.add("Tes 2");

        mListView.setAdapter(new adapterKidung());

        return fragmentView;
    }

    private class adapterKidung extends BaseAdapter {

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public Object getItem(int position) {
            return mList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View rowView = getActivity().getLayoutInflater().inflate(R.layout.row, null);

            TextView textView = (TextView) rowView.findViewById(R.id.textNama);
            textView.setText(mList.get(position));
            return rowView;
        }
    }

}