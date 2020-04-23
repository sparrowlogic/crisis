package com.sparrowlogic.crisis.entity;

import org.springframework.data.annotation.Id;

public class NeedType {

    @Id
    private String id;

    private String name;

    private String description;
}
