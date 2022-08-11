package com.testmd4.repositories;

import com.testmd4.model.Staff;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public interface IStaffRepo extends CrudRepository<Staff, Long> {
    List<Staff> findByStaffNameContaining(String name);

    @Query(nativeQuery = true,value = "select * from staff order by staffAge")
    List<Staff> findall();

    Optional<Staff> findByStaffName(String name);
    Optional<Staff> findByStaffCode(String name);

}
