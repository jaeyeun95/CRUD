package com.jy.crud.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
//@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = "nickname")})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // id를 자동으로 증가시켜주는 것 oracle 에서 sequence
    private int id;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

//    @Column(nullable = false)
//    private String del_yn;

}
