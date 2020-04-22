package com.billy.UniQuery.service;

import com.billy.UniQuery.entity.Admin;

public interface AdminServiceI {

    Admin login(String adminname, String adminpass);

    boolean searchAdmin(String adminname);

    int updateAdmin(Admin admin);

    Admin getAdmin(int mid);

}
