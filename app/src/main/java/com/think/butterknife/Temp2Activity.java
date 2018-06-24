package com.think.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Temp2Activity extends AppCompatActivity {

    @BindView(R.id.iv1)
    ImageView iv1;
    @BindView(R.id.tv1)
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv1)
    public void onViewClicked() {
    }
}
