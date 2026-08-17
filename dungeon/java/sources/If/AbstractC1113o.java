package If;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: If.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1113o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5546a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1113o f5547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q f5548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1113o f5549d;

    /* JADX INFO: renamed from: If.o$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AbstractC1113o c1121x;
        try {
            Class.forName("java.nio.file.Files");
            c1121x = new J();
        } catch (ClassNotFoundException unused) {
            c1121x = new C1121x();
        }
        f5547b = c1121x;
        Q.a aVar = Q.f5447b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f5548c = Q.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = Jf.h.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        f5549d = new Jf.h(classLoader, false, null, 4, null);
    }

    public final Y a(Q file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return b(file, false);
    }

    public abstract Y b(Q q10, boolean z10);

    public abstract void c(Q q10, Q q11);

    public final void d(Q dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        e(dir, false);
    }

    public final void e(Q dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Jf.c.a(this, dir, z10);
    }

    public final void f(Q dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        g(dir, false);
    }

    public abstract void g(Q q10, boolean z10);

    public final void h(Q path) {
        Intrinsics.checkNotNullParameter(path, "path");
        i(path, false);
    }

    public abstract void i(Q q10, boolean z10);

    public final boolean j(Q path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return Jf.c.b(this, path);
    }

    public abstract List k(Q q10);

    public final C1112n l(Q path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return Jf.c.c(this, path);
    }

    public abstract C1112n m(Q q10);

    public abstract AbstractC1111m n(Q q10);

    public final Y o(Q file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return p(file, false);
    }

    public abstract Y p(Q q10, boolean z10);

    public abstract a0 q(Q q10);
}
