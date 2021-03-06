package com.example.fragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String  ARG_PARAM1 = "Res";
    private static final String ARG_PARAM2 = "TEXT";
    private static final String ARG_PARAM3 = "DETAILS";

    // TODO: Rename and change types of parameters
    private int resval;
    private String name, details;
    private ImageView img ;
    private TextView txt, txt2;

    public ImageFragment() {
        // Required empty public constructor
    }



    // TODO: Rename and change types and number of parameters
    public static ImageFragment newInstance(int param1, String param2, String param3) {
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            resval = getArguments().getInt(ARG_PARAM1);
            name = getArguments().getString(ARG_PARAM2);
            details = getArguments().getString(ARG_PARAM3);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        img = (ImageView)view.findViewById(R.id.imageView4);
        txt = (TextView)view.findViewById(R.id.text);
        txt2 = (TextView)view.findViewById(R.id.textView2);
        txt.setText(name);
        txt2.setText(details);
        img.setImageResource(resval);
        return view;
    }
}
