package N5;

import Ad.j;
import Ad.m;
import V4.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7891e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f7892f = j.a(m.SYNCHRONIZED, new d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f7894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N5.a f7895c = new N5.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7896d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(int i10, InputStream inputStream, byte[] bArr) throws IOException {
            if (bArr.length < i10) {
                throw new IllegalStateException("Check failed.");
            }
            if (!inputStream.markSupported()) {
                return V4.a.b(inputStream, bArr, 0, i10);
            }
            try {
                inputStream.mark(i10);
                return V4.a.b(inputStream, bArr, 0, i10);
            } finally {
                inputStream.reset();
            }
        }

        public final c b(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            return d().c(is);
        }

        public final c c(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            try {
                return b(is);
            } catch (IOException e10) {
                throw p.a(e10);
            }
        }

        public final e d() {
            return (e) e.f7892f.getValue();
        }
    }

    private e() {
        h();
    }

    public static final c d(InputStream inputStream) {
        return f7891e.c(inputStream);
    }

    public static final e e() {
        return f7891e.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e f() {
        return new e();
    }

    private final void h() {
        this.f7893a = this.f7895c.b();
        List list = this.f7894b;
        if (list != null) {
            Intrinsics.c(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f7893a = Math.max(this.f7893a, ((c.b) it.next()).b());
            }
        }
    }

    public final c c(InputStream is) throws IOException {
        Intrinsics.checkNotNullParameter(is, "is");
        int i10 = this.f7893a;
        byte[] bArr = new byte[i10];
        int iE = f7891e.e(i10, is, bArr);
        c cVarA = this.f7895c.a(bArr, iE);
        if (Intrinsics.b(cVarA, b.f7884n) && !this.f7896d) {
            cVarA = c.f7888d;
        }
        if (cVarA != c.f7888d) {
            return cVarA;
        }
        List list = this.f7894b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVarA2 = ((c.b) it.next()).a(bArr, iE);
                if (cVarA2 != c.f7888d) {
                    return cVarA2;
                }
            }
        }
        return c.f7888d;
    }

    public final e g(boolean z10) {
        this.f7896d = z10;
        return this;
    }
}
