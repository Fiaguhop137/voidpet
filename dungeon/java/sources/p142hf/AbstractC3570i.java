package p142hf;

import p124gf.a;
import p177jf.h;
import p177jf.m;

/* JADX INFO: renamed from: hf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3570i {
    public static final InterfaceC3564c a(InterfaceC3564c interfaceC3564c, int i10, a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        a aVar2 = aVar;
        return interfaceC3564c instanceof m ? m.a.a((m) interfaceC3564c, null, i11, aVar2, 1, null) : new h(interfaceC3564c, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC3564c b(InterfaceC3564c interfaceC3564c, int i10, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        return AbstractC3566e.c(interfaceC3564c, i10, aVar);
    }

    public static final InterfaceC3564c c(InterfaceC3564c interfaceC3564c) {
        return b(interfaceC3564c, -1, null, 2, null);
    }
}
