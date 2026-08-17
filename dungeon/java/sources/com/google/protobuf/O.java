package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class O implements N {
    O() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        M m10 = (M) obj;
        L l10 = (L) obj2;
        int iA = 0;
        if (m10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : m10.entrySet()) {
            iA += l10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static M j(Object obj, Object obj2) {
        M mQ = (M) obj;
        M m10 = (M) obj2;
        if (!m10.isEmpty()) {
            if (!mQ.m()) {
                mQ = mQ.q();
            }
            mQ.p(m10);
        }
        return mQ;
    }

    @Override // com.google.protobuf.N
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.protobuf.N
    public L.a b(Object obj) {
        return ((L) obj).c();
    }

    @Override // com.google.protobuf.N
    public Map c(Object obj) {
        return (M) obj;
    }

    @Override // com.google.protobuf.N
    public Object d(Object obj) {
        return M.e().q();
    }

    @Override // com.google.protobuf.N
    public Map e(Object obj) {
        return (M) obj;
    }

    @Override // com.google.protobuf.N
    public Object f(Object obj) {
        ((M) obj).n();
        return obj;
    }

    @Override // com.google.protobuf.N
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.protobuf.N
    public boolean h(Object obj) {
        return !((M) obj).m();
    }
}
