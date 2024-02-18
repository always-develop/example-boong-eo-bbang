package truck.food

class Amount(
    private var amount: Int
) {
    private companion object {
        const val ZERO: Int = 0
    }

    operator fun plus(target: Amount): Amount {
        return Amount(this.amount + target.amount)
    }

    operator fun minus(target: Amount): Amount {
        val result = this.amount - target.amount

        if (result < ZERO) {
            throw IllegalArgumentException("target is over then this object. minus result is must be more 0.")
        }

        return Amount(result)
    }

    operator fun times(target: Amount): Amount {
        val result = this.amount * target.amount

        if (result < ZERO) {
            throw IllegalArgumentException("target is over then this object. multiply result is must be more 0.")
        }

        return Amount(result)
    }

    operator fun div(target: Amount): Amount {
        val result = this.amount / target.amount

        if (result < ZERO) {
            throw IllegalArgumentException("target is over then this object. divide result is must be more 0.")
        }

        return Amount(result)
    }
}