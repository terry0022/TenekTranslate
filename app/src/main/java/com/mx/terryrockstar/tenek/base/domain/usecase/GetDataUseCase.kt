package com.mx.terryrockstar.tenek.base.domain.usecase

import com.mx.terryrockstar.tenek.base.domain.model.Response
import com.mx.terryrockstar.tenek.data.FilterType
import com.mx.terryrockstar.tenek.data.Result
import com.mx.terryrockstar.tenek.data.source.Repository

class GetDataUseCase(private val repository: Repository) {

    suspend operator fun invoke(forceUpdate: Boolean = false, currentFiltering: FilterType): Result<String> {

        val postResult = repository.getResponse(forceUpdate, currentFiltering)

        if (postResult is Result.Success<String>) {
            return if (postResult.data.isNotEmpty()) {
                Result.Success(postResult.data)
            } else {
                Result.Error(Response("Error de sincronización de datos", "", 500))
            }
        }
        return postResult
    }

}