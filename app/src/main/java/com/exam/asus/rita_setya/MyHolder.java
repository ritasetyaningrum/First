package com.exam.asus.rita_setya;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by ASUS on 10/4/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView img;
    TextView nameTxt;
    TextView posText;
    private ItemClickListener itemClickListener;


    public MyHolder(View itemView) {
        super(itemView);

        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);
        img = (ImageView) itemView.findViewById(R.id.playerImage);
        posText = (TextView) itemView.findViewById(R.id.posTxt);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;

    }
}
