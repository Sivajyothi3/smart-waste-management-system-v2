package com.smartwaste.controller;

import com.smartwaste.model.Pickup;
import com.smartwaste.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pickups")
@CrossOrigin("*")
public class PickupController {

    @Autowired
    private PickupRepository pickupRepository;

    // GET ALL
    @GetMapping
    public List<Pickup> getAllPickups() {
        return pickupRepository.findAll();
    }

    // ADD
    @PostMapping
    public Pickup addPickup(@RequestBody Pickup pickup) {
        return pickupRepository.save(pickup);
    }

    // 🔥 UPDATE STATUS
    @PutMapping("/{id}")
    public Pickup updatePickup(@PathVariable Long id, @RequestBody Pickup updated) {
        Pickup pickup = pickupRepository.findById(id).orElseThrow();

        pickup.setStatus(updated.getStatus());

        return pickupRepository.save(pickup);
    }
}
