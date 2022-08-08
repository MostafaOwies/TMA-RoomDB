package test.microsoft.com.tmaroomdb.entities.menu

import android.content.ClipData
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class IngredientEntity(
    @PrimaryKey(autoGenerate = false)
    var IngredientId: String = "",
    var description: String = "",
    var descriptionAr: String = "",
    var logo: String = "",
    var name: String = "",
    var nameAr: String = ""

)
