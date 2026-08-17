package p088ef;

import Ad.q;

/* JADX INFO: renamed from: ef.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3322z {
    public static final InterfaceC3318x a(B0 b10) {
        return new C3320y(b10);
    }

    public static /* synthetic */ InterfaceC3318x b(B0 b10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b10 = null;
        }
        return a(b10);
    }

    public static final boolean c(InterfaceC3318x interfaceC3318x, Object obj) {
        Throwable thD = q.d(obj);
        return thD == null ? interfaceC3318x.G(obj) : interfaceC3318x.c(thD);
    }
}
