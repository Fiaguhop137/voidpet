package p450z0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;

/* JADX INFO: renamed from: z0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4367f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f58246d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C4367f f58247e = new C4367f(0.0f, e.b(0.0f, 0.0f), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f58248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rd.a f58249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58250c;

    /* JADX INFO: renamed from: z0.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4367f a() {
            return C4367f.f58247e;
        }
    }

    public C4367f(float f10, Rd.a aVar, int i10) {
        this.f58248a = f10;
        this.f58249b = aVar;
        this.f58250c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public /* synthetic */ C4367f(float f10, Rd.a aVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, aVar, (i11 & 4) != 0 ? 0 : i10);
    }

    public final float b() {
        return this.f58248a;
    }

    public final Rd.a c() {
        return this.f58249b;
    }

    public final int d() {
        return this.f58250c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4367f)) {
            return false;
        }
        C4367f c4367f = (C4367f) obj;
        return this.f58248a == c4367f.f58248a && Intrinsics.b(this.f58249b, c4367f.f58249b) && this.f58250c == c4367f.f58250c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f58248a) * 31) + this.f58249b.hashCode()) * 31) + this.f58250c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f58248a + ", range=" + this.f58249b + ", steps=" + this.f58250c + ')';
    }
}
