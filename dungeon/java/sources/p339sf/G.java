package p339sf;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4182a f53778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f53779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f53780c;

    public G(C4182a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f53778a = address;
        this.f53779b = proxy;
        this.f53780c = socketAddress;
    }

    public final C4182a a() {
        return this.f53778a;
    }

    public final Proxy b() {
        return this.f53779b;
    }

    public final boolean c() {
        return this.f53778a.k() != null && this.f53779b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f53780c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return Intrinsics.b(g10.f53778a, this.f53778a) && Intrinsics.b(g10.f53779b, this.f53779b) && Intrinsics.b(g10.f53780c, this.f53780c);
    }

    public int hashCode() {
        return ((((527 + this.f53778a.hashCode()) * 31) + this.f53779b.hashCode()) * 31) + this.f53780c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f53780c + '}';
    }
}
