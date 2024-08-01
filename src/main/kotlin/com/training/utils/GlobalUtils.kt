package com.training.utils

import java.io.ByteArrayOutputStream

object GlobalUtils {
    fun ByteArrayOutputStream.printOutput(): String {
        return this.toString().replace("\r\n", "")
    }
}