package com.caxs.base.service;

import com.caxs.base.domain.UsrRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.caxs.base.dao.UsrRoleMapper;

/**
 * Created by kevin on 2017/6/9.
 */
@Component
public class UsrRoleService implements  IUsrRoleService{

    @Autowired
   private UsrRoleMapper usrRoleMapper;

    @Override
    public UsrRole getUsrRole(){
  
        return  usrRoleMapper.getUsrRole();		   
    }

}
