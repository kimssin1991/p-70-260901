package com.back.p67260811.domain.member.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.back.p67260811.domain.member.member.entity.Member;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
    Optional<Member> findByApiKey(String apiKey);
}