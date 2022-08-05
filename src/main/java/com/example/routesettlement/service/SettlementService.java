package com.example.routesettlement.service;

import com.example.routesettlement.entity.SettlementEntity;
import com.razorpay.RazorpayException;

public interface SettlementService {

    SettlementEntity fetchAll() throws RazorpayException;

}
