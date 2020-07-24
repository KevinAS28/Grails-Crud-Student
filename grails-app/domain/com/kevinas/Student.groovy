package com.kevinas

class Student {
    String name
    int grade
    static constraints = {
        name size: 3..200, blank: false, unique: true
        grade size: 8, blank: false
    }
    String toString(){
        name + grade.toString()
    }
}
