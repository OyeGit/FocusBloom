package com.joelkanyi.focusbloom

actual object AppLogger {
    actual fun e(tag: String, message: String, throwable: Throwable?) {
        // TODO:
    }

    actual fun d(tag: String, message: String) {
    }

    actual fun i(tag: String, message: String) {
        println(tag+": "+message)
    }

}