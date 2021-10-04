package com.joe.jetpackdemo.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0013R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\f0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/joe/jetpackdemo/viewmodel/RegisterModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/joe/jetpackdemo/db/repository/UserRepository;", "(Lcom/joe/jetpackdemo/db/repository/UserRepository;)V", "enable", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getEnable", "()Landroidx/lifecycle/MutableLiveData;", "mail", "", "getMail", "n", "getN", "p", "getP", "judgeEnable", "", "onEmailChanged", "s", "", "onNameChanged", "onPwdChanged", "register", "app_debug"})
public final class RegisterModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> n = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> p = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mail = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> enable = null;
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMail() {
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
    
    /**
     * 邮箱改变的时候
     */
    public final void onEmailChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s) {
    }
    
    /**
     * 密码改变的回调函数
     */
    public final void onPwdChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s) {
    }
    
    private final void judgeEnable() {
    }
    
    public final void register() {
    }
    
    public RegisterModel(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.db.repository.UserRepository repository) {
        super();
    }
}