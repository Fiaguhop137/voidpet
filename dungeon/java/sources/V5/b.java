package V5;

import Ad.j;
import V4.k;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14066c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f14067d = j.b(new V5.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14069b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pattern d() {
            Object value = b.f14067d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(int i10) {
            return i10 == Integer.MAX_VALUE ? "" : String.valueOf(i10);
        }

        public final b b(int i10) {
            k.b(Boolean.valueOf(i10 >= 0));
            return new b(i10, Integer.MAX_VALUE);
        }

        public final b c(String str) {
            if (str == null) {
                return null;
            }
            try {
                String[] strArrSplit = d().split(str);
                k.b(Boolean.valueOf(strArrSplit.length == 4));
                k.b(Boolean.valueOf(Intrinsics.b(strArrSplit[0], "bytes")));
                String str2 = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                int i10 = Integer.parseInt(str2);
                String str3 = strArrSplit[2];
                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                int i11 = Integer.parseInt(str3);
                String str4 = strArrSplit[3];
                Intrinsics.checkNotNullExpressionValue(str4, "get(...)");
                int i12 = Integer.parseInt(str4);
                k.b(Boolean.valueOf(i11 > i10));
                k.b(Boolean.valueOf(i12 > i11));
                return i11 < i12 - 1 ? new b(i10, i11) : new b(i10, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e10) {
                J j10 = J.f48342a;
                String str5 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                throw new IllegalArgumentException(str5, e10);
            }
        }

        public final b e(int i10) {
            k.b(Boolean.valueOf(i10 > 0));
            return new b(0, i10);
        }
    }

    public b(int i10, int i11) {
        this.f14068a = i10;
        this.f14069b = i11;
    }

    public static final b d(int i10) {
        return f14066c.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern e() {
        return Pattern.compile("[-/ ]");
    }

    public static final b g(int i10) {
        return f14066c.e(i10);
    }

    public final boolean c(b bVar) {
        return bVar != null && this.f14068a <= bVar.f14068a && bVar.f14069b <= this.f14069b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        b bVar = (b) obj;
        return this.f14068a == bVar.f14068a && this.f14069b == bVar.f14069b;
    }

    public final String f() {
        J j10 = J.f48342a;
        a aVar = f14066c;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f14068a), aVar.f(this.f14069b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public int hashCode() {
        return (this.f14068a * 31) + this.f14069b;
    }

    public String toString() {
        J j10 = J.f48342a;
        a aVar = f14066c;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{aVar.f(this.f14068a), aVar.f(this.f14069b)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
