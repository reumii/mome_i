package com.mome.hauoli.config.auth.dto;


import com.mome.hauoli.domain.user.User;
import lombok.Getter;

import java.io.Serializable;
import java.util.Map;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name=user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
