// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class TriggerContractByVoucherCall extends APICall.Builder<TriggerContractByVoucherCall> {
    private TriggerContractByVoucherCall() {
        super("triggerContractByVoucher");
    }

    public static TriggerContractByVoucherCall create() {
        return new TriggerContractByVoucherCall();
    }

    public TriggerContractByVoucherCall requireLastBlock(String requireLastBlock) {
        return param("requireLastBlock", requireLastBlock);
    }

    public TriggerContractByVoucherCall contractName(String contractName) {
        return param("contractName", contractName);
    }

    public TriggerContractByVoucherCall requireBlock(String requireBlock) {
        return param("requireBlock", requireBlock);
    }

    public TriggerContractByVoucherCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }

    public APICall.Builder voucher(byte[] b) {
        return parts("voucher", b);
    }
}
