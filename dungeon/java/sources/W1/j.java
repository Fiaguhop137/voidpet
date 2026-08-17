package W1;

import U1.AbstractC1459a;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f14480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f14484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f14490k;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f14491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f14492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f14494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f14495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f14496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f14497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f14498h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f14499i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f14500j;

        public b() {
            this.f14493c = 1;
            this.f14495e = Collections.EMPTY_MAP;
            this.f14497g = -1L;
        }

        private b(j jVar) {
            this.f14491a = jVar.f14480a;
            this.f14492b = jVar.f14481b;
            this.f14493c = jVar.f14482c;
            this.f14494d = jVar.f14483d;
            this.f14495e = jVar.f14484e;
            this.f14496f = jVar.f14486g;
            this.f14497g = jVar.f14487h;
            this.f14498h = jVar.f14488i;
            this.f14499i = jVar.f14489j;
            this.f14500j = jVar.f14490k;
        }

        /* synthetic */ b(j jVar, a aVar) {
            this(jVar);
        }

        public j a() {
            AbstractC1459a.j(this.f14491a, "The uri must be set.");
            return new j(this.f14491a, this.f14492b, this.f14493c, this.f14494d, this.f14495e, this.f14496f, this.f14497g, this.f14498h, this.f14499i, this.f14500j, null);
        }

        public b b(int i10) {
            this.f14499i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f14494d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f14493c = i10;
            return this;
        }

        public b e(Map map) {
            this.f14495e = map;
            return this;
        }

        public b f(String str) {
            this.f14498h = str;
            return this;
        }

        public b g(long j10) {
            this.f14497g = j10;
            return this;
        }

        public b h(long j10) {
            this.f14496f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f14491a = uri;
            return this;
        }

        public b j(String str) {
            this.f14491a = Uri.parse(str);
            return this;
        }
    }

    static {
        R1.v.a("media3.datasource");
    }

    private j(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        AbstractC1459a.a(j13 >= 0);
        AbstractC1459a.a(j11 >= 0);
        AbstractC1459a.a(j12 > 0 || j12 == -1);
        this.f14480a = (Uri) AbstractC1459a.e(uri);
        this.f14481b = j10;
        this.f14482c = i10;
        this.f14483d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14484e = Collections.unmodifiableMap(new HashMap(map));
        this.f14486g = j11;
        this.f14485f = j13;
        this.f14487h = j12;
        this.f14488i = str;
        this.f14489j = i11;
        this.f14490k = obj;
    }

    /* synthetic */ j(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj, a aVar) {
        this(uri, j10, i10, bArr, map, j11, j12, str, i11, obj);
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b(this, null);
    }

    public final String b() {
        return c(this.f14482c);
    }

    public boolean d(int i10) {
        return (this.f14489j & i10) == i10;
    }

    public j e(long j10) {
        long j11 = this.f14487h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public j f(long j10, long j11) {
        return (j10 == 0 && this.f14487h == j11) ? this : new j(this.f14480a, this.f14481b, this.f14482c, this.f14483d, this.f14484e, this.f14486g + j10, j11, this.f14488i, this.f14489j, this.f14490k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f14480a + ", " + this.f14486g + ", " + this.f14487h + ", " + this.f14488i + ", " + this.f14489j + "]";
    }
}
