package com.mfrag.liz;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class ThemedViewHolder extends RecyclerView.ViewHolder implements Themed {

    public ThemedViewHolder(View view) {
        super(view);
    }

    @Override
    public void refreshTheme(ThemeHelper themeHelper) {
        for (View view : ViewUtil.getAllChildren(itemView)) {
            if (view instanceof Themed) ((Themed) view).refreshTheme(themeHelper);
        }
    }
}
