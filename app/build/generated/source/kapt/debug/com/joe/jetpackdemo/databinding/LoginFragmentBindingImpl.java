package com.joe.jetpackdemo.databinding;
import com.joe.jetpackdemo.R;
import com.joe.jetpackdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoginFragmentBindingImpl extends LoginFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title, 3);
        sViewsWithIds.put(R.id.btn_login, 4);
        sViewsWithIds.put(R.id.tag_register, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnTextChangedImpl mModelOnPwdChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged;
    // Inverse Binding Event Handlers

    public LoginFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LoginFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.etAccount.setTag(null);
        this.etPwd.setTag(null);
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
            setModel((com.joe.jetpackdemo.viewmodel.LoginModel) variable);
        }
        else if (BR.activity == variableId) {
            setActivity((androidx.fragment.app.FragmentActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.joe.jetpackdemo.viewmodel.LoginModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
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
        com.joe.jetpackdemo.viewmodel.LoginModel model = mModel;
        com.joe.jetpackdemo.common.listener.SimpleWatcher modelNameWatcher = null;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged modelOnPwdChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.nameWatcher
                    modelNameWatcher = model.getNameWatcher();
                    // read model::onPwdChanged
                    modelOnPwdChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = (((mModelOnPwdChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged == null) ? (mModelOnPwdChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged = new OnTextChangedImpl()) : mModelOnPwdChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged).setValue(model));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.joe.jetpackdemo.binding.ShoeBindingAdapterKt.addTextChangedListener(this.etAccount, modelNameWatcher);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPwd, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)modelOnPwdChangedAndroidxDatabindingAdaptersTextViewBindingAdapterOnTextChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnTextChangedImpl implements androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged{
        private com.joe.jetpackdemo.viewmodel.LoginModel value;
        public OnTextChangedImpl setValue(com.joe.jetpackdemo.viewmodel.LoginModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onTextChanged(java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
            this.value.onPwdChanged(arg0, arg1, arg2, arg3); 
        }
    }
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