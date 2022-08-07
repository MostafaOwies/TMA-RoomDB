package test.microsoft.com.tmaroomdb.entities.restaurant

import androidx.room.Entity

@Entity
data class Integration(
    var ref: String = "",
    var type: String = ""
)
