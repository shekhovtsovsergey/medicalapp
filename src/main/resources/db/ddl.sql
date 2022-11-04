CREATE TABLE logentries
(
    ID                  BIGSERIAL      NOT NULL PRIMARY KEY,
    USERID              VARCHAR(255)   NOT NULL,
    EDITTIMESTAMP       BIGSERIAL      NOT NULL,
    SYSTOLIC            INT            NOT NULL,
    DIASTOLIC           INT            NOT NULL,
    PULSE               INT            NOT NULL,
    ARRHYTHMIAS         BOOLEAN        NOT NULL,
    COMM                VARCHAR(255)   NOT NULL,
    MEASURETIMESTAMP    BIGSERIAL      NOT NULL
);