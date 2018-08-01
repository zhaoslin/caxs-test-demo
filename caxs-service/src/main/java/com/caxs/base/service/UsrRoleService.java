package com.caxs.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.caxs.base.dao.UsrRoleMapper;
import com.caxs.caxs.base.domain.UsrRole;

/**
 * Created by kevin on 2017/6/9.
 */
@Component
public class UsrRoleService implements  IUsrRoleService{
    @Autowired
   private UsrRoleMapper usrRoleMapper;

    public UsrRole getUsrRole(){
  
        return  usrRoleMapper.getUsrRole();		   
    }

}
