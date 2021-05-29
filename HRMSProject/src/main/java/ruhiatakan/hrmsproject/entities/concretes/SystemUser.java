package ruhiatakan.hrmsproject.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="SystemUsers")
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser {
    @Id
    @Column(name="`UserId`")
    private int userId;

    @Column(name="`Roles`")
    private String roles;
}
