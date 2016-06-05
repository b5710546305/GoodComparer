package com.example.admin.goodcomparer;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

    public UI ui = new UI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //add goods to database, fake databaase
        for (int i = 0; i < ui.goods.length; i++){
            ui.goods[i] = new Good(('A'+i)+"",100+(i*100),750+(i*50),i);
        }

        super.onCreate(savedInstanceState);
        setTitle("GOODS COMPARER");
        setContentView(R.layout.compare_page);

        GridView gridview = (GridView) findViewById(R.id.gridView);
        gridview.setAdapter(new GoodAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){

            }
       });

    }

}
