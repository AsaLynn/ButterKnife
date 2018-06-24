package com.think.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.demonstrate.DemonstrateUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tv.setText("ButterKnife,在Activity中使用!");
    }


    @OnClick(R.id.tv)
    public void onViewClicked() {
        DemonstrateUtil.showToastResult(this,"布局中含有Fragment!");
    }
}
