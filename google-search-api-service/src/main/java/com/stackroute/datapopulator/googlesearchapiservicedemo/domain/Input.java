package com.stackroute.datapopulator.googlesearchapiservicedemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


//Domain object for input
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Input {
    @Id
    private String userId;
    private String domain;
    private String[] concepts;
    private String sessionId;

}
