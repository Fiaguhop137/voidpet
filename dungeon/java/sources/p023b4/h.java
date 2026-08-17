package p023b4;

import R3.AbstractC1373u;
import R3.C1364k;
import R3.U;
import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import p077e4.g;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f26275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f26276b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26277a;

        static {
            int[] iArr = new int[c.values().length];
            f26277a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26277a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, f fVar) {
        this.f26275a = gVar;
        this.f26276b = fVar;
    }

    private C1364k a(Context context, String str, String str2) {
        g gVar;
        Pair pairA;
        U uF;
        if (str2 == null || (gVar = this.f26275a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i10 = a.f26277a[cVar.ordinal()];
        if (i10 == 1) {
            uF = AbstractC1373u.F(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            uF = AbstractC1373u.r(inputStream, str2);
        } else {
            try {
                uF = AbstractC1373u.r(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                uF = new U((Throwable) e10);
            }
        }
        if (uF.b() != null) {
            return (C1364k) uF.b();
        }
        return null;
    }

    private U b(Context context, String str, String str2) {
        U u10;
        g.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.f26276b.a(str);
                if (dVarA.isSuccessful()) {
                    u10 = e(context, str, dVarA.i1(), dVarA.Y0(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(u10.b() != null);
                    g.a(sb2.toString());
                } else {
                    u10 = new U((Throwable) new IllegalArgumentException(dVarA.Y2()));
                }
                try {
                    dVarA.close();
                    return u10;
                } catch (IOException e10) {
                    g.d("LottieFetchResult close failed ", e10);
                    return u10;
                }
            } catch (Exception e11) {
                U u11 = new U((Throwable) e11);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e12) {
                        g.d("LottieFetchResult close failed ", e12);
                    }
                }
                return u11;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                closeable.close();
                throw th;
            } catch (IOException e13) {
                g.d("LottieFetchResult close failed ", e13);
                throw th;
            }
        }
    }

    private U d(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f26275a) == null) ? AbstractC1373u.r(new GZIPInputStream(inputStream), null) : AbstractC1373u.r(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    private U e(Context context, String str, InputStream inputStream, String str2, String str3) {
        U uG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            g.a("Handling zip response.");
            c cVar2 = c.ZIP;
            uG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            g.a("Handling gzip response.");
            cVar = c.GZIP;
            uG = d(str, inputStream, str3);
        } else {
            g.a("Received json response.");
            cVar = c.JSON;
            uG = f(str, inputStream, str3);
        }
        if (str3 != null && uG.b() != null && (gVar = this.f26275a) != null) {
            gVar.f(str, cVar);
        }
        return uG;
    }

    private U f(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f26275a) == null) ? AbstractC1373u.r(inputStream, null) : AbstractC1373u.r(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private U g(Context context, String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f26275a) == null) ? AbstractC1373u.F(context, new ZipInputStream(inputStream), null) : AbstractC1373u.F(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }

    public U c(Context context, String str, String str2) {
        C1364k c1364kA = a(context, str, str2);
        if (c1364kA != null) {
            return new U(c1364kA);
        }
        g.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
