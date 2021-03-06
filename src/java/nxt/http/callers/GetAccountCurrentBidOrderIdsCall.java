// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class GetAccountCurrentBidOrderIdsCall extends APICall.Builder<GetAccountCurrentBidOrderIdsCall> {
    private GetAccountCurrentBidOrderIdsCall() {
        super("getAccountCurrentBidOrderIds");
    }

    public static GetAccountCurrentBidOrderIdsCall create(int chain) {
        GetAccountCurrentBidOrderIdsCall instance = new GetAccountCurrentBidOrderIdsCall();
        instance.param("chain", chain);
        return instance;
    }

    public GetAccountCurrentBidOrderIdsCall requireLastBlock(String requireLastBlock) {
        return param("requireLastBlock", requireLastBlock);
    }

    public GetAccountCurrentBidOrderIdsCall chain(String chain) {
        return param("chain", chain);
    }

    public GetAccountCurrentBidOrderIdsCall chain(int chain) {
        return param("chain", chain);
    }

    public GetAccountCurrentBidOrderIdsCall firstIndex(int firstIndex) {
        return param("firstIndex", firstIndex);
    }

    public GetAccountCurrentBidOrderIdsCall lastIndex(int lastIndex) {
        return param("lastIndex", lastIndex);
    }

    public GetAccountCurrentBidOrderIdsCall asset(String asset) {
        return param("asset", asset);
    }

    public GetAccountCurrentBidOrderIdsCall asset(long asset) {
        return unsignedLongParam("asset", asset);
    }

    public GetAccountCurrentBidOrderIdsCall account(String account) {
        return param("account", account);
    }

    public GetAccountCurrentBidOrderIdsCall account(long account) {
        return unsignedLongParam("account", account);
    }

    public GetAccountCurrentBidOrderIdsCall requireBlock(String requireBlock) {
        return param("requireBlock", requireBlock);
    }

    public GetAccountCurrentBidOrderIdsCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }
}
