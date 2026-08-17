package p339sf;

import If.C1106h;
import If.InterfaceC1108j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p375uf.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53774a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: sf.F$a$a, reason: collision with other inner class name */
        public static final class C0662a extends F {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f53775b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f53776c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC1108j f53777d;

            C0662a(x xVar, long j10, InterfaceC1108j interfaceC1108j) {
                this.f53775b = xVar;
                this.f53776c = j10;
                this.f53777d = interfaceC1108j;
            }

            @Override // p339sf.F
            public InterfaceC1108j P3() {
                return this.f53777d;
            }

            @Override // p339sf.F
            public long d() {
                return this.f53776c;
            }

            @Override // p339sf.F
            public x e() {
                return this.f53775b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ F e(a aVar, InterfaceC1108j interfaceC1108j, x xVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return aVar.a(interfaceC1108j, xVar, j10);
        }

        public static /* synthetic */ F f(a aVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.d(bArr, xVar);
        }

        public final F a(InterfaceC1108j interfaceC1108j, x xVar, long j10) {
            Intrinsics.checkNotNullParameter(interfaceC1108j, "<this>");
            return new C0662a(xVar, j10, interfaceC1108j);
        }

        public final F b(String str, x xVar) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.f54081e.c(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            C1106h c1106hZ0 = new C1106h().z0(str, charset);
            return a(c1106hZ0, xVar, c1106hZ0.size());
        }

        public final F c(x xVar, long j10, InterfaceC1108j content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, xVar, j10);
        }

        public final F d(byte[] bArr, x xVar) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return a(new C1106h().write(bArr), xVar, bArr.length);
        }
    }

    private final Charset c() {
        Charset charsetC;
        x xVarE = e();
        return (xVarE == null || (charsetC = xVarE.c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetC;
    }

    public abstract InterfaceC1108j P3();

    public final InputStream a() {
        return P3().Y();
    }

    public final byte[] b() throws IOException {
        long jD = d();
        if (jD > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jD);
        }
        InterfaceC1108j interfaceC1108jP3 = P3();
        try {
            byte[] bArrY2 = interfaceC1108jP3.y2();
            c.a(interfaceC1108jP3, null);
            int length = bArrY2.length;
            if (jD == -1 || jD == length) {
                return bArrY2;
            }
            throw new IOException("Content-Length (" + jD + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(interfaceC1108jP3, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.m(P3());
    }

    public abstract long d();

    public abstract x e();

    public final String f() throws IOException {
        InterfaceC1108j interfaceC1108jP3 = P3();
        try {
            String strB3 = interfaceC1108jP3.b3(e.J(interfaceC1108jP3, c()));
            c.a(interfaceC1108jP3, null);
            return strB3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(interfaceC1108jP3, th);
                throw th2;
            }
        }
    }
}
