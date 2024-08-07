package com.example.day9.service;

import com.example.day9.model.SwapTime;
import com.example.day9.repository.SwapTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SwapTimeService {

    @Autowired
    private SwapTimeRepository swapTimeRepository;

    public List<SwapTime> getAllSwapTimes() {
        return swapTimeRepository.findAll();
    }

    public Optional<SwapTime> getSwapTimeById(Long id) {
        return swapTimeRepository.findById(id);
    }

    public SwapTime createSwapTime(SwapTime swapTime) {
        return swapTimeRepository.save(swapTime);
    }

    public SwapTime updateSwapTime(Long id, SwapTime swapTimeDetails) {
        SwapTime swapTime = swapTimeRepository.findById(id).orElseThrow(() -> new RuntimeException("SwapTime not found"));
        swapTime.setEmpName(swapTimeDetails.getEmpName());
        swapTime.setDepartment(swapTimeDetails.getDepartment());
        swapTime.setRequestDate(swapTimeDetails.getRequestDate());
        swapTime.setShiftDetails(swapTimeDetails.getShiftDetails());
        swapTime.setSwapWith(swapTimeDetails.getSwapWith());
        swapTime.setReason(swapTimeDetails.getReason());
        return swapTimeRepository.save(swapTime);
    }

    public void deleteSwapTime(Long id) {
        swapTimeRepository.deleteById(id);
    }
}
