package com.mx.terryrockstar.tenek.data.source

import com.mx.terryrockstar.tenek.data.Result

interface DataSource {

    fun destroyInstance()

    fun getResponse(): Result<String>

}