package com.anncode.offersandcoupons.Presenter

import com.anncode.offersandcoupons.Model.Coupon
import com.anncode.offersandcoupons.Model.CouponsInteractor

class CouponPresenter(var couponView: CouponContract.View): CouponContract.Presenter {

    private var couponInteractor: CouponsInteractor = CouponsInteractor(this)
    override fun showCoupons(coupons: ArrayList<Coupon>?) {
        couponView.showCoupons(coupons)
    }

    override fun getCoupons() {
        couponInteractor.getCouponsAPI()
    }

}