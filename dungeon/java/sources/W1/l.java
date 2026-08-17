package W1;

import C9.AbstractC0872o;
import C9.AbstractC0877u;
import C9.Q;
import U1.AbstractC1477t;
import U1.S;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class l extends W1.b implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f14518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f14519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f14520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t f14521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final B9.o f14522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f14523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f14524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HttpURLConnection f14525o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InputStream f14526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f14527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f14529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f14530t;

    public static final class b implements f.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f14532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private B9.o f14533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f14534d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f14537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f14538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f14539i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f14531a = new t();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14535e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14536f = 8000;

        @Override // W1.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a() {
            l lVar = new l(this.f14534d, this.f14535e, this.f14536f, this.f14537g, this.f14538h, this.f14531a, this.f14533c, this.f14539i, null);
            x xVar = this.f14532b;
            if (xVar != null) {
                lVar.j(xVar);
            }
            return lVar;
        }

        public b c(String str) {
            this.f14534d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends AbstractC0872o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f14540a;

        public c(Map map) {
            this.f14540a = map;
        }

        public static /* synthetic */ boolean f(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean g(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // C9.AbstractC0873p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.f14540a;
        }

        @Override // C9.AbstractC0872o, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // C9.AbstractC0872o, java.util.Map
        public Set entrySet() {
            return Q.b(super.entrySet(), new m());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // C9.AbstractC0872o, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // C9.AbstractC0872o, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // C9.AbstractC0872o, java.util.Map
        public Set keySet() {
            return Q.b(super.keySet(), new n());
        }

        @Override // C9.AbstractC0872o, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private l(String str, int i10, int i11, boolean z10, boolean z11, t tVar, B9.o oVar, boolean z12) {
        super(true);
        this.f14519i = str;
        this.f14517g = i10;
        this.f14518h = i11;
        this.f14515e = z10;
        this.f14516f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f14520j = tVar;
        this.f14522l = oVar;
        this.f14521k = new t();
        this.f14523m = z12;
    }

    /* synthetic */ l(String str, int i10, int i11, boolean z10, boolean z11, t tVar, B9.o oVar, boolean z12, a aVar) {
        this(str, i10, i11, z10, z11, tVar, oVar, z12);
    }

    private void A(long j10, j jVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) S.i(this.f14526p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new q(new InterruptedIOException(), jVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new q(jVar, 2008, 1);
            }
            j10 -= (long) i10;
            p(i10);
        }
    }

    private void t() {
        HttpURLConnection httpURLConnection = this.f14525o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                AbstractC1477t.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    private URL u(URL url, String str, j jVar) throws q {
        if (str == null) {
            throw new q("Null location redirect", jVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new q("Unsupported protocol redirect: " + protocol, jVar, 2001, 1);
            }
            if (this.f14515e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f14516f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new q(e10, jVar, 2001, 1);
                }
            }
            throw new q("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", jVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new q(e11, jVar, 2001, 1);
        }
    }

    private static boolean v(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection w(j jVar) throws IOException {
        URL url = new URL(jVar.f14480a.toString());
        int i10 = jVar.f14482c;
        byte[] bArr = jVar.f14483d;
        long j10 = jVar.f14486g;
        long j11 = jVar.f14487h;
        int i11 = 1;
        boolean zD = jVar.d(1);
        if (!this.f14515e && !this.f14516f && !this.f14523m) {
            return x(url, i10, bArr, j10, j11, zD, true, jVar.f14484e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new q(new NoRouteToHostException("Too many redirects: " + i13), jVar, 2001, 1);
            }
            HttpURLConnection httpURLConnectionX = x(url, i10, bArr, j10, j11, zD, false, jVar.f14484e);
            int responseCode = httpURLConnectionX.getResponseCode();
            String headerField = httpURLConnectionX.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionX.disconnect();
                url = u(url, headerField, jVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionX;
                }
                httpURLConnectionX.disconnect();
                if (!this.f14523m || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = u(url, headerField, jVar);
            }
            i12 = i13;
            i11 = 1;
        }
    }

    private HttpURLConnection x(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnectionY = y(url);
        httpURLConnectionY.setConnectTimeout(this.f14517g);
        httpURLConnectionY.setReadTimeout(this.f14518h);
        HashMap map2 = new HashMap();
        t tVar = this.f14520j;
        if (tVar != null) {
            map2.putAll(tVar.b());
        }
        map2.putAll(this.f14521k.b());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionY.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = u.a(j10, j11);
        if (strA != null) {
            httpURLConnectionY.setRequestProperty("Range", strA);
        }
        String str = this.f14519i;
        if (str != null) {
            httpURLConnectionY.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionY.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionY.setInstanceFollowRedirects(z11);
        httpURLConnectionY.setDoOutput(bArr != null);
        httpURLConnectionY.setRequestMethod(j.c(i10));
        if (bArr == null) {
            httpURLConnectionY.connect();
            return httpURLConnectionY;
        }
        httpURLConnectionY.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionY.connect();
        OutputStream outputStream = httpURLConnectionY.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionY;
    }

    private int z(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14529s;
        if (j10 != -1) {
            long j11 = j10 - this.f14530t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) S.i(this.f14526p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f14530t += (long) i12;
        p(i12);
        return i12;
    }

    @Override // W1.f
    public void close() {
        try {
            InputStream inputStream = this.f14526p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new q(e10, (j) S.i(this.f14524n), 2000, 3);
                }
            }
            this.f14526p = null;
            t();
            if (this.f14527q) {
                this.f14527q = false;
                q();
            }
            this.f14525o = null;
            this.f14524n = null;
        } catch (Throwable th) {
            this.f14526p = null;
            t();
            if (this.f14527q) {
                this.f14527q = false;
                q();
            }
            this.f14525o = null;
            this.f14524n = null;
            throw th;
        }
    }

    @Override // W1.f
    public Uri e() {
        HttpURLConnection httpURLConnection = this.f14525o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        j jVar = this.f14524n;
        if (jVar != null) {
            return jVar.f14480a;
        }
        return null;
    }

    @Override // W1.f
    public Map f() {
        HttpURLConnection httpURLConnection = this.f14525o;
        return httpURLConnection == null ? AbstractC0877u.k() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // W1.f
    public long m(j jVar) throws q {
        byte[] bArrB;
        this.f14524n = jVar;
        long j10 = 0;
        this.f14530t = 0L;
        this.f14529s = 0L;
        r(jVar);
        try {
            HttpURLConnection httpURLConnectionW = w(jVar);
            this.f14525o = httpURLConnectionW;
            this.f14528r = httpURLConnectionW.getResponseCode();
            String responseMessage = httpURLConnectionW.getResponseMessage();
            int i10 = this.f14528r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionW.getHeaderFields();
                if (this.f14528r == 416) {
                    if (jVar.f14486g == u.c(httpURLConnectionW.getHeaderField("Content-Range"))) {
                        this.f14527q = true;
                        s(jVar);
                        long j11 = jVar.f14487h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionW.getErrorStream();
                try {
                    bArrB = errorStream != null ? D9.a.b(errorStream) : S.f12881f;
                } catch (IOException unused) {
                    bArrB = S.f12881f;
                }
                byte[] bArr = bArrB;
                t();
                throw new s(this.f14528r, responseMessage, this.f14528r == 416 ? new g(2008) : null, headerFields, jVar, bArr);
            }
            String contentType = httpURLConnectionW.getContentType();
            B9.o oVar = this.f14522l;
            if (oVar != null && !oVar.apply(contentType)) {
                t();
                throw new r(contentType, jVar);
            }
            if (this.f14528r == 200) {
                long j12 = jVar.f14486g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zV = v(httpURLConnectionW);
            if (zV) {
                this.f14529s = jVar.f14487h;
            } else {
                long j13 = jVar.f14487h;
                if (j13 != -1) {
                    this.f14529s = j13;
                } else {
                    long jB = u.b(httpURLConnectionW.getHeaderField("Content-Length"), httpURLConnectionW.getHeaderField("Content-Range"));
                    this.f14529s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f14526p = httpURLConnectionW.getInputStream();
                if (zV) {
                    this.f14526p = new GZIPInputStream(this.f14526p);
                }
                this.f14527q = true;
                s(jVar);
                try {
                    A(j10, jVar);
                    return this.f14529s;
                } catch (IOException e10) {
                    t();
                    if (e10 instanceof q) {
                        throw ((q) e10);
                    }
                    throw new q(e10, jVar, 2000, 1);
                }
            } catch (IOException e11) {
                t();
                throw new q(e11, jVar, 2000, 1);
            }
        } catch (IOException e12) {
            t();
            throw q.c(e12, jVar, 1);
        }
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) throws q {
        try {
            return z(bArr, i10, i11);
        } catch (IOException e10) {
            throw q.c(e10, (j) S.i(this.f14524n), 2);
        }
    }

    HttpURLConnection y(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
