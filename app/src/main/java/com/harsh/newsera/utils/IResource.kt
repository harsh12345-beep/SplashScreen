package com.harsh.newsera.utils

sealed class IResource<T>(val data: T?, val message: String?) {
    class Success<T>(data: T?) : IResource<T>(data, null)
    class Error<T>(message: String) : IResource<T>(null, message)
}

/*
data class User(
    val name: String,
    val age: String
)

data class Student(
    val name: String,
    val age: String
)

fun <T> printUsername(user: T) {
    when(user) {
        is User -> {
            println(user.name)
        }
        is Student -> {
            println(user.name)
        }
    }
}

fun main() {
    val user = User("rishi", "10")
    printUsername(user)
}*/
