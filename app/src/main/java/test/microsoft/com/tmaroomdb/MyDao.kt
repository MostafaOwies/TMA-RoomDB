package test.microsoft.com.tmaroomdb

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import test.microsoft.com.tmaroomdb.entities.menu.IngredientEntity
import test.microsoft.com.tmaroomdb.entities.menu.ItemsEntity
import test.microsoft.com.tmaroomdb.entities.order.OrdersEntity
import test.microsoft.com.tmaroomdb.entities.relations.OrderAndItem
import test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation.IngredientAndItem
import test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation.ItemAndIngredient
import test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation.ItemIngredientCrossRef


@Dao
interface MyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertOrder(order : OrdersEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertItem(item : ItemsEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertIngredient(ingredient : IngredientEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertOrderIngredientCrossRef(crossRef : ItemIngredientCrossRef)

    @Transaction
    @Query("SELECT*FROM ordersentity WHERE orderId=:orderId")
     fun getOrderWithItem(orderId : String): List<OrderAndItem>

    @Transaction
    @Query("SELECT*FROM ingrediententity WHERE ingredientId=:ingredientId")
     fun getItemsOfIngredient(ingredientId : String): List<IngredientAndItem>


    @Transaction
    @Query("SELECT*FROM itemsentity WHERE menuItemId=:menuItemId")
     fun getIngredientsOfItem(menuItemId : String): List<ItemAndIngredient>


}