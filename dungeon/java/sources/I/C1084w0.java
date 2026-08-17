package I;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1084w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q f4887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D1 f4888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1021b f4889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f4890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final S0 f4891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f4892g;

    public C1084w0(AbstractC1078u0 abstractC1078u0, Object obj, Q q10, D1 d10, C1021b c1021b, List list, S0 s10, List list2) {
        this.f4886a = obj;
        this.f4887b = q10;
        this.f4888c = d10;
        this.f4889d = c1021b;
        this.f4890e = list;
        this.f4891f = s10;
        this.f4892g = list2;
    }

    public final C1021b a() {
        return this.f4889d;
    }

    public final Q b() {
        return this.f4887b;
    }

    public final AbstractC1078u0 c() {
        return null;
    }

    public final List d() {
        return this.f4890e;
    }

    public final S0 e() {
        return this.f4891f;
    }

    public final Object f() {
        return this.f4886a;
    }

    public final D1 g() {
        return this.f4888c;
    }

    public final void h() {
        List list = this.f4890e;
        Q q10 = this.f4887b;
        Intrinsics.d(q10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        this.f4890e = CollectionsKt.C0(list, ((B) q10).L(this.f4889d));
    }
}
