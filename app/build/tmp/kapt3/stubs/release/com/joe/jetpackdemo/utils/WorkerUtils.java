package com.joe.jetpackdemo.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004\u001a\u0006\u0010\n\u001a\u00020\u0006\u001a\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\r"}, d2 = {"blurBitmap", "Landroid/graphics/Bitmap;", "bitmap", "applicationContext", "Landroid/content/Context;", "makeStatusNotification", "", "message", "", "context", "sleep", "writeBitmapToFile", "Landroid/net/Uri;", "app_release"})
public final class WorkerUtils {
    
    /**
     * Create a Notification that is shown as a heads-up notification if possible.
     *
     * For this codelab, this is used to show a notification so that you know when different steps
     * of the background work chain are starting
     *
     * @param message Message shown on the notification
     * @param context Context needed to create Toast
     */
    public static final void makeStatusNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Method for sleeping for a fixed about of time to emulate slower work
     */
    public static final void sleep() {
    }
    
    /**
     * Blurs the given Bitmap image
     * @param bitmap Image to blur
     * @param applicationContext Application context
     * @return Blurred bitmap image
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public static final android.graphics.Bitmap blurBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext) {
        return null;
    }
    
    /**
     * Writes bitmap to a temporary file and returns the Uri for the file
     * @param applicationContext Application context
     * @param bitmap Bitmap to write to temp file
     * @return Uri for temp file with bitmap
     * @throws FileNotFoundException Throws if bitmap file cannot be found
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.net.Uri writeBitmapToFile(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) throws java.io.FileNotFoundException {
        return null;
    }
}