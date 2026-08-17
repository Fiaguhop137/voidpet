package Jf;

import If.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q f5827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f5832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f5833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f5834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f5835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f5836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Long f5837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Long f5838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Long f5839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f5840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Integer f5841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Integer f5842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f5843q;

    public i(Q canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f5827a = canonicalPath;
        this.f5828b = z10;
        this.f5829c = comment;
        this.f5830d = j10;
        this.f5831e = j11;
        this.f5832f = j12;
        this.f5833g = i10;
        this.f5834h = j13;
        this.f5835i = i11;
        this.f5836j = i12;
        this.f5837k = l10;
        this.f5838l = l11;
        this.f5839m = l12;
        this.f5840n = num;
        this.f5841o = num2;
        this.f5842p = num3;
        this.f5843q = new ArrayList();
    }

    public /* synthetic */ i(Q q10, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(q10, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) == 0 ? j13 : -1L, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) == 0 ? i12 : -1, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, (i13 & 8192) != 0 ? null : num, (i13 & 16384) != 0 ? null : num2, (i13 & 32768) != 0 ? null : num3);
    }

    public final i a(Integer num, Integer num2, Integer num3) {
        return new i(this.f5827a, this.f5828b, this.f5829c, this.f5830d, this.f5831e, this.f5832f, this.f5833g, this.f5834h, this.f5835i, this.f5836j, this.f5837k, this.f5838l, this.f5839m, num, num2, num3);
    }

    public final Q b() {
        return this.f5827a;
    }

    public final List c() {
        return this.f5843q;
    }

    public final long d() {
        return this.f5831e;
    }

    public final int e() {
        return this.f5833g;
    }

    public final Long f() {
        Long l10 = this.f5839m;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f5842p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f5838l;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f5841o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f5837k;
        if (l10 != null) {
            return Long.valueOf(j.d(l10.longValue()));
        }
        Integer num = this.f5840n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f5836j;
        if (i10 != -1) {
            return j.c(this.f5835i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f5834h;
    }

    public final long j() {
        return this.f5832f;
    }

    public final boolean k() {
        return this.f5828b;
    }
}
