package p393vf;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p339sf.C;
import p339sf.C4182a;
import p339sf.C4189h;
import p339sf.E;
import p339sf.G;
import p339sf.InterfaceC4183b;
import p339sf.o;
import p339sf.q;
import p339sf.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC4183b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f56361d;

    /* JADX INFO: renamed from: vf.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0721a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56362a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f56362a = iArr;
        }
    }

    public a(q defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f56361d = defaultDns;
    }

    public /* synthetic */ a(q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.f54044b : qVar);
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0721a.f56362a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.j0(qVar.a(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // p339sf.InterfaceC4183b
    public C a(G g10, E response) {
        Proxy proxy;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C4182a c4182aA;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C4189h> listH = response.h();
        C cO = response.O();
        u uVarN = cO.n();
        boolean z10 = response.i() == 407;
        if (g10 == null || (proxy = g10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C4189h c4189h : listH) {
            if (StringsKt.z("Basic", c4189h.c(), true)) {
                if (g10 == null || (c4182aA = g10.a()) == null || (qVarC = c4182aA.c()) == null) {
                    qVarC = this.f56361d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, uVarN, qVarC), inetSocketAddress.getPort(), uVarN.q(), c4189h.b(), c4189h.c(), uVarN.s(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarN.h();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxy, uVarN, qVarC), uVarN.m(), uVarN.q(), c4189h.b(), c4189h.c(), uVarN.s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return cO.k().e(str, o.a(userName, new String(password), c4189h.a())).b();
                }
            }
        }
        return null;
    }
}
