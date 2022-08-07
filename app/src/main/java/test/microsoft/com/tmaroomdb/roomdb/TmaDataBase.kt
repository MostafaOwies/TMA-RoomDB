package test.microsoft.com.tmaroomdb.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import test.microsoft.com.tmaroomdb.MyDao
import test.microsoft.com.tmaroomdb.entities.menu.IngredientEntity
import test.microsoft.com.tmaroomdb.entities.menu.ItemsEntity
import test.microsoft.com.tmaroomdb.entities.order.OrdersEntity
import test.microsoft.com.tmaroomdb.entities.relations.itemingredientrelation.ItemIngredientCrossRef


@Database(entities = [
    ItemsEntity::class,
    OrdersEntity::class,
    IngredientEntity::class,
    ItemIngredientCrossRef::class
],
    version = 1
)
abstract class TmaDataBase :RoomDatabase(){
    abstract fun myDao():MyDao

    companion object{

        @Volatile
        private var INSTANCE:TmaDataBase?=null
        fun getInstance(context: Context):TmaDataBase{
            synchronized(this){
                var instance= INSTANCE
                if (instance==null){
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        TmaDataBase::class.java,
                        "Tma_DataBase"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE=instance
                }
                return instance
            }
        }
    }

}