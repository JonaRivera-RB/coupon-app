package com.anncode.offersandcoupons.Model

import com.anncode.offersandcoupons.Presenter.CouponPresenter

class CouponsInteractor(couponsPresenter: CouponPresenter): CouponDataSource.Interactor {

    private var couponRepository: CouponDataSource.Repository = CouponRepository(couponsPresenter)

    override fun getCouponsAPI() {
        couponRepository.getCouponsAPI()
    }

}