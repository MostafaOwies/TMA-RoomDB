package test.microsoft.com.tmaroomdb.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import test.microsoft.com.tmaroomdb.entities.menu.ItemsEntity
import test.microsoft.com.tmaroomdb.entities.order.OrdersEntity

data class OrderAndItem(
    @Embedded val order: OrdersEntity,
    @Relation(
        parentColumn ="orderId",
        entityColumn ="orderId"
    )
    val item: List<ItemsEntity>
)
