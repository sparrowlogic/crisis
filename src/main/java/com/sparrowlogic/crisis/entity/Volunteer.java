package com.sparrowlogic.crisis.entity;

import com.sparrowlogic.crisis.dto.Location;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

public final class Volunteer {

    @Id
    private Long id;

    private String name;

    private String contactInformation;

    @Embedded(prefix = "location_", onEmpty = Embedded.OnEmpty.USE_EMPTY)
    private Location location;

    private Integer monitoringDistanceInKm;

    private List<NeedType> serving;

    private List<PromiseToHelp> promises;

}
