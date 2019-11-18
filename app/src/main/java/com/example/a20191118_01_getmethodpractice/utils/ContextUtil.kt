package com.example.a20191118_01_getmethodpractice.utils

import android.content.Context

class ContextUtil {

    companion object{

        //메모장의 파일 이름에 대응되는 개념.
        val prefName = "PracticePreference"
        //사용자의 아이디를 저장하는 항목 이름
        val USER_ID = "USER_ID"
        //아이디 기억 여부 저장 항목 이름
        val ID_REMEBER = "ID_REMEMBER"
        //사용자 고유값(토큰값)을 저장하는 항목 이름
        val USER_TOKEN = "USER_TOKEN"

        //사용자 아이디를 저장해주는 func => setter
        fun setUserId(context:Context,userId:String){

            //메모장(파일이름 : PracitcePreference) 을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

            //내용을 작성하고 SAVE 버튼 누름.
            pref.edit().putString(USER_ID,userId).apply()
        }

        fun getUserId(context: Context) :String {

            var pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

            return pref.getString(USER_ID,"")!!

        }

        //사용자 아이디 기억 체크박스 저장해주는 func => setter
        fun setIdRemeber(context:Context,isRemember:Boolean){

            //메모장(파일이름 : PracitcePreference) 을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

            //내용을 작성하고 SAVE 버튼 누름.
            pref.edit().putBoolean(ID_REMEBER,isRemember).apply()
        }

        fun getIdRemeber(context: Context) :Boolean {

            var pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

            return pref.getBoolean(ID_REMEBER,false)!!

        }

        //사용자 아이디를 저장해주는 func => setter
        fun setUserToken(context:Context,userToken:String){

            //메모장(파일이름 : PracitcePreference) 을 실제로 여는 동작
            var pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

            //내용을 작성하고 SAVE 버튼 누름.
            pref.edit().putString(USER_TOKEN,userToken).apply()
        }

        fun getUserToken(context: Context) :String {

            var pref = context.getSharedPreferences(prefName,Context.MODE_PRIVATE)

            return pref.getString(USER_TOKEN,"")!!

        }


    }



}