package com.joe.jetpackdemo.databinding;
import com.joe.jetpackdemo.R;
import com.joe.jetpackdemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RegisterFragmentBindingImpl extends RegisterFragmentBinding implements com.joe.jetpackdemo.generated.callback.OnTextChanged.Listener, com.joe.jetpackdemo.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_title, 6);
        sViewsWithIds.put(R.id.getCode, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback4;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback2;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RegisterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RegisterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            );
        this.btnRegister.setTag(null);
        this.code.setTag(null);
        this.etAccount.setTag(null);
        this.etPwd.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCancel.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.joe.jetpackdemo.generated.callback.OnTextChanged(this, 4);
        mCallback2 = new com.joe.jetpackdemo.generated.callback.OnTextChanged(this, 2);
        mCallback3 = new com.joe.jetpackdemo.generated.callback.OnTextChanged(this, 3);
        mCallback1 = new com.joe.jetpackdemo.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setModel((com.joe.jetpackdemo.viewmodel.RegisterModel) variable);
        }
        else if (BR.activity == variableId) {
            setActivity((androidx.fragment.app.FragmentActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.joe.jetpackdemo.viewmodel.RegisterModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setActivity(@Nullable androidx.fragment.app.FragmentActivity Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.activity);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeModelEnable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeModelP((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeModelN((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeModelMail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModelEnable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ModelEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelP(androidx.lifecycle.MutableLiveData<java.lang.String> ModelP, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelN(androidx.lifecycle.MutableLiveData<java.lang.String> ModelN, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelMail(androidx.lifecycle.MutableLiveData<java.lang.String> ModelMail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        com.joe.jetpackdemo.viewmodel.RegisterModel model = mModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> modelEnable = null;
        java.lang.Boolean modelEnableGetValue = null;
        java.lang.String modelPGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> modelP = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> modelN = null;
        java.lang.String modelNGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxModelEnableGetValue = false;
        java.lang.String modelMailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> modelMail = null;
        androidx.fragment.app.FragmentActivity activity = mActivity;

        if ((dirtyFlags & 0x5fL) != 0) {


            if ((dirtyFlags & 0x51L) != 0) {

                    if (model != null) {
                        // read model.enable
                        modelEnable = model.getEnable();
                    }
                    updateLiveDataRegistration(0, modelEnable);


                    if (modelEnable != null) {
                        // read model.enable.getValue()
                        modelEnableGetValue = modelEnable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(model.enable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxModelEnableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(modelEnableGetValue);
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (model != null) {
                        // read model.p
                        modelP = model.getP();
                    }
                    updateLiveDataRegistration(1, modelP);


                    if (modelP != null) {
                        // read model.p.getValue()
                        modelPGetValue = modelP.getValue();
                    }
            }
            if ((dirtyFlags & 0x54L) != 0) {

                    if (model != null) {
                        // read model.n
                        modelN = model.getN();
                    }
                    updateLiveDataRegistration(2, modelN);


                    if (modelN != null) {
                        // read model.n.getValue()
                        modelNGetValue = modelN.getValue();
                    }
            }
            if ((dirtyFlags & 0x58L) != 0) {

                    if (model != null) {
                        // read model.mail
                        modelMail = model.getMail();
                    }
                    updateLiveDataRegistration(3, modelMail);


                    if (modelMail != null) {
                        // read model.mail.getValue()
                        modelMailGetValue = modelMail.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.btnRegister.setEnabled(androidxDatabindingViewDataBindingSafeUnboxModelEnableGetValue);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.code, modelMailGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.code, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback4, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAccount, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback2, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPwd, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback3, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            this.tvCancel.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAccount, modelNGetValue);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPwd, modelPGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // model
                com.joe.jetpackdemo.viewmodel.RegisterModel model = mModel;
                // model != null
                boolean modelJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {



                    model.onEmailChanged(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // model
                com.joe.jetpackdemo.viewmodel.RegisterModel model = mModel;
                // model != null
                boolean modelJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {



                    model.onNameChanged(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // model
                com.joe.jetpackdemo.viewmodel.RegisterModel model = mModel;
                // model != null
                boolean modelJavaLangObjectNull = false;



                modelJavaLangObjectNull = (model) != (null);
                if (modelJavaLangObjectNull) {



                    model.onPwdChanged(callbackArg_0);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // activity != null
        boolean activityJavaLangObjectNull = false;
        // activity
        androidx.fragment.app.FragmentActivity activity = mActivity;



        activityJavaLangObjectNull = (activity) != (null);
        if (activityJavaLangObjectNull) {


            activity.onBackPressed();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model.enable
        flag 1 (0x2L): model.p
        flag 2 (0x3L): model.n
        flag 3 (0x4L): model.mail
        flag 4 (0x5L): model
        flag 5 (0x6L): activity
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}