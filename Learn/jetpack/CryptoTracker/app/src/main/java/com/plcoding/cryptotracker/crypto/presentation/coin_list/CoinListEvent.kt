package com.plcoding.cryptotracker.crypto.presentation.coin_list

import android.net.Network
import com.plcoding.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}