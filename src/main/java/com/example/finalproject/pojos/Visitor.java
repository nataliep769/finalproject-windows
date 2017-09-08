package com.example.finalproject.pojos;

import com.example.finalproject.pojos.Role;

public class Visitor implements Role {
  public boolean canEditPosts() {
    return false;
  }
  public boolean canDeletePosts() {
    return false;
  }
  public boolean canChangeUserRoles() {
    return false;
  }
}
