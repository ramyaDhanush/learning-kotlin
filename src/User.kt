class User (var firstName: String, var lastName: String, isActive : Boolean){
    var fullname = "$firstName $lastName"
        get() = "Name $field"
        set(value) {
            field = if(value.startsWith("K")) {
                "Khan Sharukh"
            } else {
                "No Name"
            }
        }

//    init {
//        println("Init 1")
//    }
    constructor(firstName: String, lastName: String) : this(firstName, lastName, false){
//        println("Called")
//        println("$firstName $lastName")
    }

//    init {
//        println("Init 2 $fullname")
//    }

    constructor(firstName: String) : this(firstName, "Unknown"){
//        println("Called 2")
//        println("$firstName ")
    }

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun updateName(newFirstName : String) {
        firstName = newFirstName
    }

    fun firstNameLength() {
        println(firstName.length)
    }
}

/*
Primary Constructor
All Initializer blocks
Secondary Constructor
 */