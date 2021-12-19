package cpj.hellospring.repository;

import cpj.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
* Spring Data JPA를 사용하기 위해 만듬.
* */

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

//    JPQL형식의 select m from Member m where m.name = ? 라는 것을 인터페이스 이름만으로 자동으로 적용됨.
    @Override
    Optional<Member> findByName(String name);
}
