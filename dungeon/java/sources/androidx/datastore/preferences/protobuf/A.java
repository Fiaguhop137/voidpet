package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class A implements InterfaceC1969z {
    A() {
    }

    static AbstractC1964u.b d(Object obj, long j10) {
        return (AbstractC1964u.b) k0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1969z
    public void a(Object obj, long j10) {
        d(obj, j10).z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1969z
    public void b(Object obj, Object obj2, long j10) {
        AbstractC1964u.b bVarD = d(obj, j10);
        AbstractC1964u.b bVarD2 = d(obj2, j10);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.O()) {
                bVarD = bVarD.f(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        k0.O(obj, j10, bVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1969z
    public List c(Object obj, long j10) {
        AbstractC1964u.b bVarD = d(obj, j10);
        if (bVarD.O()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC1964u.b bVarF = bVarD.f(size == 0 ? 10 : size * 2);
        k0.O(obj, j10, bVarF);
        return bVarF;
    }
}
