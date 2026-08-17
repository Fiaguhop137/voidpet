package Yd;

import Xd.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p464ze.c f17804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p464ze.b f17807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17808e;

    public static final class a extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f17809f = new a();

        private a() {
            super(o.f16312A, "Function", false, null, true);
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f17810f = new b();

        private b() {
            super(o.f16345x, "KFunction", true, null, false);
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f17811f = new c();

        private c() {
            super(o.f16345x, "KSuspendFunction", true, null, false);
        }
    }

    public static final class d extends f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f17812f = new d();

        private d() {
            super(o.f16340s, "SuspendFunction", false, null, true);
        }
    }

    public f(p464ze.c packageFqName, String classNamePrefix, boolean z10, p464ze.b bVar, boolean z11) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f17804a = packageFqName;
        this.f17805b = classNamePrefix;
        this.f17806c = z10;
        this.f17807d = bVar;
        this.f17808e = z11;
    }

    public final String a() {
        return this.f17805b;
    }

    public final p464ze.c b() {
        return this.f17804a;
    }

    public final p464ze.f c(int i10) {
        p464ze.f fVarP = p464ze.f.p(this.f17805b + i10);
        Intrinsics.checkNotNullExpressionValue(fVarP, "identifier(...)");
        return fVarP;
    }

    public String toString() {
        return this.f17804a + '.' + this.f17805b + 'N';
    }
}
