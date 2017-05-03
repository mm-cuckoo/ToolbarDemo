package com.example.machao14.toolbardemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by machao14 on 2017/5/3.
 */

public class ToolbarActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        mToolbar = (Toolbar) findViewById(R.id.tl_toolabr);

        setSupportActionBar(mToolbar);
        mToolbar.setLogo(R.mipmap.library_applocker);//设置app logo
        mToolbar.setTitle("toolbar title");            //设置主标题
        mToolbar.setSubtitle("toolbar sub title");      //设置副标题
        // Navigation Icon 设定要在 setSupoortActionBar 之后才有作用
        //设置返回键可用，如果某个页面想隐藏掉返回键比如首页，可以调用mToolbar.setNavigationIcion(null);
        mToolbar.setNavigationIcon(R.mipmap.library_cache); //设置左边的button 图标
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {//设置左边button 点击事件
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(ToolbarActivity.this,"menu item" + item.getItemId(),Toast.LENGTH_SHORT).show();
        return true;
    }
}
