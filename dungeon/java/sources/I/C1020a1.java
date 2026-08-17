package I;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: I.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1020a1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f4592i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f4593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S1 f4595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0 f4596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f4597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f4598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f4599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4600h = true;

    public C1020a1(D d10, Object obj, boolean z10, S1 s10, A0 a10, Function1 function1, boolean z11) {
        this.f4593a = d10;
        this.f4594b = z10;
        this.f4595c = s10;
        this.f4596d = a10;
        this.f4597e = function1;
        this.f4598f = z11;
        this.f4599g = obj;
    }

    public final boolean a() {
        return this.f4600h;
    }

    public final D b() {
        return this.f4593a;
    }

    public final Function1 c() {
        return this.f4597e;
    }

    public final Object d() {
        if (this.f4594b) {
            return null;
        }
        A0 a10 = this.f4596d;
        if (a10 != null) {
            return a10.getValue();
        }
        Object obj = this.f4599g;
        if (obj != null) {
            return obj;
        }
        AbstractC1083w.u("Unexpected form of a provided value");
        throw new Ad.g();
    }

    public final S1 e() {
        return this.f4595c;
    }

    public final A0 f() {
        return this.f4596d;
    }

    public final Object g() {
        return this.f4599g;
    }

    public final C1020a1 h() {
        this.f4600h = false;
        return this;
    }

    public final boolean i() {
        return this.f4598f;
    }

    public final boolean j() {
        return (this.f4594b || g() != null) && !this.f4598f;
    }
}
