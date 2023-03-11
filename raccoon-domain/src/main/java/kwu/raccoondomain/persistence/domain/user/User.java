package kwu.raccoondomain.persistence.domain.user;

import kwu.raccoondomain.persistence.domain.user.enums.Gender;
import kwu.raccoondomain.persistence.domain.user.enums.VendorType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "vendor_type")
    @Enumerated(value = EnumType.STRING)
    private VendorType vendorType;

    @Column(name = "user_gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "email")
    private String email;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "age")
    private Long age;
}
