// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class GetAliasesCall extends APICall.Builder<GetAliasesCall> {
    private GetAliasesCall() {
        super("getAliases");
    }

    public static GetAliasesCall create(int chain) {
        GetAliasesCall instance = new GetAliasesCall();
        instance.param("chain", chain);
        return instance;
    }

    public GetAliasesCall requireLastBlock(String requireLastBlock) {
        return param("requireLastBlock", requireLastBlock);
    }

    public GetAliasesCall chain(String chain) {
        return param("chain", chain);
    }

    public GetAliasesCall chain(int chain) {
        return param("chain", chain);
    }

    public GetAliasesCall firstIndex(int firstIndex) {
        return param("firstIndex", firstIndex);
    }

    public GetAliasesCall lastIndex(int lastIndex) {
        return param("lastIndex", lastIndex);
    }

    public GetAliasesCall account(String account) {
        return param("account", account);
    }

    public GetAliasesCall account(long account) {
        return unsignedLongParam("account", account);
    }

    public GetAliasesCall requireBlock(String requireBlock) {
        return param("requireBlock", requireBlock);
    }

    public GetAliasesCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }

    public GetAliasesCall timestamp(int timestamp) {
        return param("timestamp", timestamp);
    }
}
