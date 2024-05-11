package com.example.wazitoecommerce.models

class Architecture {
    var DesignerName:String = ""
    var email:String = ""
    var softwareused:String = ""
    var designtype:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, email: String, softwareused: String, designtype: String, imageUrl: String, id: String) {
        this.DesignerName = name
        this.email = email
        this.softwareused = softwareused
        this.designtype = designtype
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}

