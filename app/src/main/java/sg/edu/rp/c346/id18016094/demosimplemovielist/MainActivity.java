package sg.edu.rp.c346.id18016094.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayAdapter aa;
    ArrayList<String> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        movieList = new ArrayList<>();
        movieList.add("Avengers Infinity War Release Date: 2018.04");
        movieList.add("Justice League Release Date: 2017.11");

        aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, movieList);
        lvMovie.setAdapter(aa);


    }
}
