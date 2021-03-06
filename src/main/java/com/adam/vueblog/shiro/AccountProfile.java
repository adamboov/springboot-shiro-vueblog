package com.adam.vueblog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author VAIO-adam
 */
@Data
public class AccountProfile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;
}
