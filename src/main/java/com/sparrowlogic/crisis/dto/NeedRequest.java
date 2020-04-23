package com.sparrowlogic.crisis.dto;

import java.time.LocalDateTime;

public class NeedRequest {

    private String type;
    
    private String email;

    private Location latitude;

    private LocalDateTime requestedTime;

    private String message;
}
