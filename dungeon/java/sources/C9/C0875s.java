package C9;

import java.io.Serializable;

/* JADX INFO: renamed from: C9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0875s extends AbstractC0862e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f1612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f1613b;

    C0875s(Object obj, Object obj2) {
        this.f1612a = obj;
        this.f1613b = obj2;
    }

    @Override // C9.AbstractC0862e, java.util.Map.Entry
    public final Object getKey() {
        return this.f1612a;
    }

    @Override // C9.AbstractC0862e, java.util.Map.Entry
    public final Object getValue() {
        return this.f1613b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
