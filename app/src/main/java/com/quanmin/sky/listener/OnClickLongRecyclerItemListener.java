package com.quanmin.sky.listener;

import android.view.View;

/**
 * 长按item点击回调接口
 *
 * xiao
 *
 * 2017-01-07
 *
 */
public interface OnClickLongRecyclerItemListener {

    /**
     *
     * @param view  视图
     * @param position      当前索引值
     */
    void onItemLongClick(View view, int position);
}
