package com.joe.jetpackdemo.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000eJ\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000eJ\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0011J\u0016\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0011J\u0016\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010 \u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010\"\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u001c\u0010#\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0018J\u0016\u0010%\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010&\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/joe/jetpackdemo/utils/AppPrefsUtils;", "", "()V", "ed", "Landroid/content/SharedPreferences$Editor;", "sp", "Landroid/content/SharedPreferences;", "changeName", "", "name", "", "clearAll", "commit", "getBoolean", "", "key", "getFloat", "", "getInt", "", "getLong", "", "getString", "getStringSet", "", "putBoolean", "value", "putBooleanWithNotCommit", "putFloat", "putFloatWithNotCommit", "putInt", "putIntWithNotCommit", "putLong", "putLongWithNotCommit", "putString", "putStringSet", "set", "putStringWithNotCommit", "remove", "app_release"})
public final class AppPrefsUtils {
    private static android.content.SharedPreferences sp;
    private static android.content.SharedPreferences.Editor ed;
    public static final com.joe.jetpackdemo.utils.AppPrefsUtils INSTANCE = null;
    
    public final void changeName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    public final void putBooleanWithNotCommit(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void putStringWithNotCommit(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final void putIntWithNotCommit(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final void putLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    public final void putLongWithNotCommit(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0L;
    }
    
    public final void putFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    public final void putFloatWithNotCommit(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    public final void commit() {
    }
    
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0F;
    }
    
    public final void putStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> set) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void clearAll() {
    }
    
    private AppPrefsUtils() {
        super();
    }
}