package p166j4;

import android.os.SystemClock;
import com.android.volley.d;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.android.volley.u;
import com.android.volley.v;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f46843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f46844b;

        private b(String str, u uVar) {
            this.f46843a = str;
            this.f46844b = uVar;
        }

        /* synthetic */ b(String str, u uVar, a aVar) {
            this(str, uVar);
        }
    }

    static void a(n nVar, b bVar) {
        r retryPolicy = nVar.getRetryPolicy();
        int timeoutMs = nVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f46844b);
            nVar.addMarker(String.format("%s-retry [timeout=%s]", bVar.f46843a, Integer.valueOf(timeoutMs)));
        } catch (u e10) {
            nVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.f46843a, Integer.valueOf(timeoutMs)));
            throw e10;
        }
    }

    static k b(n nVar, long j10, List list) {
        com.android.volley.b.a cacheEntry = nVar.getCacheEntry();
        if (cacheEntry == null) {
            return new k(304, (byte[]) null, true, j10, list);
        }
        return new k(304, cacheEntry.f27845a, true, j10, e.a(list, cacheEntry));
    }

    static byte[] c(InputStream inputStream, int i10, c cVar) throws Throwable {
        byte[] bArrA;
        j jVar = new j(cVar, i10);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    jVar.write(bArrA, 0, i11);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            v.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.b(bArrA);
                    jVar.close();
                    throw th;
                }
            }
            byte[] byteArray = jVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                v.e("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.b(bArrA);
            jVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }

    static void d(long j10, n nVar, byte[] bArr, int i10) {
        if (v.f27911b || j10 > 3000) {
            v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", nVar, Long.valueOf(j10), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i10), Integer.valueOf(nVar.getRetryPolicy().a()));
        }
    }

    static b e(n nVar, IOException iOException, long j10, f fVar, byte[] bArr) throws s, l {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new t(), null);
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + nVar.getUrl(), iOException);
        }
        if (fVar == null) {
            if (nVar.shouldRetryConnectionErrors()) {
                return new b("connection", new l(), null);
            }
            throw new l(iOException);
        }
        int iD = fVar.d();
        v.c("Unexpected response code %d for %s", Integer.valueOf(iD), nVar.getUrl());
        if (bArr == null) {
            return new b("network", new j(), null);
        }
        k kVar = new k(iD, bArr, false, SystemClock.elapsedRealtime() - j10, fVar.c());
        if (iD == 401 || iD == 403) {
            return new b("auth", new com.android.volley.a(kVar), null);
        }
        if (iD >= 400 && iD <= 499) {
            throw new d(kVar);
        }
        if (iD < 500 || iD > 599 || !nVar.shouldRetryServerErrors()) {
            throw new s(kVar);
        }
        return new b("server", new s(kVar), null);
    }
}
