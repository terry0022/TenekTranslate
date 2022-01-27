package com.mx.terryrockstar.tenektranslate.base.domain.usecase

import com.mx.terryrockstar.tenektranslate.base.domain.model.Response
import com.mx.terryrockstar.tenektranslate.data.FilterType
import com.mx.terryrockstar.tenektranslate.data.Result
import com.mx.terryrockstar.tenektranslate.data.source.Repository

class GetDataUseCase(private val repository: Repository) {

    suspend operator fun invoke(forceUpdate: Boolean = false, currentFiltering: FilterType): Result<String> {

        val postResult = repository.getResponse(forceUpdate, currentFiltering)

        if (postResult is Result.Success<*>) {
            return if (postResult.data.toString().isNotEmpty()) {
                Result.Success(postResult.data.toString())
            } else {
                Result.Error(Response("Error de sincronización de datos", "", 500))
            }
        }
        return postResult
    }

}