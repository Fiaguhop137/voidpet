package R1;

import C9.AbstractC0876t;
import C9.AbstractC0877u;
import U1.AbstractC1459a;
import U1.S;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f10337i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f10338j = S.z0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10339k = S.z0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f10340l = S.z0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f10341m = S.z0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f10342n = S.z0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f10343o = S.z0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f10345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f10346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f10347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f10348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f10349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f10350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f10351h;

    public static final class b {
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f10353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f10355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f10356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f10357f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f10358g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AbstractC0876t f10359h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f10360i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f10361j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private w f10362k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f10363l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i f10364m;

        public c() {
            this.f10355d = new d.a();
            this.f10356e = new f.a((a) null);
            this.f10357f = Collections.EMPTY_LIST;
            this.f10359h = AbstractC0876t.w();
            this.f10363l = new g.a();
            this.f10364m = i.f10449d;
            this.f10361j = -9223372036854775807L;
        }

        private c(u uVar) {
            this();
            this.f10355d = uVar.f10349f.a();
            this.f10352a = uVar.f10344a;
            this.f10362k = uVar.f10348e;
            this.f10363l = uVar.f10347d.a();
            this.f10364m = uVar.f10351h;
            h hVar = uVar.f10345b;
            if (hVar != null) {
                this.f10358g = hVar.f10444e;
                this.f10354c = hVar.f10441b;
                this.f10353b = hVar.f10440a;
                this.f10357f = hVar.f10443d;
                this.f10359h = hVar.f10445f;
                this.f10360i = hVar.f10447h;
                f fVar = hVar.f10442c;
                this.f10356e = fVar != null ? fVar.b() : new f.a((a) null);
                this.f10361j = hVar.f10448i;
            }
        }

        /* synthetic */ c(u uVar, a aVar) {
            this(uVar);
        }

        public u a() {
            h hVar;
            AbstractC1459a.g(this.f10356e.f10409b == null || this.f10356e.f10408a != null);
            Uri uri = this.f10353b;
            if (uri != null) {
                hVar = new h(uri, this.f10354c, this.f10356e.f10408a != null ? this.f10356e.i() : null, null, this.f10357f, this.f10358g, this.f10359h, this.f10360i, this.f10361j, null);
            } else {
                hVar = null;
            }
            String str = this.f10352a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarH = this.f10355d.h();
            g gVarF = this.f10363l.f();
            w wVar = this.f10362k;
            if (wVar == null) {
                wVar = w.f10482I;
            }
            return new u(str2, eVarH, hVar, gVarF, wVar, this.f10364m, null);
        }

        public c b(g gVar) {
            this.f10363l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f10352a = (String) AbstractC1459a.e(str);
            return this;
        }

        public c d(List list) {
            this.f10359h = AbstractC0876t.p(list);
            return this;
        }

        public c e(Object obj) {
            this.f10360i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f10353b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f10365i = new a().g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f10366j = S.z0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f10367k = S.z0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f10368l = S.z0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f10369m = S.z0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f10370n = S.z0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f10371o = S.z0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f10372p = S.z0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f10373q = S.z0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f10378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f10379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f10380g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f10381h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f10382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f10383b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f10384c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f10385d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f10386e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f10387f;

            public a() {
                this.f10383b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f10382a = dVar.f10375b;
                this.f10383b = dVar.f10377d;
                this.f10384c = dVar.f10378e;
                this.f10385d = dVar.f10379f;
                this.f10386e = dVar.f10380g;
                this.f10387f = dVar.f10381h;
            }

            /* synthetic */ a(d dVar, a aVar) {
                this(dVar);
            }

            public d g() {
                return new d(this, null);
            }

            public e h() {
                return new e(this, null);
            }
        }

        private d(a aVar) {
            this.f10374a = S.o1(aVar.f10382a);
            this.f10376c = S.o1(aVar.f10383b);
            this.f10375b = aVar.f10382a;
            this.f10377d = aVar.f10383b;
            this.f10378e = aVar.f10384c;
            this.f10379f = aVar.f10385d;
            this.f10380g = aVar.f10386e;
            this.f10381h = aVar.f10387f;
        }

        /* synthetic */ d(a aVar, a aVar2) {
            this(aVar);
        }

        public a a() {
            return new a(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f10375b == dVar.f10375b && this.f10377d == dVar.f10377d && this.f10378e == dVar.f10378e && this.f10379f == dVar.f10379f && this.f10380g == dVar.f10380g && this.f10381h == dVar.f10381h;
        }

        public int hashCode() {
            long j10 = this.f10375b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f10377d;
            return ((((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f10378e ? 1 : 0)) * 31) + (this.f10379f ? 1 : 0)) * 31) + (this.f10380g ? 1 : 0)) * 31) + (this.f10381h ? 1 : 0);
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f10388r = new d.a().h();

        private e(d.a aVar) {
            super(aVar, null);
        }

        /* synthetic */ e(d.a aVar, a aVar2) {
            this(aVar);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f10389l = S.z0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f10390m = S.z0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f10391n = S.z0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f10392o = S.z0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f10393p = S.z0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f10394q = S.z0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f10395r = S.z0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f10396s = S.z0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f10397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f10398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f10399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractC0877u f10400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AbstractC0877u f10401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f10402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f10403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f10404h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AbstractC0876t f10405i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AbstractC0876t f10406j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f10407k;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f10408a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f10409b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private AbstractC0877u f10410c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f10411d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f10412e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f10413f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private AbstractC0876t f10414g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f10415h;

            private a() {
                this.f10410c = AbstractC0877u.k();
                this.f10412e = true;
                this.f10414g = AbstractC0876t.w();
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            private a(f fVar) {
                this.f10408a = fVar.f10397a;
                this.f10409b = fVar.f10399c;
                this.f10410c = fVar.f10401e;
                this.f10411d = fVar.f10402f;
                this.f10412e = fVar.f10403g;
                this.f10413f = fVar.f10404h;
                this.f10414g = fVar.f10406j;
                this.f10415h = fVar.f10407k;
            }

            /* synthetic */ a(f fVar, a aVar) {
                this(fVar);
            }

            public f i() {
                return new f(this, null);
            }
        }

        private f(a aVar) {
            AbstractC1459a.g((aVar.f10413f && aVar.f10409b == null) ? false : true);
            UUID uuid = (UUID) AbstractC1459a.e(aVar.f10408a);
            this.f10397a = uuid;
            this.f10398b = uuid;
            this.f10399c = aVar.f10409b;
            this.f10400d = aVar.f10410c;
            this.f10401e = aVar.f10410c;
            this.f10402f = aVar.f10411d;
            this.f10404h = aVar.f10413f;
            this.f10403g = aVar.f10412e;
            this.f10405i = aVar.f10414g;
            this.f10406j = aVar.f10414g;
            this.f10407k = aVar.f10415h != null ? Arrays.copyOf(aVar.f10415h, aVar.f10415h.length) : null;
        }

        /* synthetic */ f(a aVar, a aVar2) {
            this(aVar);
        }

        public a b() {
            return new a(this, null);
        }

        public byte[] c() {
            byte[] bArr = this.f10407k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f10397a.equals(fVar.f10397a) && Objects.equals(this.f10399c, fVar.f10399c) && Objects.equals(this.f10401e, fVar.f10401e) && this.f10402f == fVar.f10402f && this.f10404h == fVar.f10404h && this.f10403g == fVar.f10403g && this.f10406j.equals(fVar.f10406j) && Arrays.equals(this.f10407k, fVar.f10407k);
        }

        public int hashCode() {
            int iHashCode = this.f10397a.hashCode() * 31;
            Uri uri = this.f10399c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f10401e.hashCode()) * 31) + (this.f10402f ? 1 : 0)) * 31) + (this.f10404h ? 1 : 0)) * 31) + (this.f10403g ? 1 : 0)) * 31) + this.f10406j.hashCode()) * 31) + Arrays.hashCode(this.f10407k);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f10416f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f10417g = S.z0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f10418h = S.z0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f10419i = S.z0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f10420j = S.z0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f10421k = S.z0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10426e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f10427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f10428b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f10429c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f10430d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f10431e;

            public a() {
                this.f10427a = -9223372036854775807L;
                this.f10428b = -9223372036854775807L;
                this.f10429c = -9223372036854775807L;
                this.f10430d = -3.4028235E38f;
                this.f10431e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f10427a = gVar.f10422a;
                this.f10428b = gVar.f10423b;
                this.f10429c = gVar.f10424c;
                this.f10430d = gVar.f10425d;
                this.f10431e = gVar.f10426e;
            }

            /* synthetic */ a(g gVar, a aVar) {
                this(gVar);
            }

            public g f() {
                return new g(this, null);
            }

            public a g(long j10) {
                this.f10429c = j10;
                return this;
            }

            public a h(float f10) {
                this.f10431e = f10;
                return this;
            }

            public a i(long j10) {
                this.f10428b = j10;
                return this;
            }

            public a j(float f10) {
                this.f10430d = f10;
                return this;
            }

            public a k(long j10) {
                this.f10427a = j10;
                return this;
            }
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f10422a = j10;
            this.f10423b = j11;
            this.f10424c = j12;
            this.f10425d = f10;
            this.f10426e = f11;
        }

        private g(a aVar) {
            this(aVar.f10427a, aVar.f10428b, aVar.f10429c, aVar.f10430d, aVar.f10431e);
        }

        /* synthetic */ g(a aVar, a aVar2) {
            this(aVar);
        }

        public a a() {
            return new a(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f10422a == gVar.f10422a && this.f10423b == gVar.f10423b && this.f10424c == gVar.f10424c && this.f10425d == gVar.f10425d && this.f10426e == gVar.f10426e;
        }

        public int hashCode() {
            long j10 = this.f10422a;
            long j11 = this.f10423b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f10424c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f10425d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f10426e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f10432j = S.z0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f10433k = S.z0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f10434l = S.z0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f10435m = S.z0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f10436n = S.z0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f10437o = S.z0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f10438p = S.z0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f10439q = S.z0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f10442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f10443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f10444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AbstractC0876t f10445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f10446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f10447h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f10448i;

        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC0876t abstractC0876t, Object obj, long j10) {
            this.f10440a = uri;
            this.f10441b = y.u(str);
            this.f10442c = fVar;
            this.f10443d = list;
            this.f10444e = str2;
            this.f10445f = abstractC0876t;
            AbstractC0876t.a aVarL = AbstractC0876t.l();
            for (int i10 = 0; i10 < abstractC0876t.size(); i10++) {
                aVarL.a(((k) abstractC0876t.get(i10)).a().i());
            }
            this.f10446g = aVarL.k();
            this.f10447h = obj;
            this.f10448i = j10;
        }

        /* synthetic */ h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC0876t abstractC0876t, Object obj, long j10, a aVar) {
            this(uri, str, fVar, bVar, list, str2, abstractC0876t, obj, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f10440a.equals(hVar.f10440a) && Objects.equals(this.f10441b, hVar.f10441b) && Objects.equals(this.f10442c, hVar.f10442c) && this.f10443d.equals(hVar.f10443d) && Objects.equals(this.f10444e, hVar.f10444e) && this.f10445f.equals(hVar.f10445f) && Objects.equals(this.f10447h, hVar.f10447h) && this.f10448i == hVar.f10448i;
        }

        public int hashCode() {
            int iHashCode = this.f10440a.hashCode() * 31;
            String str = this.f10441b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f10442c;
            int iHashCode3 = (((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f10443d.hashCode()) * 31;
            String str2 = this.f10444e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f10445f.hashCode()) * 31;
            Object obj = this.f10447h;
            return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f10448i);
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f10449d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f10450e = S.z0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f10451f = S.z0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f10452g = S.z0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f10455c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f10456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10457b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f10458c;

            public i d() {
                return new i(this, null);
            }
        }

        private i(a aVar) {
            this.f10453a = aVar.f10456a;
            this.f10454b = aVar.f10457b;
            this.f10455c = aVar.f10458c;
        }

        /* synthetic */ i(a aVar, a aVar2) {
            this(aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f10453a, iVar.f10453a) && Objects.equals(this.f10454b, iVar.f10454b)) {
                if ((this.f10455c == null) == (iVar.f10455c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f10453a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f10454b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f10455c != null ? 1 : 0);
        }
    }

    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar, null);
        }

        /* synthetic */ j(k.a aVar, a aVar2) {
            this(aVar);
        }
    }

    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f10459h = S.z0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f10460i = S.z0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f10461j = S.z0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f10462k = S.z0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f10463l = S.z0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f10464m = S.z0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f10465n = S.z0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f10466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f10467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f10471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f10472g;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f10473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10474b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f10475c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f10476d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f10477e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f10478f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f10479g;

            private a(k kVar) {
                this.f10473a = kVar.f10466a;
                this.f10474b = kVar.f10467b;
                this.f10475c = kVar.f10468c;
                this.f10476d = kVar.f10469d;
                this.f10477e = kVar.f10470e;
                this.f10478f = kVar.f10471f;
                this.f10479g = kVar.f10472g;
            }

            /* synthetic */ a(k kVar, a aVar) {
                this(kVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this, null);
            }
        }

        private k(a aVar) {
            this.f10466a = aVar.f10473a;
            this.f10467b = aVar.f10474b;
            this.f10468c = aVar.f10475c;
            this.f10469d = aVar.f10476d;
            this.f10470e = aVar.f10477e;
            this.f10471f = aVar.f10478f;
            this.f10472g = aVar.f10479g;
        }

        /* synthetic */ k(a aVar, a aVar2) {
            this(aVar);
        }

        public a a() {
            return new a(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f10466a.equals(kVar.f10466a) && Objects.equals(this.f10467b, kVar.f10467b) && Objects.equals(this.f10468c, kVar.f10468c) && this.f10469d == kVar.f10469d && this.f10470e == kVar.f10470e && Objects.equals(this.f10471f, kVar.f10471f) && Objects.equals(this.f10472g, kVar.f10472g);
        }

        public int hashCode() {
            int iHashCode = this.f10466a.hashCode() * 31;
            String str = this.f10467b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f10468c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f10469d) * 31) + this.f10470e) * 31;
            String str3 = this.f10471f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f10472g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    private u(String str, e eVar, h hVar, g gVar, w wVar, i iVar) {
        this.f10344a = str;
        this.f10345b = hVar;
        this.f10346c = hVar;
        this.f10347d = gVar;
        this.f10348e = wVar;
        this.f10349f = eVar;
        this.f10350g = eVar;
        this.f10351h = iVar;
    }

    /* synthetic */ u(String str, e eVar, h hVar, g gVar, w wVar, i iVar, a aVar) {
        this(str, eVar, hVar, gVar, wVar, iVar);
    }

    public static u b(Uri uri) {
        return new c().f(uri).a();
    }

    public static u c(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c(this, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Objects.equals(this.f10344a, uVar.f10344a) && this.f10349f.equals(uVar.f10349f) && Objects.equals(this.f10345b, uVar.f10345b) && Objects.equals(this.f10347d, uVar.f10347d) && Objects.equals(this.f10348e, uVar.f10348e) && Objects.equals(this.f10351h, uVar.f10351h);
    }

    public int hashCode() {
        int iHashCode = this.f10344a.hashCode() * 31;
        h hVar = this.f10345b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f10347d.hashCode()) * 31) + this.f10349f.hashCode()) * 31) + this.f10348e.hashCode()) * 31) + this.f10351h.hashCode();
    }
}
