package com.example.app.log;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Log {

    List<String> msg = new ArrayList<>();

    public void message(LogType t, String msg){
        Date date= new Date();
        Timestamp ts = new Timestamp(date.getTime());
        // file open and write timestamp and log message
    }
}
