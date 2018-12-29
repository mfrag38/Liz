package com.mfrag.liz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public abstract class ThemedAdapter<VH extends ThemedViewHolder> extends RecyclerView.Adapter<VH> implements Themed {

    private ThemeHelper themeHelper;

    public ThemedAdapter(Context context) {
        themeHelper = ThemeHelper.getInstanceLoaded(context);
    }

    public ThemeHelper getThemeHelper() {
        return themeHelper;
    }

    public void setThemeHelper(ThemeHelper themeHelper) {
        this.themeHelper = themeHelper;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.refreshTheme(getThemeHelper());
    }

    @Override
    public void refreshTheme(ThemeHelper theme) {
        setThemeHelper(theme);
        notifyDataSetChanged();
    }
}
