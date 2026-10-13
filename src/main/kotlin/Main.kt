fun main() {
    // ЗАДАНИЕ 1: Денежные переводы

    println("Задание 1")
    print("Введите сумму перевода в рублях: ")
    val amount = readln().toDouble() // val, так как исходная сумма не меняется

    val minCommission = 35.0
    val commissionRate = 0.0075

    val calculatedCommission = amount * commissionRate

    val finalCommission = if (calculatedCommission >= minCommission) {
        calculatedCommission
    } else {
        minCommission
    }

    val finalAmount = amount - finalCommission

    println("Сумма перевода с учетом комиссии: $finalAmount₽. Комиссия: $finalCommission₽")

    // ЗАДАНИЕ 2: Люди / Человеки

    println()
    println("Задание 2")
    print("Введите количество отметок 'Понравилось': ")
    val likes = readln().toInt()

    val lastDigit = likes % 10
    val lastTwoDigits = likes % 100

    val ending = when {
        lastTwoDigits in 11..14 -> "людям"
        lastDigit == 1 -> "человеку"
        else -> "людям"
    }

    println("Понравилось $likes $ending")

    // ЗАДАНИЕ 3: Меломан

    println()
    println("Задание 3")
    print("Какую сумму потратил пользователь?: ")
    val summa = readln().toDouble()

    var isRegularCustomer = false
    while (true) {
        print("Вы являетесь постоянным покупателем (Да/Нет)?: ")
        val input = readln().trim().lowercase()

        if (input == "да") {
            isRegularCustomer = true
            break
        } else if (input == "нет") {
            isRegularCustomer = false
            break
        } else {
            println("Неверный формат ввода, пожалуйста, повторите.")
        }
    }


    val thresholdMid = 10_000.0
    val thresholdHigh = 10_001.0
    val flatDiscount = 100.0
    val percentDiscount = 0.05
    val regularBonus = 0.01

    var finalSum = summa

    if (summa in 1_001.0..thresholdMid) {
        finalSum -= flatDiscount
    } else if (summa >= thresholdHigh) {
        finalSum -= finalSum * percentDiscount // Применяем 5%

        if (isRegularCustomer) {
            finalSum -= finalSum * regularBonus
        }
    }

    println("Сумма покупки с учетом скидок: $finalSum₽")
}