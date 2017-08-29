package com.honganjk.ynybzbizfood.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;

import com.honganjk.ynybzbizfood.R;
import com.honganjk.ynybzbizfood.utils.ui.ScreenInfoUtils;

import butterknife.ButterKnife;

/**
 * 透明对话框
 * Created by yang on 2016/8/24.
 */

public class DialogTransparency extends Dialog {
    private Context context;

    public DialogTransparency(Context context) {
        this(context, R.style.Dialog_Translucent);
    }

    public DialogTransparency(Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
        init();
    }

    private void init() {
        View view = new View(context);
        setContentView(view);
        ButterKnife.bind(this, getWindow().getDecorView().findViewById(view.getId()));



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WindowManager.LayoutParams lp = getWindow().getAttributes();
        ScreenInfoUtils screen = new ScreenInfoUtils();
        lp.width = (screen.getWidth()); //设置宽度
        lp.height = (screen.getHeight()); //设置宽度
        getWindow().setAttributes(lp);
        getWindow().getAttributes().gravity = Gravity.CENTER;
    }


}
