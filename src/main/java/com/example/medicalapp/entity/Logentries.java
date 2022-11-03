package com.example.medicalapp.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "logentries")
public class Logentries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userid;
    private String entryid;
    private Long edittimestamp;
    private int systolic;
    private int diastolic;
    private int pulse;
    private boolean arrhythmias;
    private String comm;
    private Long measuretimestamp;


    @Override
    public String toString() {
        return userid;
    }
}


