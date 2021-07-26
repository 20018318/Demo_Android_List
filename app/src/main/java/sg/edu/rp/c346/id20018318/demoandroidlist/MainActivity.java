package sg.edu.rp.c346.id20018318.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvVersions;
    ArrayList<AndroidVersion> alVersions;
//    ArrayAdapter<AndroidVersion> aaVersions;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvVersions = findViewById(R.id.lvVersions);
        alVersions = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");

        alVersions.add(item1);
        alVersions.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
        alVersions.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));


//        aaVersions = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alVersions);
        adapter = new CustomAdapter(this, R.layout.row, alVersions);

        lvVersions.setAdapter(adapter);
    }
}
