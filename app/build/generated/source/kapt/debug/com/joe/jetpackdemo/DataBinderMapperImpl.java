package com.joe.jetpackdemo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.joe.jetpackdemo.databinding.CourseFragmentBindingImpl;
import com.joe.jetpackdemo.databinding.LoginFragmentBindingImpl;
import com.joe.jetpackdemo.databinding.MeFragmentBindingImpl;
import com.joe.jetpackdemo.databinding.NotesFragmentBindingImpl;
import com.joe.jetpackdemo.databinding.RegisterFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_COURSEFRAGMENT = 1;

  private static final int LAYOUT_LOGINFRAGMENT = 2;

  private static final int LAYOUT_MEFRAGMENT = 3;

  private static final int LAYOUT_NOTESFRAGMENT = 4;

  private static final int LAYOUT_REGISTERFRAGMENT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joe.jetpackdemo.R.layout.course_fragment, LAYOUT_COURSEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joe.jetpackdemo.R.layout.login_fragment, LAYOUT_LOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joe.jetpackdemo.R.layout.me_fragment, LAYOUT_MEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joe.jetpackdemo.R.layout.notes_fragment, LAYOUT_NOTESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.joe.jetpackdemo.R.layout.register_fragment, LAYOUT_REGISTERFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_COURSEFRAGMENT: {
          if ("layout/course_fragment_0".equals(tag)) {
            return new CourseFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for course_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LOGINFRAGMENT: {
          if ("layout/login_fragment_0".equals(tag)) {
            return new LoginFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for login_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_MEFRAGMENT: {
          if ("layout/me_fragment_0".equals(tag)) {
            return new MeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for me_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTESFRAGMENT: {
          if ("layout/notes_fragment_0".equals(tag)) {
            return new NotesFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for notes_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_REGISTERFRAGMENT: {
          if ("layout/register_fragment_0".equals(tag)) {
            return new RegisterFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for register_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "model");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/course_fragment_0", com.joe.jetpackdemo.R.layout.course_fragment);
      sKeys.put("layout/login_fragment_0", com.joe.jetpackdemo.R.layout.login_fragment);
      sKeys.put("layout/me_fragment_0", com.joe.jetpackdemo.R.layout.me_fragment);
      sKeys.put("layout/notes_fragment_0", com.joe.jetpackdemo.R.layout.notes_fragment);
      sKeys.put("layout/register_fragment_0", com.joe.jetpackdemo.R.layout.register_fragment);
    }
  }
}
