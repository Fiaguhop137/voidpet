package p339sf;

import If.C1109k;
import If.InterfaceC1107i;
import If.K;
import If.a0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import p375uf.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53738a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: sf.D$a$a, reason: collision with other inner class name */
        public static final class C0661a extends D {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f53739b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f53740c;

            C0661a(x xVar, File file) {
                this.f53739b = xVar;
                this.f53740c = file;
            }

            @Override // p339sf.D
            public long a() {
                return this.f53740c.length();
            }

            @Override // p339sf.D
            public x b() {
                return this.f53739b;
            }

            @Override // p339sf.D
            public void f(InterfaceC1107i sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                a0 a0VarK = K.k(this.f53740c);
                try {
                    sink.U0(a0VarK);
                    kotlin.io.c.a(a0VarK, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(a0VarK, th);
                        throw th2;
                    }
                }
            }
        }

        public static final class b extends D {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f53741b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1109k f53742c;

            b(x xVar, C1109k c1109k) {
                this.f53741b = xVar;
                this.f53742c = c1109k;
            }

            @Override // p339sf.D
            public long a() {
                return this.f53742c.M();
            }

            @Override // p339sf.D
            public x b() {
                return this.f53741b;
            }

            @Override // p339sf.D
            public void f(InterfaceC1107i sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.C2(this.f53742c);
            }
        }

        public static final class c extends D {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f53743b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f53744c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f53745d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f53746e;

            c(x xVar, int i10, byte[] bArr, int i11) {
                this.f53743b = xVar;
                this.f53744c = i10;
                this.f53745d = bArr;
                this.f53746e = i11;
            }

            @Override // p339sf.D
            public long a() {
                return this.f53744c;
            }

            @Override // p339sf.D
            public x b() {
                return this.f53743b;
            }

            @Override // p339sf.D
            public void f(InterfaceC1107i sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f53745d, this.f53746e, this.f53744c);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ D i(a aVar, C1109k c1109k, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.a(c1109k, xVar);
        }

        public static /* synthetic */ D j(a aVar, String str, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.c(str, xVar);
        }

        public static /* synthetic */ D k(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ D l(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(bArr, xVar, i10, i11);
        }

        public final D a(C1109k c1109k, x xVar) {
            Intrinsics.checkNotNullParameter(c1109k, "<this>");
            return new b(xVar, c1109k);
        }

        public final D b(File file, x xVar) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C0661a(xVar, file);
        }

        public final D c(String str, x xVar) {
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
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return h(bytes, xVar, 0, bytes.length);
        }

        public final D d(x xVar, C1109k content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, xVar);
        }

        public final D e(x xVar, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return c(content, xVar);
        }

        public final D f(x xVar, byte[] content, int i10, int i11) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, xVar, i10, i11);
        }

        public final D g(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return l(this, bArr, null, 0, 0, 7, null);
        }

        public final D h(byte[] bArr, x xVar, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            e.l(bArr.length, i10, i11);
            return new c(xVar, i11, bArr, i10);
        }
    }

    public static final D c(byte[] bArr) {
        return f53738a.g(bArr);
    }

    public abstract long a();

    public abstract x b();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(InterfaceC1107i interfaceC1107i);
}
