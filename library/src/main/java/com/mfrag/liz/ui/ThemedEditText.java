package com.mfrag.liz.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.mfrag.liz.ThemeHelper;
import com.mfrag.liz.Themed;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class ThemedEditText extends AppCompatEditText implements Themed {

    public ThemedEditText(Context context) {
        this(context, null);
    }

    public ThemedEditText(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //setBackgroundResource(android.R.color.transparent);
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setTextColor(theme.getTextColor());
        setHintTextColor(theme.getSubTextColor());
        setHighlightColor(theme.getPrimaryColor());
        //ThemeHelper.setCursorColor(this, themeViews.getAccentColor());
        //setBackgroundTintList(themeViews.getTintList());
        //setBaseColor(themeViews.getAccentColor());
        //setUnderlineColor(themeViews.getAccentColor());
    }
}
