package test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import test.microsoft.com.tmaroomdb.entities.menu.IngredientEntity
import test.microsoft.com.tmaroomdb.entities.menu.ItemsEntity

data class IngredientAndItem (
    @Embedded val ingredient: IngredientEntity,
    @Relation(
        parentColumn = "IngredientId",
        entityColumn = "menuItemId",
        associateBy = Junction(ItemIngredientCrossRef::class)
    )
    val items:List<ItemsEntity>
)