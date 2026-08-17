package p057d2;

import C9.AbstractC0876t;
import R1.r;
import U1.AbstractC1459a;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import p039c2.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f39692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0876t f39693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f39696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f39697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f39698h;

    public static class b extends j implements f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final k.a f39699i;

        public b(long j10, r rVar, List list, k.a aVar, List list2, List list3, List list4) {
            super(j10, rVar, list, aVar, list2, list3, list4, null);
            this.f39699i = aVar;
        }

        @Override // p039c2.f
        public long a(long j10, long j11) {
            return this.f39699i.h(j10, j11);
        }

        @Override // p039c2.f
        public long b(long j10, long j11) {
            return this.f39699i.d(j10, j11);
        }

        @Override // p039c2.f
        public long c(long j10) {
            return this.f39699i.j(j10);
        }

        @Override // p039c2.f
        public long d(long j10, long j11) {
            return this.f39699i.f(j10, j11);
        }

        @Override // p039c2.f
        public i e(long j10) {
            return this.f39699i.k(this, j10);
        }

        @Override // p039c2.f
        public long f(long j10, long j11) {
            return this.f39699i.i(j10, j11);
        }

        @Override // p039c2.f
        public long g(long j10) {
            return this.f39699i.g(j10);
        }

        @Override // p039c2.f
        public boolean h() {
            return this.f39699i.l();
        }

        @Override // p039c2.f
        public long i() {
            return this.f39699i.e();
        }

        @Override // p039c2.f
        public long j(long j10, long j11) {
            return this.f39699i.c(j10, j11);
        }

        @Override // p057d2.j
        public String k() {
            return null;
        }

        @Override // p057d2.j
        public f l() {
            return this;
        }

        @Override // p057d2.j
        public i m() {
            return null;
        }
    }

    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f39700i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f39701j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f39702k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final i f39703l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final m f39704m;

        public c(long j10, r rVar, List list, k.e eVar, List list2, List list3, List list4, String str, long j11) {
            super(j10, rVar, list, eVar, list2, list3, list4, null);
            this.f39700i = Uri.parse(((p057d2.b) list.get(0)).f39637a);
            i iVarC = eVar.c();
            this.f39703l = iVarC;
            this.f39702k = str;
            this.f39701j = j11;
            this.f39704m = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // p057d2.j
        public String k() {
            return this.f39702k;
        }

        @Override // p057d2.j
        public f l() {
            return this.f39704m;
        }

        @Override // p057d2.j
        public i m() {
            return this.f39703l;
        }
    }

    private j(long j10, r rVar, List list, k kVar, List list2, List list3, List list4) {
        AbstractC1459a.a(!list.isEmpty());
        this.f39691a = j10;
        this.f39692b = rVar;
        this.f39693c = AbstractC0876t.p(list);
        this.f39695e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f39696f = list3;
        this.f39697g = list4;
        this.f39698h = kVar.a(this);
        this.f39694d = kVar.b();
    }

    /* synthetic */ j(long j10, r rVar, List list, k kVar, List list2, List list3, List list4, a aVar) {
        this(j10, rVar, list, kVar, list2, list3, list4);
    }

    public static j o(long j10, r rVar, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, rVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, rVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract f l();

    public abstract i m();

    public i n() {
        return this.f39698h;
    }
}
