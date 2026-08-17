package Pd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f8892a;

    public b(Object obj) {
        this.f8892a = obj;
    }

    @Override // Pd.d, Pd.c
    public Object a(Object obj, k property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f8892a;
    }

    @Override // Pd.d
    public void b(Object obj, k property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.f8892a;
        if (d(property, obj3, obj2)) {
            this.f8892a = obj2;
            c(property, obj3, obj2);
        }
    }

    protected void c(k property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean d(k property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f8892a + ')';
    }
}
