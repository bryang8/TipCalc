package com.projects.bryan_g8.tipcalc.fragments;

import com.projects.bryan_g8.tipcalc.models.TipRecord;

/**
 * Created by bryan_g8 on 16/06/16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord tipRecord);
    void clearList();

}
