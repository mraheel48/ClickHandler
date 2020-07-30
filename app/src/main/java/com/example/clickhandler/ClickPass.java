package com.example.clickhandler;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

class ClickPass implements View.OnClickListener {

    private Context mContext;

    ClickPass(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.textView:
                Toast.makeText(mContext, "Text View Click", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView:
                Toast.makeText(mContext, "Image view Click", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(mContext, "Other id", Toast.LENGTH_SHORT).show();
        }
    }

}
