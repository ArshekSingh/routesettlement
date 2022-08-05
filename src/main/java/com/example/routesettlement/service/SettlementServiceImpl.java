package com.example.routesettlement.service;

import com.example.routesettlement.entity.SettlementEntity;
import com.example.routesettlement.mapper.ResponseMapper;
import com.razorpay.*;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class SettlementServiceImpl implements SettlementService{

    @Autowired
    ResponseMapper responseMapper;

    public SettlementEntity fetchAll() throws RazorpayException {
        log.info("Below are the all settled records");
        RazorpayClient razorpay = new RazorpayClient("rzp_live_FE2cV60B2wUEhA", "QADd80MqFrceY4Vw9YJbuWMr");

//        JSONObject params = new JSONObject();
//        params.put("year", 2022);
//        params.put("month", 8);
//        params.put("day", 3);



        List<Transfer> settlements = razorpay.transfers.fetchAll();
       // List<Settlement> settlements = razorpay.settlement.fetchAll();
        //List<Settlement> settlements = razorpay.settlement.reports(params);
       // List<Payment> settlements = razorpay.payments.fetchAll();
        SettlementEntity settlementEntity = responseMapper.mapSettlement(settlements);
        System.out.println(settlementEntity);
        return settlementEntity;

    }
}
