// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class FullResetCall extends APICall.Builder<FullResetCall> {
    private FullResetCall() {
        super("fullReset");
    }

    public static FullResetCall create() {
        return new FullResetCall();
    }

    public FullResetCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }
}
