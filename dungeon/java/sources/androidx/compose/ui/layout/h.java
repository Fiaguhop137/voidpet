package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Object a(p288q0.w wVar) {
        Object objA = wVar.a();
        p288q0.p pVar = objA instanceof p288q0.p ? (p288q0.p) objA : null;
        if (pVar != null) {
            return pVar.F0();
        }
        return null;
    }

    public static final V.k b(V.k kVar, Object obj) {
        return kVar.then(new LayoutIdElement(obj));
    }
}
