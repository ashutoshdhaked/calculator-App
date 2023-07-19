package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.t1) TextView t1;
    @BindView(R.id.t2) TextView t2;
    @BindView(R.id.ac) Button ac;
    @BindView(R.id.clear) Button clear;
    @BindView(R.id.ans) Button ans;
    @BindView(R.id.mod) Button mod;
    @BindView(R.id.seven) Button seven;
    @BindView(R.id.eight) Button eight;
    @BindView(R.id.nine) Button nine;
    @BindView(R.id.add) Button add;
    @BindView(R.id.four) Button four;
    @BindView(R.id.five) Button five;
    @BindView(R.id.six) Button six;
    @BindView(R.id.sub) Button sub;
    @BindView(R.id.one) Button one;
    @BindView(R.id.two) Button two;
    @BindView(R.id.three) Button three;
    @BindView(R.id.mul) Button mul;
    @BindView(R.id.equal) Button equal;
    @BindView(R.id.zero) Button zero;
    @BindView(R.id.dot) Button dot;
    @BindView(R.id.div) Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        ButtonListener b = new ButtonListener(this);
        ac.setOnClickListener(b);
        clear.setOnClickListener(b);
        ans.setOnClickListener(b);
        mod.setOnClickListener(b);
        seven.setOnClickListener(b);
        eight.setOnClickListener(b);
        nine.setOnClickListener(b);
        add.setOnClickListener(b);
        four.setOnClickListener(b);
        five.setOnClickListener(b);
        six.setOnClickListener(b);
        sub.setOnClickListener(b);
        one.setOnClickListener(b);
        two.setOnClickListener(b);
        three.setOnClickListener(b);
        mul.setOnClickListener(b);
        equal.setOnClickListener(b);
        zero.setOnClickListener(b);
        dot.setOnClickListener(b);
        div.setOnClickListener(b);


    }


}