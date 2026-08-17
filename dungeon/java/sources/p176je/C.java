package p176je;

import Ad.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47209d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C f47210e = new C(O.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f47211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f47212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f47213c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f47210e;
        }
    }

    public C(O reportLevelBefore, h hVar, O reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f47211a = reportLevelBefore;
        this.f47212b = hVar;
        this.f47213c = reportLevelAfter;
    }

    public /* synthetic */ C(O o10, h hVar, O o11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? new h(1, 0) : hVar, (i10 & 4) != 0 ? o10 : o11);
    }

    public final O b() {
        return this.f47213c;
    }

    public final O c() {
        return this.f47211a;
    }

    public final h d() {
        return this.f47212b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f47211a == c10.f47211a && Intrinsics.b(this.f47212b, c10.f47212b) && this.f47213c == c10.f47213c;
    }

    public int hashCode() {
        int iHashCode = this.f47211a.hashCode() * 31;
        h hVar = this.f47212b;
        return ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.f47213c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f47211a + ", sinceVersion=" + this.f47212b + ", reportLevelAfter=" + this.f47213c + ')';
    }
}
