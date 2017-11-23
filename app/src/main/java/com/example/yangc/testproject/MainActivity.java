package com.example.yangc.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.fastjson.TypeReference;
import com.yutils.JsonManager;

public class MainActivity extends AppCompatActivity implements ItemListDialogFragment.Listener,ItemListDialogFragment2.Listener {

  private    EditBottomView editBottomView;
  private  ItemListDialogFragment  listDialogFragment;
  private  EditBottomView2 editBottomView2;
  private  EditBottomView3 editBottomView3;
    private  ItemListDialogFragment2 itemListDialogFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editBottomView=new EditBottomView();
        listDialogFragment=ItemListDialogFragment.newInstance(50);
        itemListDialogFragment2=ItemListDialogFragment2.newInstance(50);
         editBottomView2=EditBottomView2.newInstance(900);
        editBottomView3=EditBottomView3.newInstance(900);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editBottomView=new EditBottomView();
                editBottomView.show(getSupportFragmentManager(),"asd");
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listDialogFragment.show(getSupportFragmentManager(),"asd");
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editBottomView3.show(getSupportFragmentManager(),"asd");
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editBottomView2.show(getSupportFragmentManager(),"asd");
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemListDialogFragment2.show(getSupportFragmentManager(),"asd");
                Toast.makeText(getApplication(),"更新了",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemClicked(int position) {

    }

}
