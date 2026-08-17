package De;

import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1791e;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    b a(InterfaceC1787a interfaceC1787a, InterfaceC1787a interfaceC1787a2, InterfaceC1791e interfaceC1791e);

    a b();
}
