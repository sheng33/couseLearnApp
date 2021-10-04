package com.joe.jetpackdemo.worker;

import java.lang.System;

/**
 * 存储照片的Worker
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/joe/jetpackdemo/worker/SaveImageToFileWorker;", "Landroidx/work/Worker;", "ctx", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "TAG$delegate", "Lkotlin/Lazy;", "Title", "dateFormatter", "Ljava/text/SimpleDateFormat;", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_debug"})
public final class SaveImageToFileWorker extends androidx.work.Worker {
    private final kotlin.Lazy TAG$delegate = null;
    private final java.lang.String Title = "Blurred Image";
    private final java.text.SimpleDateFormat dateFormatter = null;
    
    private final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    public SaveImageToFileWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters parameters) {
        super(null, null);
    }
}