package com.example.routesettlement.mapper;

import com.example.routesettlement.entity.SettlementEntity;
import com.razorpay.Transfer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Slf4j
public class ResponseMapper {

    public SettlementEntity mapSettlement(List<Transfer> payments){

    SettlementEntity settlementEntity = new SettlementEntity();

        payments.forEach(payment -> {

            if (!payment.toJson().isNull("id"))
                settlementEntity.setId(payment.get("id"));
            if (!payment.toJson().isNull("entity"))
                settlementEntity.setEntity(payment.get("entity"));
            if (!payment.toJson().isNull("amount"))
                settlementEntity.setAmount(payment.get("amount"));
            if (!payment.toJson().isNull("currency"))
                settlementEntity.setCurrency(payment.get("currency"));
            if (!payment.toJson().isNull("status"))
                settlementEntity.setStatus(payment.get("status"));
            if (!payment.toJson().isNull("order_id"))
                settlementEntity.setOrderId(payment.get("order_id"));
            if (!payment.toJson().isNull("method"))
                settlementEntity.setMethod(payment.get("method"));
            if (!payment.toJson().isNull("description"))
                settlementEntity.setDescription(payment.get("description"));
            if (!payment.toJson().isNull("amount_reversed"))
                settlementEntity.setAmountReversed(payment.get("amount_reversed"));
            if (!payment.toJson().isNull("captured"))
                settlementEntity.setCaptured(payment.get("captured"));
            if (!payment.toJson().isNull("bank"))
                settlementEntity.setBank(payment.get("bank"));
            if (!payment.toJson().isNull("email"))
                settlementEntity.setEmail(payment.get("email"));
            if (!payment.toJson().isNull("contact"))
                settlementEntity.setContact(payment.get("contact"));
            if (!payment.toJson().isNull("fee"))
                settlementEntity.setFee(payment.get("fee"));
            if (!payment.toJson().isNull("tax"))
                settlementEntity.setTax(payment.get("tax"));
            if (!payment.toJson().isNull("created_at"))
                settlementEntity.setCreatedAt(payment.get("created_at"));
            if(!payment.toJson().isNull("settlement_status"))
                settlementEntity.setSettlement_status(payment.get("settlement_status"));
            if(!payment.toJson().isNull("year"))
                settlementEntity.setSettlement_status(payment.get("year"));
            if(!payment.toJson().isNull("month"))
                settlementEntity.setSettlement_status(payment.get("month"));
            if(!payment.toJson().isNull("day"))
                settlementEntity.setSettlement_status(payment.get("day"));

        });
        return settlementEntity;

    }
}
