package com.mx.terryrockstar.tenektranslate.utils

import com.mx.terryrockstar.tenektranslate.base.domain.usecase.GetDataUseCase
import com.mx.terryrockstar.tenektranslate.data.source.ResponseRepository
import com.mx.terryrockstar.tenektranslate.data.source.local.LocalSource
import com.mx.terryrockstar.tenektranslate.data.source.remote.RemoteSource

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