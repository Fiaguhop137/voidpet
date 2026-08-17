package p067dc;

import Rb.e;
import Yb.g;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f39931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f39932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f39933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f39934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f39935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f39936f;

    public h(Function0 legacyConstantsProvider, Map syncFunctions, Map asyncFunctions, g gVar, Map properties, Map constants) {
        Intrinsics.checkNotNullParameter(legacyConstantsProvider, "legacyConstantsProvider");
        Intrinsics.checkNotNullParameter(syncFunctions, "syncFunctions");
        Intrinsics.checkNotNullParameter(asyncFunctions, "asyncFunctions");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(constants, "constants");
        this.f39931a = legacyConstantsProvider;
        this.f39932b = syncFunctions;
        this.f39933c = asyncFunctions;
        this.f39934d = gVar;
        this.f39935e = properties;
        this.f39936f = constants;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(h hVar, h hVar2) {
        return N.o((Map) hVar.f39931a.invoke(), (Map) hVar2.f39931a.invoke());
    }

    public final Map b() {
        return this.f39933c;
    }

    public final Map c() {
        return this.f39936f;
    }

    public final g d() {
        return this.f39934d;
    }

    public final e e() {
        return new e(this.f39932b.values().iterator(), this.f39933c.values().iterator());
    }

    public final Function0 f() {
        return this.f39931a;
    }

    public final Map g() {
        return this.f39935e;
    }

    public final Map h() {
        return this.f39932b;
    }

    public final h i(h hVar) {
        if (hVar == null) {
            return this;
        }
        g gVar = new g(this, hVar);
        Map mapO = N.o(this.f39932b, hVar.f39932b);
        Map mapO2 = N.o(this.f39933c, hVar.f39933c);
        g gVar2 = this.f39934d;
        return new h(gVar, mapO, mapO2, gVar2 != null ? gVar2.b(hVar.f39934d) : null, N.o(this.f39935e, hVar.f39935e), N.o(this.f39936f, hVar.f39936f));
    }
}
