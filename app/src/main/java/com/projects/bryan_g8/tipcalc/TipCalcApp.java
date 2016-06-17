package com.projects.bryan_g8.tipcalc;

import android.app.Application;

/**
 * Created by bryan_g8 on 16/06/16.
 */
public class TipCalcApp extends Application{
    private static String ABOUT_URL = "http://www.facebook.com";

    public static String getAboutUrl() {
        return ABOUT_URL;
    }
}
