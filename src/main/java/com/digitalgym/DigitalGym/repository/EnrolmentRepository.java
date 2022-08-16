package com.digitalgym.DigitalGym.repository;


import com.digitalgym.DigitalGym.entity.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EnrolmentRepository extends JpaRepository<Enrolment, Long> {

    @Query(value = "SELECT * FROM tb_enrolments m " +
            "INNER JOIN tb_members a ON m.member_id = a.id " +
            "WHERE a.city = :city", nativeQuery = true)
    List<Enrolment> findMembersEnrolmentCity(String city);

}
