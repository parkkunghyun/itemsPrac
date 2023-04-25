package itemsPrac.itemsPrac.domain.member;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemberRepository {
    Map<Long,Member> store = new HashMap<>();
    private static Long sequence = 0L;

    // save
    public Member save(Member member){
        sequence++;
        member.setId(sequence);
        store.put(sequence,member);
        return member;
    }

    // findById
    public Member findById(Long id) {return store.get(id);}

    // findAll
    public List<Member> findAll() {
        return  new ArrayList<>(store.values());
    }

    // findByLoginId
    public Optional<Member> findByLoginId(String loginId) {
        List<Member> members = findAll();
        return members.stream()
                .filter(m -> m.getLoginId().equals(loginId))
                .findFirst();
    }
    // clear
}
