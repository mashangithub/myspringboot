package com.ljm.cn.repository;


import com.ljm.cn.domain.StudentEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Qualifier("aa")
@Repository
public interface StudentRepository extends JpaRepository<StudentEnt, Long> {

    @Query(value = "select * from student WHERE cid in(:cid)",nativeQuery =true )
    List<StudentEnt> findByCid(@Param("cid") List<String> cid);

}
