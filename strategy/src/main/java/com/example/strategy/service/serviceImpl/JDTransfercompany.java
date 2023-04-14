package com.example.strategy.service.serviceImpl;

import com.example.strategy.dao.TransferFeeRequest;
import com.example.strategy.service.LogisticsService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Objects;

@Service
public class JDTransfercompany implements LogisticsService{

    private BigDecimal pickFee = BigDecimal.TEN;

    private BigDecimal minDistance = BigDecimal.valueOf(60);

    @Override
    public boolean isCurrentLogistics(Integer type) {
        return Objects.equals(type, 2);
    }

    @Override
    public BigDecimal calculateFee(TransferFeeRequest transferFeeRequest) {
        BigDecimal distance = minDistance.compareTo(transferFeeRequest.getDistance()) > 0 ?
                minDistance : transferFeeRequest.getDistance();
        BigDecimal fee = distance.multiply(transferFeeRequest.getUnitPrice()).add(pickFee);
        // do business
        return fee;
    }
}
