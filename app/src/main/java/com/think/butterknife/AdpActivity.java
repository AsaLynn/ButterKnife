package com.think.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindArray;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdpActivity extends AppCompatActivity {

    @BindView(R.id.lv)
    ListView lv;

    @BindArray(R.array.names)
    String[] names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adp);
        ButterKnife.bind(this);
        List<ItemInfo> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            ItemInfo info = new ItemInfo();
            info.name = names[i];
            info.age = "age"+i;
            list.add(info);
        }
        lv.setAdapter(new MyAdapter(list));
    }

}
