package com.smartwaste.controller;

import com.smartwaste.model.Bin;
import com.smartwaste.repository.BinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bins")
@CrossOrigin("*")
public class BinController {

    @Autowired
    private BinRepository binRepository;

    // GET ALL
    @GetMapping
    public List<Bin> getAllBins() {
        return binRepository.findAll();
    }

    // ADD BIN
    @PostMapping
    public Bin addBin(@RequestBody Bin bin) {
        return binRepository.save(bin);
    }

    // DELETE BIN
    @DeleteMapping("/{id}")
    public void deleteBin(@PathVariable Long id) {
        binRepository.deleteById(id);
    }

    // 🔥 UPDATE BIN FILL LEVEL
    @PutMapping("/{id}")
public Bin updateBin(@PathVariable Long id, @RequestBody Bin updated) {

    Bin bin = binRepository.findById(id).orElseThrow();

    // ✅ If pickup completed → reset fill level
    if ("Completed".equalsIgnoreCase(updated.getPickupStatus())) {
        bin.setFillLevel(0);                // 🔥 make bin empty
        bin.setPickupStatus("Completed");   // optional
    } 
    else {
    // normal update (NO null check for int)
    bin.setFillLevel(updated.getFillLevel());

    if (updated.getPickupStatus() != null) {
        bin.setPickupStatus(updated.getPickupStatus());
    }
    }

    return binRepository.save(bin);
}
}