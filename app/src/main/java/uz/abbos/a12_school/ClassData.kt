package uz.abbos.a12_school

class ClassData {
    var id: String = ""
    var harf:String=""
    var classNumber: String = ""
    var timesTamp: Long? = 0


    constructor(id: String, harf: String, classNumber: String, timesTamp: Long?) {
        this.id = id
        this.harf = harf
        this.classNumber = classNumber
        this.timesTamp = timesTamp
    }

    constructor()
}