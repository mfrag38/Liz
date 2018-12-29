package com.mfrag.liz.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

import com.mfrag.liz.R;
import com.mfrag.liz.ThemeHelper;
import com.mfrag.liz.Themed;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class ThemedFab extends FloatingActionButton implements Themed {

    private IconicsDrawable mIcon = null;

    public ThemedFab(Context context) {
        this(context, null);
    }

    public ThemedFab(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedFab(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.ThemedFab);
        setIcon(a.getString(R.styleable.ThemedFab_liz_icon));
        a.recycle();
    }

    @Override
    public void refreshTheme(ThemeHelper themeHelper) {
        setBackgroundTintList(ColorStateList.valueOf(themeHelper.getAccentColor()));
        setImageDrawable(mIcon);
    }

    public void setIcon(IIcon icon) {
        mIcon = new IconicsDrawable(getContext()).icon(icon).color(Color.WHITE);
    }

    public void setIcon(String icon) {
        mIcon = new IconicsDrawable(getContext()).icon(icon).color(Color.WHITE);
    }
}
