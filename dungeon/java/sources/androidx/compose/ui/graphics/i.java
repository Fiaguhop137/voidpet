package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p037c0.A0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21529a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f21530b = A0.a(0.5f, 0.5f);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return i.f21530b;
        }
    }

    public static long b(long j10) {
        return j10;
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String g(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }
}
