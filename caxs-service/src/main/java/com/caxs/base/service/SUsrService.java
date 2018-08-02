package com.caxs.base.service;

import com.caxs.base.dao.SUsrMapper;
import com.caxs.base.domain.SUsr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2018/8/2.
 */
@Component
public class SUsrService implements ISUsrService {

    @Autowired
    private SUsrMapper userMapper;

    @Override
    public boolean getUser(String userName,String passWord){
        SUsr user = userMapper.selectByName(userName);
        if(user!=null){
            if(user.getUsrName().equals(userName)&&user.getUsrPassword().equals(passWord)){
              return true;
            }
        }
        return false;
    }
}
