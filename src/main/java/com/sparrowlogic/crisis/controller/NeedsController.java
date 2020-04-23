package com.sparrowlogic.crisis.controller;

import com.sparrowlogic.crisis.dto.Location;
import com.sparrowlogic.crisis.dto.NeedAcknowledgement;
import com.sparrowlogic.crisis.dto.NeedRequest;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/needs")
public final class NeedsController {

    @PostMapping
    public NeedAcknowledgement publishNeedRequest(NeedRequest request) {
        return null;
    }

    @DeleteMapping
    public void rescindNeedRequest(Long id, String token) {

    }

    @GetMapping(path = "")
    public List<NeedRequest> viewUnmetNeedsByGeoRegion(Location location, Integer redius) {
        return null;
    }
}
