package com.example.medicalapp.service;


import com.example.medicalapp.dao.LogEntriesDao;
import com.example.medicalapp.entity.Logentries;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class LogentriesService {

    private final LogEntriesDao logEntriesDao;


    @Transactional(readOnly = true)
    public Logentries findByUserid(String userid) {
        return logEntriesDao.findByUserid(userid);
    }


}
