package com.joe.jetpackdemo.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/joe/jetpackdemo/ui/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "()V", "initBottomNavigationView", "", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "navController", "Landroidx/navigation/NavController;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onMenuItemClick", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onMenuItemClick(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * Navigation绑定bottomNavigationView
     */
    private final void initBottomNavigationView(com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView, androidx.navigation.NavController navController) {
    }
    
    public MainActivity() {
        super();
    }
}