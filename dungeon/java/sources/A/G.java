package A;

import p288q0.InterfaceC4062i;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static final AbstractC0785u a(J j10) {
        if (j10 != null) {
            return j10.a();
        }
        return null;
    }

    public static final boolean b(J j10) {
        if (j10 != null) {
            return j10.b();
        }
        return true;
    }

    public static final J c(androidx.compose.ui.layout.p pVar) {
        Object objA = pVar.a();
        if (objA instanceof J) {
            return (J) objA;
        }
        return null;
    }

    public static final J d(InterfaceC4062i interfaceC4062i) {
        Object objA = interfaceC4062i.a();
        if (objA instanceof J) {
            return (J) objA;
        }
        return null;
    }

    public static final float e(J j10) {
        if (j10 != null) {
            return j10.d();
        }
        return 0.0f;
    }

    public static final boolean f(J j10) {
        AbstractC0785u abstractC0785uA = a(j10);
        if (abstractC0785uA != null) {
            return abstractC0785uA.c();
        }
        return false;
    }
}
