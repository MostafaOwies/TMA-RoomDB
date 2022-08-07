package test.microsoft.com.tmaroomdb.entities.menu

import androidx.room.Entity

@Entity
data class MenuIngredientsEntity(

    var id: String = "",
    var description: String = "",
    var descriptionAr: String = "",
    var logo: String = "",
    var name: String = "",
    var nameAr: String = "",
    var availability: Boolean = false,
    var price: Double = 0.0,

    var isSelected: Boolean = false

)
