package com.joe.jetpackdemo.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/joe/jetpackdemo/ui/adapter/CourseCellAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/joe/jetpackdemo/db/data/Course;", "context", "Landroid/content/Context;", "objects", "", "(Landroid/content/Context;Ljava/util/List;)V", "defaultRequestBtnClickListener", "Landroid/view/View$OnClickListener;", "getDefaultRequestBtnClickListener", "()Landroid/view/View$OnClickListener;", "setDefaultRequestBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "unfoldedIndexes", "Ljava/util/HashSet;", "", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "registerFold", "", "registerToggle", "registerUnfold", "ViewHolder", "app_release"})
public final class CourseCellAdapter extends android.widget.ArrayAdapter<com.joe.jetpackdemo.db.data.Course> {
    private final java.util.HashSet<java.lang.Integer> unfoldedIndexes = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener defaultRequestBtnClickListener;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getDefaultRequestBtnClickListener() {
        return null;
    }
    
    public final void setDefaultRequestBtnClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    public final void registerToggle(int position) {
    }
    
    public final void registerFold(int position) {
    }
    
    public final void registerUnfold(int position) {
    }
    
    public CourseCellAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.util.List<com.joe.jetpackdemo.db.data.Course> objects) {
        super(null, 0);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/joe/jetpackdemo/ui/adapter/CourseCellAdapter$ViewHolder;", "", "()V", "cellImg", "Landroid/widget/ImageView;", "getCellImg", "()Landroid/widget/ImageView;", "setCellImg", "(Landroid/widget/ImageView;)V", "contentRequestBtn", "Landroid/widget/TextView;", "getContentRequestBtn", "()Landroid/widget/TextView;", "setContentRequestBtn", "(Landroid/widget/TextView;)V", "title", "getTitle", "setTitle", "app_release"})
    static final class ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView cellImg;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView contentRequestBtn;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView title;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getCellImg() {
            return null;
        }
        
        public final void setCellImg(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getContentRequestBtn() {
            return null;
        }
        
        public final void setContentRequestBtn(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        public ViewHolder() {
            super();
        }
    }
}