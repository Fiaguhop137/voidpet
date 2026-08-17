package Ad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f341b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f342a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ x(byte b10) {
        this.f342a = b10;
    }

    public static final /* synthetic */ x e(byte b10) {
        return new x(b10);
    }

    public static byte g(byte b10) {
        return b10;
    }

    public static boolean h(byte b10, Object obj) {
        return (obj instanceof x) && b10 == ((x) obj).p();
    }

    public static int i(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String o(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.e(p() & 255, ((x) obj).p() & 255);
    }

    public boolean equals(Object obj) {
        return h(this.f342a, obj);
    }

    public int hashCode() {
        return i(this.f342a);
    }

    public final /* synthetic */ byte p() {
        return this.f342a;
    }

    public String toString() {
        return o(this.f342a);
    }
}
