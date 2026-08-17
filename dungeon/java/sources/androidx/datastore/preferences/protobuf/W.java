package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final W f23398c = new W();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f23399d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f23401b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f23400a = new C();

    private W() {
    }

    public static W a() {
        return f23398c;
    }

    public a0 b(Class cls, a0 a0Var) {
        AbstractC1964u.b(cls, "messageType");
        AbstractC1964u.b(a0Var, "schema");
        return (a0) this.f23401b.putIfAbsent(cls, a0Var);
    }

    public a0 c(Class cls) {
        a0 a0VarB;
        AbstractC1964u.b(cls, "messageType");
        a0 a0VarA = (a0) this.f23401b.get(cls);
        return (a0VarA != null || (a0VarB = b(cls, (a0VarA = this.f23400a.a(cls)))) == null) ? a0VarA : a0VarB;
    }

    public a0 d(Object obj) {
        return c(obj.getClass());
    }
}
