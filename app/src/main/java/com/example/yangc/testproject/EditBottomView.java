package com.example.yangc.testproject;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;


public class EditBottomView  extends AppCompatDialogFragment {

    private  static  final String TAG="EditBottomView";
    private static final String ARG_ITEM_COUNT = "height";
    public static EditBottomView newInstance(int height) {
        final EditBottomView fragment = new EditBottomView();
        final Bundle args = new Bundle();
        args.putInt(ARG_ITEM_COUNT, height);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onStart() {
        super.onStart();
        Window win = getDialog().getWindow();
        // 一定要设置Background，如果不设置，window属性设置无效
        assert win != null;
        win.setBackgroundDrawable( new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics( dm );
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Log.d(TAG,"onCreateDialog");
        Dialog dialog = new Dialog(getActivity(), R.style.bottomDialog);
        Window win =dialog.getWindow();
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_edit_user_view, null);
        assert win != null;
        win.getAttributes().windowAnimations = R.style.main_menu_animstyle2;
        dialog.setContentView(view);
        WindowManager.LayoutParams params = win.getAttributes();
        params.gravity = Gravity.BOTTOM;
        // 使用ViewGroup.LayoutParams，以便Dialog 宽度充满整个屏幕
        params.width =  ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        win.setAttributes(params);
        return dialog;
    }
}
