package com.zyw.alternativeEntity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.senseframework.support.orm.mongodb.MongoCollection;

@Data
@NoArgsConstructor
@MongoCollection("user")
public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String sex;

    private String email;

}
