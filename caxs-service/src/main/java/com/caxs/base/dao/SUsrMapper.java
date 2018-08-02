package com.caxs.base.dao;

import com.caxs.base.domain.SUsr;

/**
 * Created by lenovo on 2018/8/2.
 */
public interface SUsrMapper {
    public SUsr selectByName(String userName);
}
