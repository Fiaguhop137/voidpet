package Ad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f304b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f305a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ B(short s10) {
        this.f305a = s10;
    }

    public static final /* synthetic */ B e(short s10) {
        return new B(s10);
    }

    public static short g(short s10) {
        return s10;
    }

    public static boolean h(short s10, Object obj) {
        return (obj instanceof B) && s10 == ((B) obj).p();
    }

    public static int i(short s10) {
        return Short.hashCode(s10);
    }

    public static String o(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.e(p() & 65535, ((B) obj).p() & 65535);
    }

    public boolean equals(Object obj) {
        return h(this.f305a, obj);
    }

    public int hashCode() {
        return i(this.f305a);
    }

    public final /* synthetic */ short p() {
        return this.f305a;
    }

    public String toString() {
        return o(this.f305a);
    }
}
