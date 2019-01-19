package com.example.android.miwok.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.miwok.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        final FragmentManager fm = getActivity().getSupportFragmentManager();

        TextView Numbers = (TextView)v.findViewById(R.id.numbers);
        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DetailsFragment detailsNumbers;
                detailsNumbers = DetailsFragment.newInstance(DetailsFragment.TYPE_NUMBERS);
                fm.beginTransaction().replace(R.id.fragment_container,detailsNumbers).addToBackStack(null).commit();

            }
        });

        TextView family = (TextView)v.findViewById(R.id.familyN);
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                DetailsFragment detailsFamily;
                detailsFamily = DetailsFragment.newInstance(DetailsFragment.TYPE_FAMILY);
                fm.beginTransaction().replace(R.id.fragment_container,detailsFamily).addToBackStack(null).commit();
            }
        });

        TextView color = (TextView)v.findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DetailsFragment detailsColors;
                detailsColors = DetailsFragment.newInstance(DetailsFragment.TYPE_COLORS);
                fm.beginTransaction().replace(R.id.fragment_container,detailsColors).addToBackStack(null).commit();
            }
        });

        TextView phrase = (TextView)v.findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                DetailsFragment detailsPhrases;
                detailsPhrases = DetailsFragment.newInstance(DetailsFragment.TYPE_PHRASES);
                fm.beginTransaction().replace(R.id.fragment_container,detailsPhrases).addToBackStack(null).commit();
            }
        });

        return v;
    }

}