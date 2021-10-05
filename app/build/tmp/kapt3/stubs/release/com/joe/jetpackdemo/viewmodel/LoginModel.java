package com.joe.jetpackdemo.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ&\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0011\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/joe/jetpackdemo/viewmodel/LoginModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/joe/jetpackdemo/db/repository/UserRepository;", "(Lcom/joe/jetpackdemo/db/repository/UserRepository;)V", "enable", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getEnable", "()Landroidx/lifecycle/MutableLiveData;", "n", "", "getN", "nameWatcher", "Lcom/joe/jetpackdemo/common/listener/SimpleWatcher;", "getNameWatcher", "()Lcom/joe/jetpackdemo/common/listener/SimpleWatcher;", "p", "getP", "pwdWatcher", "getPwdWatcher", "judgeEnable", "", "login", "Landroidx/lifecycle/LiveData;", "Lcom/joe/jetpackdemo/db/data/User;", "onNameChanged", "s", "", "onPwdChanged", "start", "", "before", "count", "app_release"})
public final class LoginModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> n = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> p = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> enable = null;
    @org.jetbrains.annotations.NotNull()
    private final com.joe.jetpackdemo.common.listener.SimpleWatcher nameWatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final com.joe.jetpackdemo.common.listener.SimpleWatcher pwdWatcher = null;
    private final com.joe.jetpackdemo.db.repository.UserRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEnable() {
        return null;
    }
    
    /**
     * 用户名改变回调的函数
     */
    public final void onNameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s) {
    }
    
    private final void judgeEnable() {
    }
    
    /**
     * 密码改变的回调函数
     */
    public final void onPwdChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.joe.jetpackdemo.common.listener.SimpleWatcher getNameWatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.joe.jetpackdemo.common.listener.SimpleWatcher getPwdWatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.joe.jetpackdemo.db.data.User> login() {
        return null;
    }
    
    public LoginModel(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.repository.UserRepository repository) {
        super();
    }
}