package com.charlie.expendableshow.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created
 * Author:Charlie Wei[]
 * Email:charlie_net@163.com
 * Date:2015/10/13
 */
public class ContactAdapter extends BaseExpandableListAdapter {

    private Context context;
    public ContactAdapter(Context context){
        this.context = context;
    }


    /**
     * 当前数据总共有几组，
     * @return
     */
    @Override
    public int getGroupCount() {
        return 2; // 代表两组
    }

    /**
     * 获取指定组中包含多少个子元素
     * @param groupPosition
     * @return
     */
    @Override
    public int getChildrenCount(int groupPosition) {
        int ret = 0;
        switch (groupPosition){
            case 0:
                ret = 2;
                break;
            case 1:
                ret = 3;
                break;
        }
        return ret;
    }

    /**
     * 获取指定位置的组的数据对象
     * @param groupPosition
     * @return
     */
    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    /**
     * 获取指定第几组中的第几个元素的数据对象
     * @param groupPosition
     * @param childPosition
     * @return
     */
    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    /**
     *
     * @param groupPosition
     * @return
     */
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    /**
     * 获取指定组中指定位置的对象的ID
     * @param groupPosition
     * @param childPosition
     * @return
     */
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean hasStableIds() {
        return false;
    }

    /**
     * 获取指定组当前状态下的界面显示
     * @param groupPosition：第几组
     * @param isExpanded：是否展开
     * @param convertView：复用
     * @param parent：Parent
     * @return：View
     */
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        View ret = null;

        LayoutInflater inflater = LayoutInflater.from(context);
        ret = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        View textView = ret.findViewById(android.R.id.text1);
        ((TextView)textView).setText("第"+groupPosition+"group");

        return ret;
    }

    /**
     * 获取指定组中指定位置元素显示的视图
     * @param groupPosition：当前组位置
     * @param childPosition：第几个元素
     * @param isLastChild：是否是最后一个
     * @param convertView：复用
     * @param parent：ViewGroup
     * @return：View
     */
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View ret = null;

        LayoutInflater inflater = LayoutInflater.from(context);
        ret = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        View textView = ret.findViewById(android.R.id.text1);
        ((TextView)textView).setText(" 第"+childPosition+"child");

        return ret;
    }

    /**
     *
     * @param groupPosition
     * @param childPosition
     * @return
     */
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
