package com.example.a20191118_01_getmethodpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a20191118_01_getmethodpractice.datas.User
import com.example.a20191118_01_getmethodpractice.utils.ServerUtil
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {
    }

    override fun setValues() {
        ServerUtil.getRequestMyInfo(mContext,object : ServerUtil.JsonResponseHandler{
            override fun onResponse(json: JSONObject) {
                val data = json.getJSONObject("data")
                val user = data.getJSONObject("user")

                var me = User.getUserFromJson(user)

                runOnUiThread {
                    nameTxt.text = me.name
                    phoneNumTxt.text = me.phone
                    loginIdTxt.text = me.login_id
                    categoryTxt.text = me.category.title
                }
            }

        })
    }
}
