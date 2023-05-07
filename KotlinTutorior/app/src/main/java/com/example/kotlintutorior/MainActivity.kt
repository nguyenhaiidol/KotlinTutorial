package com.example.kotlintutorior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //khaiBaoBien()

        //hamFor()

        //mangArray()

        doiTuongOOP()

    }

    fun khaiBaoBien() {
        //bien co the gan  null
        var name: String? = "hai"
        name = null
        // khong the khoi tao lai = final
        val temp = "abc"
    }

    fun hamFor() {
        //For
        for (i in 0..10) {
            Log.d("hai", "i : " + i)
        }
        // For bien
        var a: Int = 5
        for (i in 0 until a) {
            Log.d("hai", "i 0 to a : i = " + i)
        }
        for (i in a downTo 0) {
            //
        }
        for (i in 0..a step 2) {
            Log.d("hai", " step for i : " + i)
        }
    }

    fun mangArray() {
        //C1
        var mangso: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7)// Khong co ho tro StringArray
        mangso.get(0)
        //Cach 2
        var mangString: List<String> = listOf("aaa", "bbb", "ccc")
        mangString.get(0)
        //cach 3
        var mangten :ArrayList<String> = ArrayList()
        mangten.add("aa1")
        mangten.add("aa2")
        mangten.add("aa3")
        mangten.add("aa4")
        //xoa phan tu trong mang
        mangten.remove("aa2") // or
        mangten.removeAt(1)
        // Sua gia  tri trong mang
        mangten.set(2,"aaa3")

    }

    fun doiTuongOOP(){
        var sv : SinhVien = SinhVien("hai","hai duong")
        Log.d("hai", sv.getName())
    }
}