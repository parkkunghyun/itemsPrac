package itemsPrac.itemsPrac.domain.member;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Member {
    // 멤버에게 필요한것 -> 로그인아이디 , 비번, 이름,
    Long id; // 고유 번호

    @NotEmpty
    String loginId;

    @NotEmpty
    String password;

    @NotEmpty
    String name;

    public Member(String name, String loginId, String password) {
        this.loginId = loginId;
        this.name = name;
        this.password = password;
    }
}
