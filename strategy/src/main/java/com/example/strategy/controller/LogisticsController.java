package com.example.strategy.controller;

import com.example.strategy.dao.TransferFeeRequest;
import com.example.strategy.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class LogisticsController {

    @Autowired
    private List<LogisticsService> logisticsService;

    @PostMapping("/calculate")
    private BigDecimal calculateFee(@RequestBody TransferFeeRequest transferFeeRequest) {
        LogisticsService logisticsService = this.logisticsService.stream().filter(l -> l.isCurrentLogistics(transferFeeRequest.getType()))
                .findFirst().orElse(null);
        if (logisticsService != null) {
            return logisticsService.calculateFee(transferFeeRequest);
        }
        return null;
    }
}
