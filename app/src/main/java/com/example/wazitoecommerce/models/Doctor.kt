package com.example.wazitoecommerce.models

class Doctor {
    var doctorname:String = ""
    var workexperience:String = ""
    var email:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String, imageUrl: String, id: String) {
        this.doctorname = name
        this.workexperience= quantity
        this.email = price
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}
