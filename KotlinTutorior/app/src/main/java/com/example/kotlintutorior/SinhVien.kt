package com.example.kotlintutorior

class SinhVien {
    private var name: String = ""
    private var address: String = ""

    constructor(name: String, address: String) {
        this.name = name
        this.address = address
    }

    fun  getName() : String{
        return name
    }
}