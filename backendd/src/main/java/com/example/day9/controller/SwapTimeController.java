package com.example.day9.controller;

import com.example.day9.model.SwapTime;
import com.example.day9.service.SwapTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/swapTimes")
public class SwapTimeController {

    @Autowired
    private SwapTimeService swapTimeService;

    @GetMapping
    public ResponseEntity<List<SwapTime>> getAllSwapTimes() {
        List<SwapTime> swapTimes = swapTimeService.getAllSwapTimes();
        return new ResponseEntity<>(swapTimes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<SwapTime>> getSwapTimeById(@PathVariable Long id) {
        Optional<SwapTime> swapTime = swapTimeService.getSwapTimeById(id);
        return new ResponseEntity<>(swapTime, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SwapTime> createSwapTime(@RequestBody SwapTime swapTime) {
        SwapTime savedSwapTime = swapTimeService.createSwapTime(swapTime);
        return new ResponseEntity<>(savedSwapTime, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SwapTime> updateSwapTime(@PathVariable Long id, @RequestBody SwapTime swapTimeDetails) {
        SwapTime updatedSwapTime = swapTimeService.updateSwapTime(id, swapTimeDetails);
        return new ResponseEntity<>(updatedSwapTime, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteSwapTime(@PathVariable Long id) {
        swapTimeService.deleteSwapTime(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
