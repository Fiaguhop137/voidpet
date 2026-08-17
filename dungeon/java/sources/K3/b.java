package K3;

import kotlin.jvm.internal.Intrinsics;
import p088ef.B0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B0 f5907a;

    private /* synthetic */ b(B0 b10) {
        this.f5907a = b10;
    }

    public static final /* synthetic */ b e(B0 b10) {
        return new b(b10);
    }

    public static B0 f(B0 b10) {
        return b10;
    }

    public static boolean g(B0 b10, Object obj) {
        return (obj instanceof b) && Intrinsics.b(b10, ((b) obj).j());
    }

    public static int h(B0 b10) {
        return b10.hashCode();
    }

    public static String i(B0 b10) {
        return "BaseRequestDelegate(job=" + b10 + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f5907a, obj);
    }

    public int hashCode() {
        return h(this.f5907a);
    }

    public final /* synthetic */ B0 j() {
        return this.f5907a;
    }

    public String toString() {
        return i(this.f5907a);
    }
}
