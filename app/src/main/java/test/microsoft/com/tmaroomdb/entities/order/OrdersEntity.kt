package test.microsoft.com.tmaroomdb.entities.order

import androidx.room.Entity
import androidx.room.PrimaryKey
import test.microsoft.com.tmaroomdb.entities.menu.MenuIngredientsEntity

@Entity
data class OrdersEntity(
    @PrimaryKey(autoGenerate = false)
    var orderId: String = "",
    var menuItemId: String = "",

    var QTY: Int = 0,
    var main_shared_phone: String = "",
    var logo: String = "",
    var name: String = "",
    var nameAr: String = "",
    var notes: String = "",
    var option: String = "",
    var optionAr: String = ""
)
