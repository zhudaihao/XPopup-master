package com.lxj.xpopupdemo.fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.lxj.xpopup.animator.PopupAnimator;
import com.lxj.xpopup.impl.PartShadowPopupView;
import com.lxj.xpopupdemo.R;

/**
 * Created by Administrator on 2019/3/12.
 * 当你自定义弹窗的时候，需要选择继承
 * CenterPopupView，(居中对话框)
 * BottomPopupView，（底部弹出对话框）
 * AttachPopupView，（在对应点击view部位显示对话框 ， 需要设置.atView(v)  // 依附于所点击的View）
 * DrawerPopupView，（左右抽屉式对话框）
 * PartShadowPopupView（在对应view底部显示对话框，需要设置 .atView(v)  // 依附于所点击的View）
 * 其中之一。假设需要自定义Center类型的弹窗：
 */

public class CustomDialog extends PartShadowPopupView {

    //自定义弹窗本质是一个自定义View，但是只需重写这个构造，其他的不用重写
    public CustomDialog(@NonNull Context context) {
        super(context);
    }
    // 返回自定义弹窗的布局
    @Override
    protected int getImplLayoutId() {
        return R.layout.custom_layout;
    }
    // 执行初始化操作，比如：findView，设置点击，或者任何你弹窗内的业务逻辑
    @Override
    protected void onCreate() {
        super.onCreate();
        findViewById(R.id.tv_close).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss(); // 关闭弹窗
            }
        });

        findViewById(R.id.tv_submit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss(); // 关闭弹窗
            }
        });
    }
    // 设置最大宽度，看需要而定
    @Override
    protected int getMaxWidth() {
        return super.getMaxWidth();
    }
    // 设置最大高度，看需要而定
    @Override
    protected int getMaxHeight() {
        return super.getMaxHeight();
    }
    // 设置自定义动画器，看需要而定
    @Override
    protected PopupAnimator getPopupAnimator() {
        return super.getPopupAnimator();
    }
}
