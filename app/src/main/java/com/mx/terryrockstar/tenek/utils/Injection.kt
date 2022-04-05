package com.mx.terryrockstar.tenek.utils

import com.mx.terryrockstar.tenek.base.domain.usecase.GetDataUseCase
import com.mx.terryrockstar.tenek.data.source.ResponseRepository
import com.mx.terryrockstar.tenek.data.source.local.LocalSource
import com.mx.terryrockstar.tenek.data.source.remote.RemoteSource

class Injection {

    companion object {
        private fun provideRepository(): ResponseRepository {
            return ResponseRepository.getInstance(RemoteSource.getInstance(), LocalSource.getInstance())
        }

        fun provideGetDataUseCase() : GetDataUseCase{
            return GetDataUseCase(provideRepository())
        }
    }

}