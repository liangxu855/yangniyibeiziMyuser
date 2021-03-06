package com.honganjk.ynybzbizfood.view.store.classify.adapter;

import android.content.Context;

import com.honganjk.ynybzbizfood.R;
import com.honganjk.ynybzbizfood.code.base.baseadapter.ViewHolder;
import com.honganjk.ynybzbizfood.code.base.baseadapter.recyclerview.CommonAdapter;
import com.honganjk.ynybzbizfood.code.base.view.activity.BaseActivity;
import com.honganjk.ynybzbizfood.mode.javabean.store.home.StoreHomeData;

import java.util.List;

/**
 * 说明:
 * 作者： 杨阳; 创建于：  2017-06-29  15:41
 */
public class StoreClassifyAdapter extends CommonAdapter<StoreHomeData.ObjsBean> {
    BaseActivity mContext;

    public StoreClassifyAdapter(BaseActivity context, List<StoreHomeData.ObjsBean> datas) {
        super(context, R.layout.store_item_classify, datas);
        mContext = context;
    }

    private StoreClassifyAdapter(Context context, int layoutId, List<StoreHomeData.ObjsBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(ViewHolder holder, final StoreHomeData.ObjsBean data) {
        holder.setImageBitmapRound(R.id.picture, data.getImg(), 5);
//        holder.setImageResource(R.id.picture, R.mipmap.test_picture);
        holder.setText(R.id.name, data.getTitle());
        holder.setText(R.id.provider,data.getFeature());
        holder.setText(R.id.price, data.getMoneyStr());
        holder.setText(R.id.oldPirce,data.getPrice());
        holder.getStrikeTextView(R.id.oldPirce);

//
//        holder.setOnClickListener(R.id.addShoppingCar, new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mAddShoppingCarListener != null) {
//                    mAddShoppingCarListener.addShoppingCar(data.getId(),data.getId());
//                }
//            }
//        });
    }

    @Override
    public void convert(ViewHolder holder, List<StoreHomeData.ObjsBean> t) {

    }

    AddShoppingCarListener mAddShoppingCarListener;

    public void setAddShoppingCarListener(AddShoppingCarListener addShoppingCarListener) {
        mAddShoppingCarListener = addShoppingCarListener;
    }

    public interface AddShoppingCarListener {
        void addShoppingCar(int did, int type);
    }
}
