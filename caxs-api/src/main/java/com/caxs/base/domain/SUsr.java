package com.caxs.base.domain;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/8/2.
 */
public class SUsr implements Serializable {
    private String usrName;

    private String usrPassword;

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }
}
