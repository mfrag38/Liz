package com.mfrag.liz.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.Toolbar;

import com.mfrag.liz.R;
import com.mfrag.liz.ThemeHelper;
import com.mfrag.liz.Themed;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class ThemedToolbar extends Toolbar implements Themed {

    public ThemedToolbar(Context context) {
        super(context, null, R.style.ToolbarTheme);
    }

    public ThemedToolbar(Context context, @Nullable AttributeSet attrs) {
        super(context);
    }

    public ThemedToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context);
    }

    @Override
    public void refreshTheme(ThemeHelper themeHelper) {
        setBackgroundColor(themeHelper.getPrimaryColor());
    }
}
