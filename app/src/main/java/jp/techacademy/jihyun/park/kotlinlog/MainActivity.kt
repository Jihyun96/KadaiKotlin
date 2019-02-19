package jp.techacademy.jihyun.park.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1= Human("佐藤", 20, "kotlin")
        val human2= Human("鈴木", 30, "Android Studio")

        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }

}
