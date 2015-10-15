package com.charlie.expendableshow;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import com.charlie.expendableshow.adapters.ContactAdapter;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ExpandableListView listView = (ExpandableListView) findViewById(R.id.contact_list);

        ContactAdapter adapter = new ContactAdapter(this);
        listView.setAdapter(adapter);
        // 展开所有组
        int groupCount = adapter.getGroupCount();
        for (int i = 0;i<groupCount;i++){
            listView.expandGroup(i);
        }
        // 去掉左侧的指示器
        listView.setGroupIndicator(null);
    }
}
