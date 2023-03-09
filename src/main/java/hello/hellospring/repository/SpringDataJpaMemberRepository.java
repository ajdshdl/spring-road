package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * extends JpaRepository 하면  interface만 있어도 spring이 찾아서 Bean으로 등록함
 */
public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);   //JPQL select m from Member m where m.name=?
}
