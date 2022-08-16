package com.digitalgym.DigitalGym.repository;

import com.digitalgym.DigitalGym.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

   // List<Member> findByBirthDate(LocalDate birthDate);

}

