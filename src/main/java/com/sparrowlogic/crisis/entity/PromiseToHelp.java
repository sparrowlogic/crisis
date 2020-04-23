package com.sparrowlogic.crisis.entity;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;

public final class PromiseToHelp {

    @Id
    private Long id;

    private Long needId;

    private Long volunteerId;

    private LocalDateTime expiresAt;

    private Boolean isFulfilled;
}
