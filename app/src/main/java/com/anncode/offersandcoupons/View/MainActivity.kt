package com.anncode.offersandcoupons.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.anncode.offersandcoupons.Model.Coupon
import com.anncode.offersandcoupons.Model.ApiAdapter
import com.anncode.offersandcoupons.Presenter.CouponContract
import com.anncode.offersandcoupons.Presenter.CouponPresenter
import com.anncode.offersandcoupons.R
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), CouponContract.View {

    private var couponPresenter: CouponPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        couponPresenter = CouponPresenter(this)

        getCoupons()
    }

    override fun getCoupons() {
        couponPresenter?.getCoupons()
    }

    override fun showCoupons(coupons: ArrayList<Coupon>?) {
        rvCoupons.layoutManager = LinearLayoutManager(this)
        coupons?.let {
            rvCoupons.adapter = RecyclerCouponsAdapter(it, R.layout.card_coupon)
        }
    }

}
