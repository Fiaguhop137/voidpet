package Ef;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class h implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l.a f2792g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f2793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f2794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f2795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f2796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f2797e;

    public static final class a {

        /* JADX INFO: renamed from: Ef.h$a$a, reason: collision with other inner class name */
        public static final class C0059a implements l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f2798a;

            C0059a(String str) {
                this.f2798a = str;
            }

            @Override // Ef.l.a
            public boolean a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt.O(name, this.f2798a + '.', false, 2, null);
            }

            @Override // Ef.l.a
            public m b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return h.f2791f.b(sslSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !Intrinsics.b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.c(superclass);
            return new h(superclass);
        }

        public final l.a c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C0059a(packageName);
        }

        public final l.a d() {
            return h.f2792g;
        }
    }

    static {
        a aVar = new a(null);
        f2791f = aVar;
        f2792g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f2793a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f2794b = declaredMethod;
        this.f2795c = sslSocketClass.getMethod("setHostname", String.class);
        this.f2796d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f2797e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // Ef.m
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f2793a.isInstance(sslSocket);
    }

    @Override // Ef.m
    public boolean b() {
        return Df.b.f2458f.b();
    }

    @Override // Ef.m
    public String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f2796d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // Ef.m
    public void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f2794b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f2795c.invoke(sslSocket, str);
                }
                this.f2797e.invoke(sslSocket, Df.j.f2485a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
