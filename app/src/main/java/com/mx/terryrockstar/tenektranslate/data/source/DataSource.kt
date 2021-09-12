package com.mx.terryrockstar.tenektranslate.data.source

import com.mx.terryrockstar.tenektranslate.data.Result

interface DataSource {

    fun destroyInstance()

    fun getResponse(): Result<String>

}