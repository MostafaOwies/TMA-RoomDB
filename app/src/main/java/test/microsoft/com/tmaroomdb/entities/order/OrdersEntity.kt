package test.microsoft.com.tmaroomdb.entities.order

import androidx.room.Entity
import androidx.room.PrimaryKey
import test.microsoft.com.tmaroomdb.entities.menu.MenuIngredientsEntity

@Entity
data class OrdersEntity(
    @PrimaryKey(autoGenerate = false)
    var menuItemId: String = "", // Menu item ID


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
    var uid: String = "", // Order item ID

    val status: Map<String, String>? = null,

    var statusKey: String? = null,

    var statusColor: Int = 0,


// Extra required data
    var orderId: String = "",
    var orderNumber: Int = 0,
    var tableNumber: Int = 0,
    var phoneNumber: String = "",
    var ros: String = "",
    var isPaid: String = "",

//    var isSelected: Boolean = false, // Selected for sharing process
//    var showShareIcon: Boolean = false

    var splitOrder: Boolean = false // Used for show or hide checkbox (in split process)

)
