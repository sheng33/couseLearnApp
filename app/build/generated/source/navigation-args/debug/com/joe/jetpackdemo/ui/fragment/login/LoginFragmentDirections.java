package com.joe.jetpackdemo.ui.fragment.login;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.joe.jetpackdemo.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static ActionWelcomeToRegister actionWelcomeToRegister() {
    return new ActionWelcomeToRegister();
  }

  public static class ActionWelcomeToRegister implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionWelcomeToRegister() {
    }

    @NonNull
    public ActionWelcomeToRegister setEMAIL(@NonNull String EMAIL) {
      if (EMAIL == null) {
        throw new IllegalArgumentException("Argument \"EMAIL\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("EMAIL", EMAIL);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("EMAIL")) {
        String EMAIL = (String) arguments.get("EMAIL");
        __result.putString("EMAIL", EMAIL);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_welcome_to_register;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getEMAIL() {
      return (String) arguments.get("EMAIL");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionWelcomeToRegister that = (ActionWelcomeToRegister) object;
      if (arguments.containsKey("EMAIL") != that.arguments.containsKey("EMAIL")) {
        return false;
      }
      if (getEMAIL() != null ? !getEMAIL().equals(that.getEMAIL()) : that.getEMAIL() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getEMAIL() != null ? getEMAIL().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionWelcomeToRegister(actionId=" + getActionId() + "){"
          + "EMAIL=" + getEMAIL()
          + "}";
    }
  }
}
