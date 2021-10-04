package com.joe.jetpackdemo.ui.adapter;

import java.lang.System;

/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/joe/jetpackdemo/ui/adapter/MyItemRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/joe/jetpackdemo/ui/adapter/MyItemRecyclerViewAdapter$ViewHolder;", "values", "", "Lcom/joe/jetpackdemo/dummy/DummyContent$DummyItem;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MyItemRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.joe.jetpackdemo.ui.adapter.MyItemRecyclerViewAdapter.ViewHolder> {
    private final java.util.List<com.joe.jetpackdemo.dummy.DummyContent.DummyItem> values = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.joe.jetpackdemo.ui.adapter.MyItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.joe.jetpackdemo.ui.adapter.MyItemRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public MyItemRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.joe.jetpackdemo.dummy.DummyContent.DummyItem> values) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/joe/jetpackdemo/ui/adapter/MyItemRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/joe/jetpackdemo/ui/adapter/MyItemRecyclerViewAdapter;Landroid/view/View;)V", "card", "Landroidx/cardview/widget/CardView;", "getCard", "()Landroidx/cardview/widget/CardView;", "setCard", "(Landroidx/cardview/widget/CardView;)V", "idView", "Landroid/widget/TextView;", "getIdView", "()Landroid/widget/TextView;", "nameView", "getNameView", "textView", "getTextView", "toString", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView idView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView textView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView nameView = null;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView card;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getIdView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNameView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCard() {
            return null;
        }
        
        public final void setCard(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}