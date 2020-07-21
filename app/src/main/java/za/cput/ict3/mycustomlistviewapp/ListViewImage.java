package za.cput.ict3.mycustomlistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewImage extends AppCompatActivity {
    ListView cv;
    Context context;
    ArrayList socialAppList;


    public static Integer [] socialAppImages = {
            R.drawable.facebook,R.drawable.tinder,R.drawable.zoom,R.drawable.twitter,R.drawable.linkedin,R.drawable.skype,
            R.drawable.messenger,R.drawable.whatsapp,R.drawable.instagram,R.drawable.myspace,
    };

    public static String [] socialAppNames = {
            "Facebook","Tinder","Zoom","Twitter","Linkedin","Skype","Messenger","Whatsapp","Instagram","MySpace"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

        MyListAdapter myListAdapter = new MyListAdapter(this, socialAppNames, socialAppImages);
        cv = (ListView) findViewById(R.id.listView2);
        cv.setAdapter(myListAdapter);
        cv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewImage.this, "You clicked:" + socialAppNames[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
    }

