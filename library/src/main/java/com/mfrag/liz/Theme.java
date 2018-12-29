package com.mfrag.liz;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public enum Theme {

    LIGHT(1), DARK(2), AMOLED(3);

    int value;

    Theme(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Theme fromValue(int value) {
        switch(value) {
            case 1: default:
                return LIGHT;
            case 2:
                return DARK;
            case 3:
                return AMOLED;
        }
    }
}
