package com.think.butterknife;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindBitmap;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by think on 2017/11/12.
 */

public class MyAdapter extends BaseAdapter {



    private List<ItemInfo> mList;

    public MyAdapter(List<ItemInfo> list) {
        mList = list;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = View.inflate(parent.getContext(), R.layout.item_list, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvItem.setText(mList.get(position).name);
        if (position % 2 == 0) {
            viewHolder.iv.setImageBitmap(viewHolder.bitmap);
        }else {
            viewHolder.iv.setImageResource(R.mipmap.ic_launcher_round);
        }
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_item)
        TextView tvItem;
        @BindView(R.id.iv)
        ImageView iv;
        @BindBitmap(R.mipmap.ic_launcher)
        Bitmap bitmap;
        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
