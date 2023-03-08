fun main() {

    val name = "Madrigal"
    var healthPoints = 85
    val isBlessed = true
    val isImmortal = false


    //Aura
    val auraVisible= isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    /*if (auraVisible){
        println("GREEN")
    }else{
        println("NONE")
    }*/

    /*
    val healthStatus = if (healthPoints == 100) "is in excellent condition!"
        else if (healthPoints >= 90)"has a few scratches."
        else if (healthPoints >= 75)
            if (isBlessed) "has some minor wounds but is healing qite quickly!"
            else "has some minor wounds."
    else if (healthPoints >= 15)"looks pretty hurt"
    else " is in awful condition!"

     */

    /*val healthStatus = if (healthPoints == 100){
        "is in excellent condition"
    }else if (healthPoints in 90..99){
        "has a few scratches."
    }else if (healthPoints in 75..89){
        if (isBlessed){
            "has some minor wounds but is healing quite quickly"
        }else{
            "has some minor wounds"
        }
    }else if (healthPoints in 15..74){
        "looks pretty hurt"
    }else{
        "is in awful condition!"
    }*/


    val healthStatus = when(healthPoints){
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed){
            "has some minor wounds but is healing qite quickly!"
        }else{
            "has some minor wounds"
        }
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition!"
    }


    //Player Status
    println("(Aura: $auraColor)" +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")



}


