package com.joe.jetpackdemo.ui.fragment.login;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RegisterFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RegisterFragmentArgs() {
  }

  private RegisterFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RegisterFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RegisterFragmentArgs __result = new RegisterFragmentArgs();
    bundle.setClassLoader(RegisterFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("EMAIL")) {
      String EMAIL;
      EMAIL = bundle.getString("EMAIL");
      if (EMAIL == null) {
        throw new IllegalArgumentException("Argument \"EMAIL\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("EMAIL", EMAIL);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getEMAIL() {
    return (String) arguments.get("EMAIL");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("EMAIL")) {
      String EMAIL = (String) arguments.get("EMAIL");
      __result.putString("EMAIL", EMAIL);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    RegisterFragmentArgs that = (RegisterFragmentArgs) object;
    if (arguments.containsKey("EMAIL") != that.arguments.containsKey("EMAIL")) {
      return false;
    }
    if (getEMAIL() != null ? !getEMAIL().equals(that.getEMAIL()) : that.getEMAIL() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getEMAIL() != null ? getEMAIL().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "RegisterFragmentArgs{"
        + "EMAIL=" + getEMAIL()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(RegisterFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public RegisterFragmentArgs build() {
      RegisterFragmentArgs result = new RegisterFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setEMAIL(@NonNull String EMAIL) {
      if (EMAIL == null) {
        throw new IllegalArgumentException("Argument \"EMAIL\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("EMAIL", EMAIL);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getEMAIL() {
      return (String) arguments.get("EMAIL");
    }
  }
}
