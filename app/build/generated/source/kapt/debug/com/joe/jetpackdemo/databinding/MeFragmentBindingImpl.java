package com.joe.jetpackdemo.databinding;
import com.joe.jetpackdemo.R;
import com.joe.jetpackdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MeFragmentBindingImpl extends MeFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.head_layout, 1);
        sViewsWithIds.put(R.id.h_back, 2);
        sViewsWithIds.put(R.id.h_head, 3);
        sViewsWithIds.put(R.id.user_name, 4);
        sViewsWithIds.put(R.id.user_val, 5);
        sViewsWithIds.put(R.id.userBtn, 6);
        sViewsWithIds.put(R.id.zhanghao, 7);
        sViewsWithIds.put(R.id.courseBtn, 8);
        sViewsWithIds.put(R.id.kecheng, 9);
        sViewsWithIds.put(R.id.about, 10);
        sViewsWithIds.put(R.id.shezhi, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MeFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private MeFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (com.joe.jetpackdemo.utils.RoundImageView) bindings[3]
            , (android.widget.RelativeLayout) bindings[1]
            , (com.joe.jetpackdemo.utils.RoundImageView) bindings[9]
            , (com.joe.jetpackdemo.utils.RoundImageView) bindings[11]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (com.joe.jetpackdemo.utils.RoundImageView) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.joe.jetpackdemo.viewmodel.MeModel) variable);
        }
        else if (BR.activity == variableId) {
            setActivity((androidx.fragment.app.FragmentActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.joe.jetpackdemo.viewmodel.MeModel Model) {
        this.mModel = Model;
    }
    public void setActivity(@Nullable androidx.fragment.app.FragmentActivity Activity) {
        this.mActivity = Activity;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): activity
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}