package com.smartwaste.controller;

import com.smartwaste.model.Report;
import com.smartwaste.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin
public class ReportController {

    @Autowired
    private ReportRepository reportRepository;

    // ✅ GET ALL REPORTS
    @GetMapping
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    // ✅ ADD REPORT (USER)
    @PostMapping
    public Report addReport(@RequestBody Report report) {
        report.setStatus("Pending"); // default status
        return reportRepository.save(report);
    }

    // ✅ ADMIN UPDATE (IMPORTANT LOGIC)
    @PutMapping("/{id}")
    public void updateReport(@PathVariable Long id, @RequestBody Report updated) {

        Report report = reportRepository.findById(id).orElse(null);

        if (report != null) {

            // 🔥 IF RESOLVED → DELETE REPORT
            if ("Resolved".equalsIgnoreCase(updated.getStatus())) {
                reportRepository.deleteById(id);
            } 
            else {
                // Otherwise update normally
                report.setStatus(updated.getStatus());

                // Optional: keep other fields safe
                report.setDescription(report.getDescription());
                report.setLocation(report.getLocation());
                report.setBinStatus(report.getBinStatus());

                reportRepository.save(report);
            }
        }
    }
}