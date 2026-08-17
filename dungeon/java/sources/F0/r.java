package F0;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2873b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f2874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r f2875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r f2876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final r f2877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final r f2878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final r f2879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final r f2880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final r f2881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final r f2882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final r f2883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final r f2884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final r f2885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final r f2886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final r f2887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final r f2888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final r f2889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final r f2890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final r f2891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List f2892u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2893a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a() {
            return r.f2885n;
        }

        public final r b() {
            return r.f2887p;
        }

        public final r c() {
            return r.f2886o;
        }

        public final r d() {
            return r.f2879h;
        }
    }

    static {
        r rVar = new r(100);
        f2874c = rVar;
        r rVar2 = new r(200);
        f2875d = rVar2;
        r rVar3 = new r(300);
        f2876e = rVar3;
        r rVar4 = new r(400);
        f2877f = rVar4;
        r rVar5 = new r(500);
        f2878g = rVar5;
        r rVar6 = new r(600);
        f2879h = rVar6;
        r rVar7 = new r(700);
        f2880i = rVar7;
        r rVar8 = new r(800);
        f2881j = rVar8;
        r rVar9 = new r(900);
        f2882k = rVar9;
        f2883l = rVar;
        f2884m = rVar2;
        f2885n = rVar3;
        f2886o = rVar4;
        f2887p = rVar5;
        f2888q = rVar6;
        f2889r = rVar7;
        f2890s = rVar8;
        f2891t = rVar9;
        f2892u = CollectionsKt.o(rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9);
    }

    public r(int i10) {
        this.f2893a = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        H0.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f2893a == ((r) obj).f2893a;
    }

    public int hashCode() {
        return this.f2893a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(r rVar) {
        return Intrinsics.e(this.f2893a, rVar.f2893a);
    }

    public final int p() {
        return this.f2893a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f2893a + ')';
    }
}
