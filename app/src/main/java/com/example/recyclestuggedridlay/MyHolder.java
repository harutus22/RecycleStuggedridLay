package com.example.recyclestuggedridlay;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    private ImageView delete;
    private OnClick onClick;
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(onClick !=null){
                onClick.onDeleteClicked(getAdapterPosition());
            }
        }
    };

    MyHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
        delete = itemView.findViewById(R.id.delete);
        delete.setOnClickListener(onClickListener);
    }

    interface OnClick{
        void onDeleteClicked(int position);
    }

    void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    ImageView getImageView() {
        return imageView;
    }

    TextView getTextView() {
        return textView;
    }
}
