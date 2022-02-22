package by.godevelopment.currencyappsample.domain.models

data class ItemSettingsModel(
    val curId: Int,
    val orderPosition: Int,
    val abbreviation: String,
    val scale: Int,
    val curName: String,
    val isVisible: Boolean
)