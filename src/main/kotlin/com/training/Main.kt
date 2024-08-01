package com.training

import com.training.basic.Conditionals
import com.training.basic.DataTypes
import com.training.basic.HelloWorld
import javax.xml.crypto.Data

fun main() {
    HelloWorld.execute()
    HelloWorld.execute("John")

    DataTypes.execute("TEST STRING")
    DataTypes.execute('1')
    DataTypes.execute('c')

    val int1 = 1
    val int2 = 2
    DataTypes.execute(int1, int2)

    val short1:Short = 1
    val short2:Short = 2
    DataTypes.execute(short1, short2)

    DataTypes.execute(1L, 2L)

    DataTypes.execute(1.0F, 2.0F)

    DataTypes.execute(1.0, 2.0)

    val byte1:Byte = 1
    val byte2:Byte = 1
    DataTypes.execute(byte1, byte2)

    DataTypes.execute(true, false)

    Conditionals.executeIfElse(1, 2)
    Conditionals.executeIfElse(3, 2)
    Conditionals.executeIfElse(1, 1)
    Conditionals.executeWhen(1, 2)
    Conditionals.executeWhen(3, 2)
    Conditionals.executeWhen(1, 1)
}