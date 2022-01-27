package com.mx.terryrockstar.tenektranslate.base.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(
        @SerializedName("error") val error: String = "",
        @SerializedName("message") val message: String = "",
        @SerializedName("status") val status: Int): Parcelable