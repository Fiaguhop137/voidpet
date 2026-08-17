package p465zf;

import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import p339sf.C;
import p339sf.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f58718a = new i();

    private i() {
    }

    private final boolean b(C c10, Proxy.Type type) {
        return !c10.i() && type == Proxy.Type.HTTP;
    }

    public final String a(C request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.j());
        sb2.append(' ');
        i iVar = f58718a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.n());
        } else {
            sb2.append(iVar.c(request.n()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String c(u url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
