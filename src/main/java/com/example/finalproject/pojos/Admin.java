package com.example.finalproject.pojos;

import com.example.finalproject.pojos.Role;

public class Admin implements Role {
  public boolean canEditPosts() {
    return true;
  }
  public boolean canDeletePosts() {
    return true;
  }
  public boolean canChangeUserRoles() {
    return true;
  }
}
