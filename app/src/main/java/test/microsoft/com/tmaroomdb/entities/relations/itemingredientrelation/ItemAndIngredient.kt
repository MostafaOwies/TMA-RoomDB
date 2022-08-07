package test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import test.microsoft.com.tmaroomdb.entities.menu.IngredientEntity
import test.microsoft.com.tmaroomdb.entities.menu.ItemsEntity

data class ItemAndIngredient(
    @Embedded val item:ItemsEntity,
    @Relation(
        parentColumn = "menuItemId",
        entityColumn = "IngredientId",
        associateBy = Junction(ItemIngredientCrossRef::class)
    )
    val ingredients:List<IngredientEntity>
)