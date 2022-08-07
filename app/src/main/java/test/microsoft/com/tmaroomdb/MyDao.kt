package test.microsoft.com.tmaroomdb

import androidx.room.*
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
    suspend fun insertOrder(order : OrdersEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item : ItemsEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIngredient(ingredient : IngredientEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrderIngredientCrossRef(crossRef : ItemIngredientCrossRef)

    @Transaction
    @Query("SELECT*FROM ordersentity WHERE orderId=:orderId")
    suspend fun getOrderWithItem(orderId : String):List<OrderAndItem>

    @Transaction
    @Query("SELECT*FROM ingrediententity WHERE ingredientId=:ingredientId")
    suspend fun getItemsOfIngredient(ingredientId : String):List<IngredientAndItem>


    @Transaction
    @Query("SELECT*FROM itemsentity WHERE menuItemId=:menuItemId")
    suspend fun getIngredientsOfItem(menuItemId : String):List<ItemAndIngredient>


}