package com.jy.crud.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

//    private int seq;
    private String token;
    private int id;
    private String pwd;
    private String name;
    private String email;
//    private Date regist_date;
}
