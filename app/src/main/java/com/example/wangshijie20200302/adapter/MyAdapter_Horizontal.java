package com.example.wangshijie20200302.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wangshijie20200302.R;
import com.example.wangshijie20200302.bean.Bean;

import java.util.List;


/**
 * 王世杰
 * 20200302
 */
public class MyAdapter_Horizontal extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context; List<Bean.DataBean.VerticalListDataBean> horizontalListData;

    public MyAdapter_Horizontal(Context context, List<Bean.DataBean.VerticalListDataBean> horizontalListData) {
        this.context = context;
        this.horizontalListData = horizontalListData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = View.inflate(context, R.layout.item,null);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {

        Glide.with(context).load(horizontalListData.get(i).getImageurl()).error(R.mipmap.ic_launcher).placeholder(R.mipmap.ic_launcher).into(((ViewHolder)viewHolder).iv);
        ((ViewHolder)viewHolder).tv_name.setText(horizontalListData.get(i).getTitle());
        ((ViewHolder)viewHolder).tv_price.setText(horizontalListData.get(i).getPrice());
        ((ViewHolder)viewHolder).ll_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnclick!=null){
                    mOnclick.onSuccess(i);
                }
            }
        });
    }
    private onClick mOnclick;

    public void setmOnclick(onClick onclick){
        mOnclick=onclick;
    }

    public interface onClick{
        void onSuccess(int i);
    }

    @Override
    public int getItemCount() {
        return horizontalListData.size();
    }
    class ViewHolderTop extends RecyclerView.ViewHolder{

        private ImageView iv_top;

        public ViewHolderTop(@NonNull View itemView) {
            super(itemView);
            iv_top = itemView.findViewById(R.id.iv_top);
        }
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv;
        private TextView tv_name;
        private TextView tv_price;
        private final LinearLayout ll_item;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            iv= itemView.findViewById(R.id.iv);
            tv_name= itemView.findViewById(R.id.tv_name);
            tv_price= itemView.findViewById(R.id.tv_name);
            ll_item = itemView.findViewById(R.id.tv_name);
        }
    }
    class ViewHolderBottom extends RecyclerView.ViewHolder{
        private ImageView iv_buttom;
        private TextView buttom_name;
        private TextView buttom_price;
        public ViewHolderBottom(@NonNull View itemView) {
            super(itemView);
            iv_buttom= itemView.findViewById(R.id.tv_name);
            buttom_name= itemView.findViewById(R.id.tv_name);
            buttom_price= itemView.findViewById(R.id.tv_name);
        }
    }
}
