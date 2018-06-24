package com.think.butterknife;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.demonstrate.DemonstrateUtil;

import java.util.List;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    @BindView(R.id.tv_fm1)
    TextView tvFm1;
    Unbinder unbinder;
    @BindViews({ R.id.btn1,R.id.btn2 })
    List<Button> buttons;
    @BindColor(R.color.colorAccent)
    int colorAccent;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_blank, null);
        unbinder = ButterKnife.bind(this, view);
        tvFm1.setText("fragment中使用ButterKnife!");
        tvFm1.setTextColor(colorAccent);
        Button btn2 = buttons.get(1);
        btn2.setText("适配器使用ButterKnife");
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                DemonstrateUtil.showToastResult(getContext(),"fragment中的第1个按钮!");
                break;
            case R.id.btn2:
                startActivity(new Intent(getActivity(),AdpActivity.class));
                break;
        }
    }
}
