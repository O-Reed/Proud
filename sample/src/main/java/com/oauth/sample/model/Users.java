package com.oauth.sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Builder
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phone_number;
    private String password;
}
