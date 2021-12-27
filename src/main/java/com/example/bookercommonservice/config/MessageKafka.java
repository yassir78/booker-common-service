package com.example.bookercommonservice.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class MessageKafka {
    private String payload;
    private String processName;
    private String version;
    private String ms;
    private Date date;

}
