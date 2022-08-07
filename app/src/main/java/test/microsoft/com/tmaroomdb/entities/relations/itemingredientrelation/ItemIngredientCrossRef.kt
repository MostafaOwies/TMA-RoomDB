package test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation

import androidx.room.Entity


@Entity(primaryKeys = ["menuItemId","IngredientId"])
data class ItemIngredientCrossRef (
        var menuItemId: String = "",
        var IngredientId: String = ""
)