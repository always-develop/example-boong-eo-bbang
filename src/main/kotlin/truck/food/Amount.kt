package truck.food

class Amount(
    private var amount: Int
) {
    operator fun plus(target: Amount): Amount {
        return Amount(this.amount + target.amount)
    }
}