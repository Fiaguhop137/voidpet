package p447yf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import p339sf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f58050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f58051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f58052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f58053d;

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f58050a = connectionSpecs;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f58050a.size();
        for (int i10 = this.f58051b; i10 < size; i10++) {
            if (((l) this.f58050a.get(i10)).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sslSocket) throws UnknownServiceException {
        l lVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f58051b;
        int size = this.f58050a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = (l) this.f58050a.get(i10);
            if (lVar.e(sslSocket)) {
                this.f58051b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f58052c = c(sslSocket);
            lVar.c(sslSocket, this.f58053d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f58053d);
        sb2.append(", modes=");
        sb2.append(this.f58050a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f58053d = true;
        if (!this.f58052c || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
