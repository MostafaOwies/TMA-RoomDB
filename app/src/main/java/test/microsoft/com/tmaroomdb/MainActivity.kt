package test.microsoft.com.tmaroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import test.microsoft.com.tmaroomdb.entities.menu.IngredientEntity
import test.microsoft.com.tmaroomdb.entities.menu.ItemsEntity
import test.microsoft.com.tmaroomdb.entities.order.OrdersEntity
import test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation.ItemIngredientCrossRef

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mDao =(application as TmaApp).myDb.myDao()

        val orders : List<OrdersEntity> = listOf(
            OrdersEntity("1","01",2),
            OrdersEntity("2","01",2),
            OrdersEntity("3","02",2),
            OrdersEntity("4","02",2)
        )
        val items : List<ItemsEntity> = listOf(
            ItemsEntity("01","burger"),
            ItemsEntity("02","pizza"),
        )

        val ingredients :List<IngredientEntity> = listOf(
            IngredientEntity("001","Tomato slices"),
            IngredientEntity("002","Cheese"),
            IngredientEntity("003","Beef patty"),
            IngredientEntity("004","Bun"),
            IngredientEntity("005","Ketchup"),
        )

        val itemIngredientRelations : List<ItemIngredientCrossRef> = listOf(
            ItemIngredientCrossRef("01","001"),
            ItemIngredientCrossRef("02","002"),
        )

            lifecycleScope.launch(Dispatchers.IO){
                orders.forEach{mDao.insertOrder(it)}
                items.forEach{mDao.insertItem(it)}
                ingredients.forEach{mDao.insertIngredient(it)}
                itemIngredientRelations.forEach{mDao.insertOrderIngredientCrossRef(it)}

                val orderWithItems = mDao.getOrderWithItem("1")
                orderWithItems.first()

                val itemsWithIngredients =mDao.getItemsOfIngredient("001")
                itemsWithIngredients.first()

                val ingredientsOfItem=mDao.getIngredientsOfItem("01")
                ingredientsOfItem.first()
            }
    }
}