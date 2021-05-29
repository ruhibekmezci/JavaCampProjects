package ruhiatakan.hrmsproject.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="Employers")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer {

    @Id
    @Column(name="`UserId`")
    private int userId;

    @Column(name="`CompanyName`")
    private String companyName;

    @Column(name="`Phone`")
    private String phone;

    @Column(name="`VerifiedBySystem`")
    private boolean verifiedBySystem;

    @Column(name="`Website`")
    private String website;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="`UserId`")
    private User user;

    @OneToMany(mappedBy="employer",fetch = FetchType.LAZY)
    private List<JobAdvertisement> jobAdvertisements;

    public Employer(int userId, String companyName, String phone, boolean verifiedBySystem, String website) {
        this.userId = userId;
        this.companyName = companyName;
        this.phone = phone;
        this.verifiedBySystem = verifiedBySystem;
        this.website = website;
    }

}
