package test.microsoft.com.tmaroomdb.entities.restaurant

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RestaurantsEntity(
    @PrimaryKey(autoGenerate = false)
    var name: String = "",
    var nTables: Int = 0,
    var logo: String = "",
    var discount: Double = 0.0,
    var discount_card: Int = 0,
    var PW_m_key: String = "",
    var PW_m_secret: String = "",
    var integrations: MutableList<Integration> = mutableListOf()
)

