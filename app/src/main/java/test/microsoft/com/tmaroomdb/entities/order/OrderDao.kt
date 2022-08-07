package test.microsoft.com.tmaroomdb.entities.order

import androidx.room.*
import test.microsoft.com.tmaroomdb.entities.menu.ItemsEntity
import test.microsoft.com.tmaroomdb.entities.relations.OrderAndItem

@Dao
interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrder(order :OrdersEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(order :ItemsEntity)

    @Transaction
    @Query("SELECT*FROM ordersentity WHERE menuItemId=:menuItemId")
    suspend fun getOrderAndItem(menuItemId : String):List<OrderAndItem>

}