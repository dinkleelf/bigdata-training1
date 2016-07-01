package com.reluscloud.people

class Person(
    val firstName: String, 
    val lastName: String, 
    val age: Int, 
    val occupation: String
) {

    def fullName: String = firstName + " " + lastName

    def greet (formal: Boolean): String = {
        if (formal) 
          "Hello, my name is " + fullName +". I'm a " + occupation + "."
        else 
          "Hi, I'm " + firstName + "!"
    }

}

class Developer(
    firstName: String, 
    lastName: String, 
    age: Int, 
    val speciality: String, 
    val favoriteLanguage: String
) extends Person (firstName, lastName, age, "developer") {

   def workGreeting = 
     "As a " + occupation + ", I am a " + speciality + " who likes to work with " + favoriteLanguage + "."

}
