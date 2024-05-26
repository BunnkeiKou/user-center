package com.hwh.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
@Data
public class UserLoginRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 7263130655630152435L;

    private String userAccount;
    private String userPassword;

}
