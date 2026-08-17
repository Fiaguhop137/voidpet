package Ad;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f343b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f344a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ y(int i10) {
        this.f344a = i10;
    }

    public static final /* synthetic */ y e(int i10) {
        return new y(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof y) && i10 == ((y) obj).p();
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static String o(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return E.a(p(), ((y) obj).p());
    }

    public boolean equals(Object obj) {
        return h(this.f344a, obj);
    }

    public int hashCode() {
        return i(this.f344a);
    }

    public final /* synthetic */ int p() {
        return this.f344a;
    }

    public String toString() {
        return o(this.f344a);
    }
}
