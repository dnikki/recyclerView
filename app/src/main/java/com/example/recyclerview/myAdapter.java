
package com.example.recyclerview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.holder> {
   String data[];
   public myAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View view  = inflator.inflate(R.layout.singlerow,parent,false);
        return  new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

       String title = data[position];
       holder.t1.setText(title);
    }

    @Override
    public int getItemCount() {
       return data.length;
    }

    class holder extends RecyclerView.ViewHolder {
        TextView t1;
        ImageView img;
        public holder(@NonNull View itemView) {
            super(itemView);

            img= itemView.findViewById(R.id.img);
            t1= itemView.findViewById(R.id.txt);
        }
    }{

    }
}
