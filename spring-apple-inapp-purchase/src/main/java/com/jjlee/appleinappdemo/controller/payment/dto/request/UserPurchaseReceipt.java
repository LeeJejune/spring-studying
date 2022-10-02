package com.jjlee.appleinappdemo.controller.payment.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jjlee.appleinappdemo.service.payment.dto.request.UserReceiptDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserPurchaseReceipt {
    @JsonProperty("receipt-data")
    private String receiptData;

    public UserReceiptDto toServiceDto(){
        return UserReceiptDto.of(receiptData);
    }
}
