package V5;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14101e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14105d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(int i10, int i11, float f10, float f11) {
        this.f14102a = i10;
        this.f14103b = i11;
        this.f14104c = f10;
        this.f14105d = f11;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public /* synthetic */ g(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? 2048.0f : f10, (i12 & 8) != 0 ? 0.6666667f : f11);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f14102a == gVar.f14102a && this.f14103b == gVar.f14103b;
    }

    public int hashCode() {
        return p060d5.b.a(this.f14102a, this.f14103b);
    }

    public String toString() {
        J j10 = J.f48342a;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f14102a), Integer.valueOf(this.f14103b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
