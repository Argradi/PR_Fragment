package com.ja_granados.pr_fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Carta#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Carta extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Carta() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Carta.
     */
    // TODO: Rename and change types and number of parameters
    public static Carta newInstance(String param1, String param2) {
        Carta fragment = new Carta();
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
        return inflater.inflate(R.layout.fragment_carta, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle saveInstanceState){

        ImageButton flecha=view.findViewById(R.id.flecha);
        ImageView carta=view.findViewById(R.id.carta);
        TextView texto=view.findViewById(R.id.texto);
        super.onViewCreated(view, saveInstanceState);

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),MainActivity.class);
                startActivity(intent);
            }
        });

        int num=(int)(Math.random()*100+1);
        if(num>0 && num<51){
            int num2=(int)(Math.random()*100+1);
            if(num2>0 && num2<21){
                carta.setImageResource(R.drawable.diglett);
                texto.setText("Te ha tocado Diglet");
            }
            if(num2>20 && num2<41){
                carta.setImageResource(R.drawable.riolu);
                texto.setText("Te ha tocado Riolu");
            }
            if(num2>40 && num2<61){
                carta.setImageResource(R.drawable.rockruff);
                texto.setText("Te ha tocado Rockruf");
            }
            if(num2>60 && num2<81){
                carta.setImageResource(R.drawable.froakie);
                texto.setText("Te ha tocado Froakie");
            }
            if(num2>80 && num2<101){
                carta.setImageResource(R.drawable.charmander);
                texto.setText("Te ha tocado Charmander");
            }
        }
        if(num>50 && num<91){
            int num2=(int)(Math.random()*100+1);
            if(num2>0 && num2<26){
                carta.setImageResource(R.drawable.greninja);
                texto.setText("Te ha tocado Greninja, no esta mal");
            }
            if(num2>25 && num2<51){
                carta.setImageResource(R.drawable.lucario);
                texto.setText("TTe ha tocado Lucario, no esta mal");
            }
            if(num2>50 && num2<76){
                carta.setImageResource(R.drawable.lycanroc);
                texto.setText("Te ha tocado Lycanroc, no esta mal");
            }
            if(num2>75 && num2<101){
                carta.setImageResource(R.drawable.gengar);
                texto.setText("Te ha tocado Mega Gengar, no esta mal");
            }
        }
        if(num>90 && num<101){
            int num2=(int)(Math.random()*100+1);
            if(num2>0 && num2<51){
                carta.setImageResource(R.drawable.charizard);
                texto.setText("Te ha tocado Charizard BOOOOOOOF");
            }
            else {
                carta.setImageResource(R.drawable.moonbreon);
                texto.setText("Te ha tocado Moonbreon, Que suerteeee");
            }
        }
    }
}