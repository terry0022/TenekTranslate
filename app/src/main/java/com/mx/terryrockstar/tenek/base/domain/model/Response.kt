<<<<<<< HEAD:app/src/main/java/com/mx/terryrockstar/tenektranslate/base/domain/model/Response.kt
package com.mx.terryrockstar.tenektranslate.base.domain.model
=======
package com.mx.terryrockstar.tenek.base.domain.model
>>>>>>> development:app/src/main/java/com/mx/terryrockstar/tenek/base/domain/model/Response.kt

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(
        @SerializedName("error") val error: String = "",
        @SerializedName("message") val message: String = "",
        @SerializedName("status") val status: Int): Parcelable