package com.bangato.juaracodingaiapps;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SlideAdapterExample extends SliderViewAdapter<SlideAdapterExample.SliderAdapterVH> {

    private Context context;
    private int mCount;

    public SlideAdapterExample(Context context) {
        this.context = context;
    }

    public void setCount(int count) {
        this.mCount = count;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {


//        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "This is item in position " + position, Toast.LENGTH_SHORT).show();
//            }
//        });


        switch (position) {
            case 0:
                viewHolder.textViewDescription.setText("Programming Fundamental, Data Structure dan Algoritma");
                viewHolder.textViewDescription.setTextSize(24);
                viewHolder.textViewDescription.setTextColor(Color.BLACK);
                viewHolder.textViewDescription2.setText("Modul ini memberikan pengetahuan inti untuk Anda dapat memulai coding dalam bahasa pemograman apa pun. Modul ini menggunakan bahasa Java sebagai pilihan salah satu bahasa pemrogramannya untuk mengeksplorasi syntax dari sebuah bahasa pemrograman, dan menunjukan cara menulis dan mengkesekusi sebuah aplikasi serta mengertikan cara kerjanya.");
                viewHolder.textViewDescription2.setTextSize(16);
                viewHolder.textViewDescription2.setTextColor(Color.BLACK);
//                viewHolder.imageGifContainer.setVisibility(View.GONE);
//                Glide.with(viewHolder.itemView)
//                        .load("https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
//                        .fitCenter()
//                        .into(viewHolder.imageViewBackground);
                break;
            case 2:
                viewHolder.textViewDescription.setText("Web App Front End Development");
                viewHolder.textViewDescription.setTextSize(24);
                viewHolder.textViewDescription.setTextColor(Color.BLACK);
                viewHolder.textViewDescription2.setText("Pada modul ini, Anda akan belajar bagaimana membangun sebuah website berbasiskan technology Java, HTML, CSS dan Java.\n" +
                        "\n" +
                        "Setelah Anda menyelesaikan modul ini, Anda akan memiliki kemampuan untuk membuat sebuah website di mana Andadapat melakukan transaksi di dalamnya, bagaimana User dapat melakukan pendaftaran, login, dan masih banyak lagi. Anda juga akan belajar bagaimana membuat Database dan fungsi CRUD.");
                viewHolder.textViewDescription2.setTextSize(16);
                viewHolder.textViewDescription2.setTextColor(Color.BLACK);
//                viewHolder.imageGifContainer.setVisibility(View.GONE);
//                Glide.with(viewHolder.itemView)
//                        .load("https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260")
//                        .fitCenter()
//                        .into(viewHolder.imageViewBackground);
                break;
            case 4:
                viewHolder.textViewDescription.setText("Webservice Development");
                viewHolder.textViewDescription.setTextSize(24);
                viewHolder.textViewDescription.setTextColor(Color.BLACK);
                viewHolder.textViewDescription2.setText("Pada modul ini, Anda akan belajar bagaimana membangun sebuah werbserviceberbasiskan technology Java SpringBoot, dan juga akan diajarkan bagaimana mengembangkan REST-style. Training ini akan membahas tentang arsitektur Web Service, bagaimana membangun web service, dan bagaimana mengcompilingnya, menerapkannya, dan mengeksekusinya. Peserta akan belajar bagaimana membuat service dari awal kemudian mengintegrasikan service yang dibuat dengan aplikasi java.");
                viewHolder.textViewDescription2.setTextSize(16);
                viewHolder.textViewDescription2.setTextColor(Color.BLACK);
//                viewHolder.imageGifContainer.setVisibility(View.GONE);
//                Glide.with(viewHolder.itemView)
//                        .load("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
//                        .fitCenter()
//                        .into(viewHolder.imageViewBackground);
                break;
            default:
                viewHolder.textViewDescription.setTextSize(24);
                viewHolder.textViewDescription.setTextColor(Color.BLACK);
                viewHolder.textViewDescription.setText("Mobile Development");
                viewHolder.textViewDescription2.setTextSize(16);
                viewHolder.textViewDescription2.setTextColor(Color.BLACK);
                viewHolder.textViewDescription2.setText("Pada modul yang terakhir ini Anda akan belajar bagaimana membuat sebuah mobile app dengan menggunakan teknologi Java yang nantinya aplikasi mobile Anda dapat diimplementasikan di platform Android.");
//                  viewHolder.imageGifContainer.setVisibility(View.VISIBLE);
//                Glide.with(viewHolder.itemView)
//                        .load(R.drawable.juara_coding)
//                        .fitCenter()
//                        .into(viewHolder.imageViewBackground);
//                Glide.with(viewHolder.itemView)
//                        .asGif()
//                        .load(R.drawable.juara_coding)
//                        .into(viewHolder.imageGifContainer);
                break;

        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return mCount;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        ImageView imageGifContainer;
        TextView textViewDescription, textViewDescription2;

        public SliderAdapterVH(View itemView) {
            super(itemView);

            imageGifContainer = itemView.findViewById(R.id.iv_gif_container);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            textViewDescription2 = itemView.findViewById(R.id.tv_auto_image_slider2);

            this.itemView = itemView;
        }
    }


}