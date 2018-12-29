package com.mfrag.sample;

import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.iconics.Iconics;

/**
 * Created by Jibo on 16/10/2017.
 */

public class App extends com.mfrag.liz.App {

    @Override
    public void onCreate() {
        super.onCreate();
        registerIcons();
    }

    private void registerIcons() {
        Iconics.registerFont(new CommunityMaterial());
    }
}