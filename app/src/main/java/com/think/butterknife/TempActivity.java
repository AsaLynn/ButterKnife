package com.think.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demonstrate.DemonstrateUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TempActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.iv)
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        ButterKnife.bind(this);
        tv.setTextColor(getResources().getColor(R.color.colorAccent));
        tv.setText("ButterKnife!");
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        DemonstrateUtil.showLogResult("OnClick");
        DemonstrateUtil.showToastResult(this,"OnClick");
    }
}
