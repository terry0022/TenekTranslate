package com.mx.terryrockstar.tenek.data.source

import com.mx.terryrockstar.tenek.data.FilterType
import com.mx.terryrockstar.tenek.data.Result

interface Repository {

    fun destroyInstance()

    suspend fun getResponse(forceUpdate: Boolean, currentFiltering: FilterType): Result<String>

}