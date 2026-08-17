package p111g2;

import C9.AbstractC0876t;
import C9.AbstractC0877u;
import C9.AbstractC0879w;
import R1.n;
import U1.AbstractC1459a;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f41975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f41977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f41978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f41979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f41980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f41981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f41982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f41983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f41984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f41985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f41986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f41987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f41988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f41989t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f41990u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f41991v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC0876t f41992w;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f41995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f41996d;

        public b(String str, double d10) {
            this.f41993a = str;
            this.f41994b = 2;
            this.f41995c = d10;
            this.f41996d = null;
        }

        public b(String str, String str2, int i10) {
            boolean z10 = true;
            if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z10 = false;
            }
            AbstractC1459a.g(z10);
            this.f41993a = str;
            this.f41994b = i10;
            this.f41996d = str2;
            this.f41995c = 0.0d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f41994b == bVar.f41994b && Double.compare(this.f41995c, bVar.f41995c) == 0 && Objects.equals(this.f41993a, bVar.f41993a) && Objects.equals(this.f41996d, bVar.f41996d);
        }

        public int hashCode() {
            return Objects.hash(this.f41993a, Integer.valueOf(this.f41994b), Double.valueOf(this.f41995c), this.f41996d);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f41998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f41999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f42000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f42001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f42002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f42003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f42004h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f42005i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f42006j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f42007k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AbstractC0876t f42008l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AbstractC0876t f42009m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AbstractC0876t f42010n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f42011o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final String f42012p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f42013q;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f42014a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Uri f42016c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Uri f42017d;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f42023j;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private Boolean f42028o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private String f42029p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private String f42030q;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Map f42015b = new HashMap();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private long f42018e = -9223372036854775807L;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private long f42019f = -9223372036854775807L;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private long f42020g = -9223372036854775807L;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private long f42021h = -9223372036854775807L;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List f42022i = new ArrayList();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private long f42024k = -9223372036854775807L;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private long f42025l = -9223372036854775807L;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List f42026m = new ArrayList();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List f42027n = new ArrayList();

            public a(String str) {
                this.f42014a = str;
            }

            public c a() {
                Uri uri = this.f42017d;
                if ((uri != null || this.f42016c == null) && (uri == null || this.f42016c != null)) {
                    return null;
                }
                long j10 = this.f42018e;
                if (j10 == -9223372036854775807L) {
                    return null;
                }
                String str = this.f42014a;
                Uri uri2 = this.f42016c;
                long j11 = this.f42019f;
                long j12 = this.f42020g;
                long j13 = this.f42021h;
                List list = this.f42022i;
                boolean z10 = this.f42023j;
                long j14 = this.f42024k;
                long j15 = this.f42025l;
                List list2 = this.f42026m;
                List list3 = this.f42027n;
                ArrayList arrayList = new ArrayList(this.f42015b.values());
                Boolean bool = this.f42028o;
                boolean z11 = bool == null || bool.booleanValue();
                String str2 = this.f42029p;
                if (str2 == null) {
                    str2 = "POINT";
                }
                String str3 = str2;
                String str4 = this.f42030q;
                if (str4 == null) {
                    str4 = "HIGHLIGHT";
                }
                return new c(str, uri2, uri, j10, j11, j12, j13, list, z10, j14, j15, list2, list3, arrayList, z11, str3, str4);
            }

            public a b(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f42017d;
                if (uri2 != null) {
                    AbstractC1459a.b(uri2.equals(uri), "Can't change assetListUri from " + this.f42017d + " to " + uri);
                }
                this.f42017d = uri;
                return this;
            }

            public a c(Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f42016c;
                if (uri2 != null) {
                    AbstractC1459a.b(uri2.equals(uri), "Can't change assetUri from " + this.f42016c + " to " + uri);
                }
                this.f42016c = uri;
                return this;
            }

            public a d(List list) {
                if (!list.isEmpty()) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        b bVar = (b) list.get(i10);
                        String str = bVar.f41993a;
                        b bVar2 = (b) this.f42015b.get(str);
                        if (bVar2 != null) {
                            AbstractC1459a.b(bVar2.equals(bVar), "Can't change " + str + " from " + bVar2.f41996d + " " + bVar2.f41995c + " to " + bVar.f41996d + " " + bVar.f41995c);
                        }
                        this.f42015b.put(str, bVar);
                    }
                }
                return this;
            }

            public a e(Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.f42028o;
                if (bool2 != null) {
                    AbstractC1459a.b(bool2.equals(bool), "Can't change contentMayVary from " + this.f42028o + " to " + bool);
                }
                this.f42028o = bool;
                return this;
            }

            public a f(List list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f42022i.isEmpty()) {
                    AbstractC1459a.b(this.f42022i.equals(list), "Can't change cue from " + p111g2.h.a(", ", this.f42022i) + " to " + p111g2.h.a(", ", list));
                }
                this.f42022i = list;
                return this;
            }

            public a g(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f42020g;
                if (j11 != -9223372036854775807L) {
                    AbstractC1459a.b(j11 == j10, "Can't change durationUs from " + this.f42020g + " to " + j10);
                }
                this.f42020g = j10;
                return this;
            }

            public a h(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f42019f;
                if (j11 != -9223372036854775807L) {
                    AbstractC1459a.b(j11 == j10, "Can't change endDateUnixUs from " + this.f42019f + " to " + j10);
                }
                this.f42019f = j10;
                return this;
            }

            public a i(boolean z10) {
                if (!z10) {
                    return this;
                }
                this.f42023j = true;
                return this;
            }

            public a j(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f42021h;
                if (j11 != -9223372036854775807L) {
                    AbstractC1459a.b(j11 == j10, "Can't change plannedDurationUs from " + this.f42021h + " to " + j10);
                }
                this.f42021h = j10;
                return this;
            }

            public a k(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f42025l;
                if (j11 != -9223372036854775807L) {
                    AbstractC1459a.b(j11 == j10, "Can't change playoutLimitUs from " + this.f42025l + " to " + j10);
                }
                this.f42025l = j10;
                return this;
            }

            public a l(List list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f42027n.isEmpty()) {
                    AbstractC1459a.b(this.f42027n.equals(list), "Can't change restrictions from " + p111g2.h.a(", ", this.f42027n) + " to " + p111g2.h.a(", ", list));
                }
                this.f42027n = list;
                return this;
            }

            public a m(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f42024k;
                if (j11 != -9223372036854775807L) {
                    AbstractC1459a.b(j11 == j10, "Can't change resumeOffsetUs from " + this.f42024k + " to " + j10);
                }
                this.f42024k = j10;
                return this;
            }

            public a n(List list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f42026m.isEmpty()) {
                    AbstractC1459a.b(this.f42026m.equals(list), "Can't change snapTypes from " + p111g2.h.a(", ", this.f42026m) + " to " + p111g2.h.a(", ", list));
                }
                this.f42026m = list;
                return this;
            }

            public a o(long j10) {
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j11 = this.f42018e;
                if (j11 != -9223372036854775807L) {
                    AbstractC1459a.b(j11 == j10, "Can't change startDateUnixUs from " + this.f42018e + " to " + j10);
                }
                this.f42018e = j10;
                return this;
            }

            public a p(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f42029p;
                if (str2 != null) {
                    AbstractC1459a.b(str2.equals(str), "Can't change timelineOccupies from " + this.f42029p + " to " + str);
                }
                this.f42029p = str;
                return this;
            }

            public a q(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f42030q;
                if (str2 != null) {
                    AbstractC1459a.b(str2.equals(str), "Can't change timelineStyle from " + this.f42030q + " to " + str);
                }
                this.f42030q = str;
                return this;
            }
        }

        public c(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, List list, boolean z10, long j14, long j15, List list2, List list3, List list4, boolean z11, String str2, String str3) {
            AbstractC1459a.a((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f41997a = str;
            this.f41998b = uri;
            this.f41999c = uri2;
            this.f42000d = j10;
            this.f42001e = j11;
            this.f42002f = j12;
            this.f42003g = j13;
            this.f42004h = list;
            this.f42005i = z10;
            this.f42006j = j14;
            this.f42007k = j15;
            this.f42008l = AbstractC0876t.p(list2);
            this.f42009m = AbstractC0876t.p(list3);
            this.f42010n = AbstractC0876t.E(new p111g2.g(), list4);
            this.f42011o = z11;
            this.f42012p = str2;
            this.f42013q = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f42000d == cVar.f42000d && this.f42001e == cVar.f42001e && this.f42002f == cVar.f42002f && this.f42003g == cVar.f42003g && this.f42005i == cVar.f42005i && this.f42006j == cVar.f42006j && this.f42007k == cVar.f42007k && this.f42011o == cVar.f42011o && Objects.equals(this.f41997a, cVar.f41997a) && Objects.equals(this.f41998b, cVar.f41998b) && Objects.equals(this.f41999c, cVar.f41999c) && Objects.equals(this.f42004h, cVar.f42004h) && Objects.equals(this.f42008l, cVar.f42008l) && Objects.equals(this.f42009m, cVar.f42009m) && Objects.equals(this.f42010n, cVar.f42010n) && Objects.equals(this.f42012p, cVar.f42012p) && Objects.equals(this.f42013q, cVar.f42013q);
        }

        public int hashCode() {
            return Objects.hash(this.f41997a, this.f41998b, this.f41999c, Long.valueOf(this.f42000d), Long.valueOf(this.f42001e), Long.valueOf(this.f42002f), Long.valueOf(this.f42003g), this.f42004h, Boolean.valueOf(this.f42005i), Long.valueOf(this.f42006j), Long.valueOf(this.f42007k), this.f42008l, this.f42009m, this.f42010n, Boolean.valueOf(this.f42011o), this.f42012p, this.f42013q);
        }
    }

    public static final class d extends g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f42031l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f42032m;

        public d(String str, C0483f c0483f, long j10, int i10, long j11, n nVar, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, c0483f, j10, i10, j11, nVar, str2, str3, j12, j13, z10, null);
            this.f42031l = z11;
            this.f42032m = z12;
        }

        public d g(long j10, int i10) {
            return new d(this.f42038a, this.f42039b, this.f42040c, i10, j10, this.f42043f, this.f42044g, this.f42045h, this.f42046i, this.f42047j, this.f42048k, this.f42031l, this.f42032m);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f42033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f42034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f42035c;

        public e(Uri uri, long j10, int i10) {
            this.f42033a = uri;
            this.f42034b = j10;
            this.f42035c = i10;
        }
    }

    /* JADX INFO: renamed from: g2.f$f, reason: collision with other inner class name */
    public static final class C0483f extends g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f42036l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f42037m;

        public C0483f(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, AbstractC0876t.w());
        }

        public C0483f(String str, C0483f c0483f, String str2, long j10, int i10, long j11, n nVar, String str3, String str4, long j12, long j13, boolean z10, List list) {
            super(str, c0483f, j10, i10, j11, nVar, str3, str4, j12, j13, z10, null);
            this.f42036l = str2;
            this.f42037m = AbstractC0876t.p(list);
        }

        public C0483f g(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f42037m.size(); i11++) {
                d dVar = (d) this.f42037m.get(i11);
                arrayList.add(dVar.g(j11, i10));
                j11 += dVar.f42040c;
            }
            return new C0483f(this.f42038a, this.f42039b, this.f42036l, this.f42040c, i10, j10, this.f42043f, this.f42044g, this.f42045h, this.f42046i, this.f42047j, this.f42048k, arrayList);
        }
    }

    public static class g implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f42038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0483f f42039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f42040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f42041d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f42042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final n f42043f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f42044g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f42045h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f42046i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f42047j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f42048k;

        private g(String str, C0483f c0483f, long j10, int i10, long j11, n nVar, String str2, String str3, long j12, long j13, boolean z10) {
            this.f42038a = str;
            this.f42039b = c0483f;
            this.f42040c = j10;
            this.f42041d = i10;
            this.f42042e = j11;
            this.f42043f = nVar;
            this.f42044g = str2;
            this.f42045h = str3;
            this.f42046i = j12;
            this.f42047j = j13;
            this.f42048k = z10;
        }

        /* synthetic */ g(String str, C0483f c0483f, long j10, int i10, long j11, n nVar, String str2, String str3, long j12, long j13, boolean z10, a aVar) {
            this(str, c0483f, j10, i10, j11, nVar, str2, str3, j12, j13, z10);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f42042e > l10.longValue()) {
                return 1;
            }
            return this.f42042e < l10.longValue() ? -1 : 0;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f42049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f42050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f42051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f42052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f42053e;

        public h(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f42049a = j10;
            this.f42050b = z10;
            this.f42051c = j11;
            this.f42052d = j12;
            this.f42053e = z11;
        }
    }

    public f(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, n nVar, List list2, List list3, h hVar, Map map, List list4) {
        super(str, list, z12);
        this.f41973d = i10;
        this.f41977h = j11;
        this.f41976g = z10;
        this.f41978i = z11;
        this.f41979j = i11;
        this.f41980k = j12;
        this.f41981l = i12;
        this.f41982m = j13;
        this.f41983n = j14;
        this.f41984o = z13;
        this.f41985p = z14;
        this.f41986q = nVar;
        this.f41987r = AbstractC0876t.p(list2);
        this.f41988s = AbstractC0876t.p(list3);
        this.f41989t = AbstractC0877u.c(map);
        this.f41992w = AbstractC0876t.p(list4);
        if (!list3.isEmpty()) {
            d dVar = (d) AbstractC0879w.d(list3);
            this.f41990u = dVar.f42042e + dVar.f42040c;
        } else if (list2.isEmpty()) {
            this.f41990u = 0L;
        } else {
            C0483f c0483f = (C0483f) AbstractC0879w.d(list2);
            this.f41990u = c0483f.f42042e + c0483f.f42040c;
        }
        this.f41974e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f41990u, j10) : Math.max(0L, this.f41990u + j10) : -9223372036854775807L;
        this.f41975f = j10 >= 0;
        this.f41991v = hVar;
    }

    @Override // p182k2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(List list) {
        return this;
    }

    public f c(long j10, int i10) {
        return new f(this.f41973d, this.f42075a, this.f42076b, this.f41974e, this.f41976g, j10, true, i10, this.f41980k, this.f41981l, this.f41982m, this.f41983n, this.f42077c, this.f41984o, this.f41985p, this.f41986q, this.f41987r, this.f41988s, this.f41991v, this.f41989t, this.f41992w);
    }

    public f d() {
        return this.f41984o ? this : new f(this.f41973d, this.f42075a, this.f42076b, this.f41974e, this.f41976g, this.f41977h, this.f41978i, this.f41979j, this.f41980k, this.f41981l, this.f41982m, this.f41983n, this.f42077c, true, this.f41985p, this.f41986q, this.f41987r, this.f41988s, this.f41991v, this.f41989t, this.f41992w);
    }

    public long e() {
        return this.f41977h + this.f41990u;
    }

    public boolean f(f fVar) {
        if (fVar != null) {
            long j10 = this.f41980k;
            long j11 = fVar.f41980k;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f41987r.size() - fVar.f41987r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f41988s.size();
                int size3 = fVar.f41988s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f41984o || fVar.f41984o)) {
                    return false;
                }
            }
        }
        return true;
    }
}
