package com.joe.jetpackdemo.viewmodel;

import java.lang.System;

/**
 * ViewModel提供者
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/joe/jetpackdemo/viewmodel/CustomViewModelProvider;", "", "()V", "providerLoginModel", "Lcom/joe/jetpackdemo/viewmodel/factory/LoginModelFactory;", "context", "Landroid/content/Context;", "providerRegisterModel", "Lcom/joe/jetpackdemo/viewmodel/factory/RegisterModelFactory;", "app_release"})
public final class CustomViewModelProvider {
    public static final com.joe.jetpackdemo.viewmodel.CustomViewModelProvider INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.joe.jetpackdemo.viewmodel.factory.RegisterModelFactory providerRegisterModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.joe.jetpackdemo.viewmodel.factory.LoginModelFactory providerLoginModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private CustomViewModelProvider() {
        super();
    }
}