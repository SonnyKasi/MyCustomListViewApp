package za.cput.ict3.mycustomlistviewapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: Custom Adapter
 */
public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String [] socialAppsNames;
    private final Integer[] socialAppImages;

    public MyListAdapter(Activity context,String[] socialAppsNames,Integer[] socialAppImages)
    {
    super(context,R.layout.activity_image_list,socialAppsNames);
    this.context = context;
    this.socialAppsNames = socialAppsNames;
    this.socialAppImages = socialAppImages;
}


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.activity_image_list,null,true);
        TextView textTitle = (TextView) rowView.findViewById(R.id.TextView2);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        textTitle.setText(socialAppsNames[position]);
        imageView.setImageResource(socialAppImages[position]);
        return rowView;
    }
}
