// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class ShutdownCall extends APICall.Builder<ShutdownCall> {
    private ShutdownCall() {
        super("shutdown");
    }

    public static ShutdownCall create() {
        return new ShutdownCall();
    }

    public ShutdownCall scan(String scan) {
        return param("scan", scan);
    }

    public ShutdownCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }
}
