package p166j4;

import android.os.SystemClock;
import com.android.volley.h;
import com.android.volley.k;
import com.android.volley.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final g f46814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f46815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f46816c;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    public b(a aVar, c cVar) {
        this.f46815b = aVar;
        this.f46814a = aVar;
        this.f46816c = cVar;
    }

    @Override // com.android.volley.h
    public k a(n nVar) {
        IOException iOException;
        f fVarA;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                fVarA = this.f46815b.a(nVar, e.c(nVar.getCacheEntry()));
                try {
                    int iD = fVarA.d();
                    List listC = fVarA.c();
                    if (iD == 304) {
                        return i.b(nVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = fVarA.a();
                    byte[] bArrC = inputStreamA != null ? i.c(inputStreamA, fVarA.b(), this.f46816c) : new byte[0];
                    try {
                        i.d(SystemClock.elapsedRealtime() - jElapsedRealtime, nVar, bArrC, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        return new k(iD, bArrC, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e10) {
                        e = e10;
                        bArr = bArrC;
                        iOException = e;
                        i.a(nVar, i.e(nVar, iOException, jElapsedRealtime, fVarA, bArr));
                        nVar = nVar;
                    }
                } catch (IOException e11) {
                    e = e11;
                    bArr = null;
                }
            } catch (IOException e12) {
                iOException = e12;
                fVarA = null;
                bArr = null;
                nVar = nVar;
            }
            i.a(nVar, i.e(nVar, iOException, jElapsedRealtime, fVarA, bArr));
            nVar = nVar;
        }
    }
}
