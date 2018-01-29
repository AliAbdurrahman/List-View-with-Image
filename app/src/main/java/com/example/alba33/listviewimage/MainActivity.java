package com.example.alba33.listviewimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView ListView;
    int[] image = {R.drawable.persib ,
            R.drawable.vikingbatam,
            R.drawable.vikingpersibclub,
            R.drawable.vikingschoolindonesia,
            R.drawable.vikingschool,};
    String[] Name = {
            "Persib", "Viking Batam", "Viking Persib Club", "Viking School Indonesia", "Viking School"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView = findViewById(R.id.listView);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        ListView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int Position, View convertView, ViewGroup viewGroup) {

            View view = getLayoutInflater().inflate(R.layout.list_activity, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView);
            TextView mTextView = (TextView) view.findViewById(R.id.textView);

            mImageView.setImageResource(image[Position]);
            mTextView.setText(Name[Position]);

            return view;
        }
    }
}
