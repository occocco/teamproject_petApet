package com.teamproject.petapet.web.product;

import com.teamproject.petapet.web.product.service.CouponService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CouponScheduler {

    private final CouponService couponService;

//    @Scheduled(cron = "*/5 * * * * *")
    public void couponUpdateSchedule(){
        couponService.activeCoupon();
    }
}
