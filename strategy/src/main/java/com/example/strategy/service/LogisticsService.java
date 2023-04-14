package com.example.strategy.service;

import com.example.strategy.dao.TransferFeeRequest;

import java.math.BigDecimal;

public interface LogisticsService {

    boolean isCurrentLogistics(Integer type);

    BigDecimal calculateFee(TransferFeeRequest transferFeeRequest);
}
