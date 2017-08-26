package com.example.testpagedview;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {

    PagedView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View group = inflater.inflate(R.layout.activity_main, null);
        content = (PagedView) group.findViewById(R.id.pane_content);
        init(content);
        setContentView(group);
    }

    
    private void init(PagedView view){
        view.addView(getNewPage("AAAAAA",Color.RED));
        view.addView(getNewPage("BBBBBB",Color.YELLOW));
        view.addView(getNewPage("CCCCCC",Color.GRAY));
        view.addView(getNewPage("DDDDDD",Color.GREEN));
        view.addView(getNewPage("EEEEEE",Color.WHITE));
        view.invalidate();
    }

    private TextView getNewPage(String text,int color){
        TextView view = new TextView(this);
        view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        view.setText(text);
        view.setVisibility(View.VISIBLE);
        view.setBackgroundColor(color);
        return view;
    }
}
