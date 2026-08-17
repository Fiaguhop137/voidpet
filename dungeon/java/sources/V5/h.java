package V5;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14106c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f14107d = new h(-1, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f14108e = new h(-2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f14109f = new h(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14111b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f14107d;
        }

        public final h b() {
            return h.f14108e;
        }
    }

    private h(int i10, boolean z10) {
        this.f14110a = i10;
        this.f14111b = z10;
    }

    public static final h c() {
        return f14106c.a();
    }

    public static final h e() {
        return f14106c.b();
    }

    public final boolean d() {
        return this.f14111b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f14110a == hVar.f14110a && this.f14111b == hVar.f14111b;
    }

    public final int f() {
        if (h()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f14110a;
    }

    public final boolean g() {
        return this.f14110a != -2;
    }

    public final boolean h() {
        return this.f14110a == -1;
    }

    public int hashCode() {
        return p060d5.b.b(Integer.valueOf(this.f14110a), Boolean.valueOf(this.f14111b));
    }

    public String toString() {
        J j10 = J.f48342a;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f14110a), Boolean.valueOf(this.f14111b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
