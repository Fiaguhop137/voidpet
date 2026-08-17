package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j0 f37962c = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f37964b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f37963a = new K();

    private j0() {
    }

    public static j0 a() {
        return f37962c;
    }

    public n0 b(Class cls, n0 n0Var) {
        A.b(cls, "messageType");
        A.b(n0Var, "schema");
        return (n0) this.f37964b.putIfAbsent(cls, n0Var);
    }

    public n0 c(Class cls) {
        n0 n0VarB;
        A.b(cls, "messageType");
        n0 n0VarA = (n0) this.f37964b.get(cls);
        return (n0VarA != null || (n0VarB = b(cls, (n0VarA = this.f37963a.a(cls)))) == null) ? n0VarA : n0VarB;
    }

    public n0 d(Object obj) {
        return c(obj.getClass());
    }
}
