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
    var QTY_shared: Double = 0.0,
    var catId: String = "", // Category ID
    var isOffer: Boolean = false,
    var is_shared: Boolean = false,
    var isShared: Boolean = false,
    var main_shared_phone: String = "",
    var logo: String = "",
    var name: String = "",
    var nameAr: String = "",
    var notes: String = "",
    var option: String = "",
    var optionAr: String = "",
    var price: Double = 0.0,
    var serving: String = "",
    var servingAr: String = "",
    var ing: MutableList<MenuIngredientsEntity>? = null,
    var total_price: Double = 0.0,
    var total_price_shared: Double = 0.0,


)
