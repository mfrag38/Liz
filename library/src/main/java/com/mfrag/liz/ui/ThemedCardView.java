package com.mfrag.liz.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

import com.mfrag.liz.ThemeHelper;
import com.mfrag.liz.Themed;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class ThemedCardView extends CardView implements Themed {

    public ThemedCardView(Context context) {
        this(context, null);
    }

    public ThemedCardView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemedCardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setCardBackgroundColor(theme.getCardBackgroundColor());
    }
}
