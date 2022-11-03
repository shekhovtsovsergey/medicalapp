package com.example.medicalapp.dao;

import com.example.medicalapp.entity.Logentries;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LogEntriesDao extends JpaRepository<Logentries, Long> {

    Logentries findByUserid(String userid);

}
