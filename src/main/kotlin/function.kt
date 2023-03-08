fun main() {

    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false


    //Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)


    val healthStatus = formatHealthStatus(healthPoints, isBlessed)


    //Player Status
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    castFireball()
}



private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing qite quickly!"
        } else {
            "has some minor wounds"
        }

        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition!"
    }
    return healthStatus
}


private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {

    println("(Aura: $auraColor)" +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun castFireball(numFirebaslls: Int = 2){
    println("A glass of Fireball springs into existence.(x$numFirebaslls)")
}




/*
    //fonksiyon parametresi yeniden atamayı desteklemez yani var yerine val dır.

    //healthStatus değişken ataması return değeri parametre olarak verilmesi, tüm bunlar bu fonksiyonun içinde gerçekleşir.
    döndürdüğü değerler sonra son bulur.yani fonksiyon tamamlandıkdan sonra varlıkları sona erer.


    //oluşturulan fonksiyonun içindeki değğerlere parametre, çağrılan fonksiyonun alacağı değerlere argüman denir




    */


