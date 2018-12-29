package com.mfrag.liz;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class ThemedAlertDialogBuilder extends AlertDialog.Builder {

    private ThemeHelper themeHelper;

    public ThemedAlertDialogBuilder(Context context, ThemeHelper themeHelper) {
        super(context, themeHelper.getDialogStyle());
        this.themeHelper = themeHelper;
    }

    @Override
    public AlertDialog.Builder setView(View view) {
        for (View v : ViewUtil.getAllChildren(view))
            if (v instanceof Themed) ((Themed) v).refreshTheme(themeHelper);
        return super.setView(view);
    }
}
