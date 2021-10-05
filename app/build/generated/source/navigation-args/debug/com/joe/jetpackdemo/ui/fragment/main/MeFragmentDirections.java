package com.joe.jetpackdemo.ui.fragment.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.joe.jetpackdemo.R;

public class MeFragmentDirections {
  private MeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMeFragmentToAboutFragment() {
    return new ActionOnlyNavDirections(R.id.action_meFragment_to_aboutFragment);
  }
}
