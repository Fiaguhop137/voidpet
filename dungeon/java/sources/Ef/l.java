package Ef;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f2807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f2808b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f2807a = socketAdapterFactory;
    }

    private final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f2808b == null && this.f2807a.a(sSLSocket)) {
                this.f2808b = this.f2807a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2808b;
    }

    @Override // Ef.m
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f2807a.a(sslSocket);
    }

    @Override // Ef.m
    public boolean b() {
        return true;
    }

    @Override // Ef.m
    public String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            return mVarE.c(sslSocket);
        }
        return null;
    }

    @Override // Ef.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            mVarE.d(sslSocket, str, protocols);
        }
    }
}
