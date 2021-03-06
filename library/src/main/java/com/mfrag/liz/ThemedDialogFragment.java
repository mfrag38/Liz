package com.mfrag.liz;

import android.content.Context;
import android.support.v4.app.DialogFragment;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class ThemedDialogFragment extends DialogFragment {

    ThemeHelper themeHelper;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        /*if (context instanceof ThemedActivity)
            themeHelper = ((ThemedActivity) context).getThemeHelper();*/
        themeHelper = ThemeHelper.getInstance(getContext());
    }

    public ThemeHelper getThemeHelper() {
        return themeHelper;
    }

    public int getPrimaryColor() {
        return themeHelper.getPrimaryColor();
    }

    public int getDialogStyle() {
        return themeHelper.getDialogStyle();
    }

    public int getAccentColor() {
        return themeHelper.getAccentColor();
    }

    public Theme getBaseTheme() {
        return themeHelper.getBaseTheme();
    }

    public int getBackgroundColor() {
        return themeHelper.getBackgroundColor();
    }

    public int getCardBackgroundColor() {
        return themeHelper.getCardBackgroundColor();
    }

    public int getIconColor() {
        return themeHelper.getIconColor();
    }

    public int getTextColor() {
        return themeHelper.getTextColor();
    }

    @Override
    public int getTheme() {
        return getDialogStyle();
    }
}
