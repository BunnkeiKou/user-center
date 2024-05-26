package com.hwh.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 724426874738661577L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
