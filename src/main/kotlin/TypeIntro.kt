
const val MAX_EXPERIENCE: Int = 5000
fun main() {

    /*
    kotlin kodu JVM in yürütütebilmesi için byte koduna dönüştürülür.
    * Yani bu şu demek oluyor; bizim windows bir makinede yazmış olduğumuz uygulama önce Compiler tarafından
    bytecode lara çevriliyor daha sonra bu bytecode lar diğer platformlarda kurulu olan JVM ler aracılığıyla tüm platformlarda çalışıyor.
    * kotlin compiler, byte code(.class),JVM,windows-mac or linux.
    *byte kodlarını JVM direk anlamaz bunlar makina koduna dönüştürülür
    */

    val playerName = "Estragon"
    var experiencePoints = 5
    println(experiencePoints)

    /*//int type, 5 instance oluyor yani atanan değer.
    //Kotlin static type kullanır.
    //control + shift ile değişkenin hangi türde olduğunu öğreniriz*/

    experiencePoints += 5
    println(experiencePoints)
    println(playerName)

    /*Bir derleme zamanı sabiti(compile time), main dahil herhangi bir fonksiyonun dışında tanımlanmalıdır, çünkü değeri derleme zamanında
    (yani, program derlendiğinde) atanmalıdır - bu nedenle adı. main ve diğer işlevleriniz çalışma sırasında (program yürütülürken) çağrılır ve içindeki değişkenlere değerleri atanır.
    Bu atamalardan herhangi biri gerçekleşmeden önce bir derleme zamanı sabiti vardır.*/

    //iki kere shift e bas arama ekranı çıkacak show kotlin byte code yaz, java yazımı gösterilecek

    /*//kotlinde sadece referans türler vardır. java da ise primitive ve referans türler vardır.
    // ama kotlin java byte koduna bakarsak ilkel kullanmış olacak daha iyi performans göstermek için.
    yani primitive türler daha performanslı, primitive performansında referans tiple çalışır kotlin.*/
}