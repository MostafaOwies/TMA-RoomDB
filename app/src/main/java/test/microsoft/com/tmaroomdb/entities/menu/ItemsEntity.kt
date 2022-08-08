package test.microsoft.com.tmaroomdb.entities.menu

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ItemsEntity(
    @PrimaryKey(autoGenerate = false)
    var menuItemId: String = "",
    var name: String = "",
    var nameAr: String = "",
    var price: Double = 0.0,
    var logo: String = "",
    var orderId: String = "",

    var menuId: String = "",
    var maxIng: Int = 0,
    var minIng: Int = 0,
    var priority: Int = 0,
    var notes: String = "",
    var serving: String = "",
    var servingAr: String = ""
)
