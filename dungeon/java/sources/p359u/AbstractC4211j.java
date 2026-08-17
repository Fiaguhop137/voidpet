package p359u;

/* JADX INFO: renamed from: u.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4211j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC4218q b(X x10, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AbstractC4218q) x10.a().invoke(obj);
    }

    public static final W c(int i10, int i11, InterfaceC4223w interfaceC4223w) {
        return new W(i10, i11, interfaceC4223w);
    }

    public static /* synthetic */ W d(int i10, int i11, InterfaceC4223w interfaceC4223w, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC4223w = AbstractC4225y.c();
        }
        return c(i10, i11, interfaceC4223w);
    }
}
