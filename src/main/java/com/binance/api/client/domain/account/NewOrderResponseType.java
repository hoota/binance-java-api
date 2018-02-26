package com.binance.api.client.domain.account;

/**
 * Order result type for newOrder api call
 * see https://github.com/binance-exchange/binance-official-api-docs/blob/master/rest-api.md#new-order--trade
 */
public enum NewOrderResponseType {
    ACK, RESULT, FULL;
}
