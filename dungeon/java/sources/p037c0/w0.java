package p037c0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p019b0.e;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26744d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final w0 f26745e = new w0(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f26748c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w0 a() {
            return w0.f26745e;
        }
    }

    private w0(long j10, long j11, float f10) {
        this.f26746a = j10;
        this.f26747b = j11;
        this.f26748c = f10;
    }

    public /* synthetic */ w0(long j10, long j11, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC2073b0.c(4278190080L) : j10, (i10 & 2) != 0 ? e.f25805b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }

    public /* synthetic */ w0(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f26748c;
    }

    public final long c() {
        return this.f26746a;
    }

    public final long d() {
        return this.f26747b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Z.m(this.f26746a, w0Var.f26746a) && e.j(this.f26747b, w0Var.f26747b) && this.f26748c == w0Var.f26748c;
    }

    public int hashCode() {
        return (((Z.s(this.f26746a) * 31) + e.o(this.f26747b)) * 31) + Float.hashCode(this.f26748c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Z.t(this.f26746a)) + ", offset=" + ((Object) e.s(this.f26747b)) + ", blurRadius=" + this.f26748c + ')';
    }
}
