package com.kevinas

class Student {
    String name
    int grade
    static constraints = {
        name size: 5..40, blank: false, unique: true
        grade size: 8, blank: false
    }
    String toString(){
        name + grade.toString()
    }
}
