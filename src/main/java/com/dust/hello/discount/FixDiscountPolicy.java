package com.dust.hello.discount;

import com.dust.hello.member.Grade;
import com.dust.hello.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmout = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmout;
        } else {
            return 0;
        }
    }
}
