package com.karan.Community.Food.Sharing.Platform.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karan.Community.Food.Sharing.Platform.DTO.PickupRequestDto;
import com.karan.Community.Food.Sharing.Platform.Entities.PickupRequest;
import com.karan.Community.Food.Sharing.Platform.Entities.User;
import com.karan.Community.Food.Sharing.Platform.Repositories.PickupRequestRepository;
import com.karan.Community.Food.Sharing.Platform.Repositories.UserRepository;

@RestController
@RequestMapping("/pickup")
public class PickupRequestManagement {

    @Autowired
    private PickupRequestRepository pickupRequestRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/request")
    public PickupRequest registerAllPickupRequest(@RequestBody PickupRequestDto pickupRequestDto) {
        User requester = userRepository.findById(pickupRequestDto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        PickupRequest pickupRequest = new PickupRequest();
        pickupRequest.setPickupRequestId(pickupRequestDto.getPickupRequestId());
        pickupRequest.setFoodItemID(pickupRequestDto.getFoodItemID());
        pickupRequest.setRequester(requester);
        pickupRequest.setRequestDate(pickupRequestDto.getRequestDate());
        pickupRequest.setStatus(pickupRequestDto.getStatus());

        return pickupRequestRepository.save(pickupRequest);
    }

    @GetMapping("/requests")
    public List<PickupRequest> getAllPickupRequests() {
        return pickupRequestRepository.findAll();
    }
}
