package com.example.vaadindemo;

import java.sql.Date;

public class LoadLog {
    private Date LOAD_FINISH;
    public Date getLOAD_FINISH() {
        return LOAD_FINISH;
    }

    public void setLOAD_FINISH(Date LOAD_FINISH) {
        this.LOAD_FINISH = LOAD_FINISH;
    }

    public String getSTEP() {
        return STEP;
    }

    public void setSTEP(String STEP) {
        this.STEP = STEP;
    }

    public String getSTATUS() {

        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public int getROWS_PROCESSED() {

        return ROWS_PROCESSED;
    }

    public void setROWS_PROCESSED(int ROWS_PROCESSED) {
        this.ROWS_PROCESSED = ROWS_PROCESSED;
    }

    public String getMODULE_NAME() {

        return MODULE_NAME;
    }

    public void setMODULE_NAME(String MODULE_NAME) {
        this.MODULE_NAME = MODULE_NAME;
    }

    public Date getLOAD_START() {

        return LOAD_START;
    }

    public void setLOAD_START(Date LOAD_START) {
        this.LOAD_START = LOAD_START;
    }

    public int getLOAD_NUM() {

        return LOAD_NUM;
    }

    public void setLOAD_NUM(int LOAD_NUM) {
        this.LOAD_NUM = LOAD_NUM;
    }

    private  int LOAD_NUM;

    private Date LOAD_START;
    private String  MODULE_NAME;
    private  int ROWS_PROCESSED;
    private String STATUS;
    private String  STEP;
}
