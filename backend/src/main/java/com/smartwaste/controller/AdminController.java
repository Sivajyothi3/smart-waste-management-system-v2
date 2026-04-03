package com.smartwaste.controller;

import com.smartwaste.model.Bin;
import com.smartwaste.repository.BinRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {

    private final BinRepository repo;

    public AdminController(BinRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/bins")
    public List<Bin> getBins() {
        return repo.findAll();
    }

    @DeleteMapping("/bins/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}