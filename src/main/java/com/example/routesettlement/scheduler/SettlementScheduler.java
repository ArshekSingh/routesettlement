package com.example.routesettlement.scheduler;


import com.example.routesettlement.service.SettlementServiceImpl;
import com.razorpay.RazorpayException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SettlementScheduler {

    @Autowired
    SettlementServiceImpl service;

    @Scheduled(fixedRate = 10000)
    public void paymentSettled() throws RazorpayException{
    service.fetchAll();
    }
}
