package com.mochammadfaris.onboarding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    int images[] = {
        R.drawable.add_missing_place,
        R.drawable.search_place,
        R.drawable.sit_back_and_relax
    };

    String heading[] = {
            "Heading 1",
            "Heading 2",
            "Heading 3"
    };

    String description[] = {
            "Hahahahahahahahahaaaaaaaaaaaahahahahahahahahahahahaaaaaaaaaaaahahahaha",
            "asdasdasjdalskdkladkladklasjdlkajdklasjdklsajdlkajdklasjdlkasjdlksjdlkasjd",
            "hjsakdhajskdhadhqiuhdjasndjncjznckjnciuahcjnckjnzjncjkzncjndcuiancjkanciqjnduiahncjzncjnzcinicnjkncxkjcnicu"
    };

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_image, container, false);

        //mengkaitkan
        ImageView imageView = view.findViewById(R.id.img_slider);
        TextView title = view.findViewById(R.id.txt_title);
        TextView dekription = view.findViewById(R.id.txt_desc);

        imageView.setImageResource(images[position]);
        title.setText(heading[position]);
        dekription.setText(description[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
