package ruhiatakan.hrmsproject.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "emailVerified",nullable = false)
    private boolean emailVerified;

    @Column(name = "emailVerifyCode",nullable = false)
    private String emailVerifyCode;

    public User(String email, String password, boolean emailVerified, String emailVerifyCode) {
        this.email = email;
        this.password = password;
        this.emailVerified = emailVerified;
        this.emailVerifyCode = emailVerifyCode;
    }

}
