package com.anncode.offersandcoupons.Model

interface CouponDataSource {

    interface Repository {
        fun getCouponsAPI()
    }

    interface Interactor {
        fun getCouponsAPI()
    }

}