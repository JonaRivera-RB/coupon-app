package com.anncode.offersandcoupons.Presenter

import com.anncode.offersandcoupons.Model.Coupon

interface CouponContract {

    interface View {

        fun getCoupons()
        fun showCoupons(coupons: ArrayList<Coupon>?)
    }

    interface Presenter {

        fun showCoupons(coupons: ArrayList<Coupon>?)
        fun getCoupons()
    }
}