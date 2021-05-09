package ruhiatakan.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int userId;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    public User(int userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }
    public User(){

    }
}
//10 Mayis degisiklikleri