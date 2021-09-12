package com.mx.terryrockstar.tenektranslate.data.source

import com.mx.terryrockstar.tenektranslate.data.FilterType
import com.mx.terryrockstar.tenektranslate.data.Result

interface Repository {

    fun destroyInstance()

    suspend fun getResponse(forceUpdate: Boolean, currentFiltering: FilterType): Result<String>

}