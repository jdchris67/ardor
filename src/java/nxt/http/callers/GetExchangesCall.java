// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class GetExchangesCall extends APICall.Builder<GetExchangesCall> {
    private GetExchangesCall() {
        super("getExchanges");
    }

    public static GetExchangesCall create(int chain) {
        GetExchangesCall instance = new GetExchangesCall();
        instance.param("chain", chain);
        return instance;
    }

    public GetExchangesCall requireLastBlock(String requireLastBlock) {
        return param("requireLastBlock", requireLastBlock);
    }

    public GetExchangesCall chain(String chain) {
        return param("chain", chain);
    }

    public GetExchangesCall chain(int chain) {
        return param("chain", chain);
    }

    public GetExchangesCall firstIndex(int firstIndex) {
        return param("firstIndex", firstIndex);
    }

    public GetExchangesCall currency(String currency) {
        return param("currency", currency);
    }

    public GetExchangesCall currency(long currency) {
        return unsignedLongParam("currency", currency);
    }

    public GetExchangesCall lastIndex(int lastIndex) {
        return param("lastIndex", lastIndex);
    }

    public GetExchangesCall includeCurrencyInfo(boolean includeCurrencyInfo) {
        return param("includeCurrencyInfo", includeCurrencyInfo);
    }

    public GetExchangesCall account(String account) {
        return param("account", account);
    }

    public GetExchangesCall account(long account) {
        return unsignedLongParam("account", account);
    }

    public GetExchangesCall requireBlock(String requireBlock) {
        return param("requireBlock", requireBlock);
    }

    public GetExchangesCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }

    public GetExchangesCall timestamp(int timestamp) {
        return param("timestamp", timestamp);
    }
}
