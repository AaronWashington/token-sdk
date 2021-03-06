package com.r3.corda.lib.tokens.money

import com.r3.corda.lib.tokens.contracts.types.TokenType
import java.util.*

/**
 * This class is used to return a [TokenType] with the required currency code and fraction digits for fiat currencies.
 */
class FiatCurrency {
    companion object {
        // Uses the java money registry.
        fun getInstance(currencyCode: String): TokenType {
            val currency = Currency.getInstance(currencyCode)
            return TokenType(currency.currencyCode, currency.defaultFractionDigits)
        }
    }
}
