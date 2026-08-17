package A5;

import C5.i;
import C5.j;
import C5.k;
import C5.l;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements A5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p419x5.d f232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p437y5.c f233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f242k;

    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f243a;

        a() {
            this.f243a = f.this.f240i;
        }

        @Override // C5.i
        public int a() {
            return f.this.f241j;
        }

        @Override // C5.i
        public void b(int i10) {
            if (i10 != f.this.f241j) {
                f fVar = f.this;
                fVar.f241j = kotlin.ranges.e.m(i10, 1, fVar.f240i);
                j jVarM = f.this.m();
                if (jVarM != null) {
                    jVarM.d(f.this.f241j);
                }
            }
        }

        @Override // C5.i
        public int c() {
            return this.f243a;
        }
    }

    public f(String str, p419x5.d animationInformation, p437y5.c bitmapFrameRenderer, k frameLoaderFactory, boolean z10) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(frameLoaderFactory, "frameLoaderFactory");
        this.f232a = animationInformation;
        this.f233b = bitmapFrameRenderer;
        this.f234c = frameLoaderFactory;
        this.f235d = z10;
        this.f236e = str == null ? String.valueOf(hashCode()) : str;
        this.f237f = animationInformation.n();
        this.f238g = animationInformation.g();
        int iL = l(animationInformation);
        this.f240i = iL;
        this.f241j = iL;
        this.f242k = new a();
    }

    private final g k(int i10, int i11) {
        if (!this.f235d) {
            return new g(this.f237f, this.f238g);
        }
        int i12 = this.f237f;
        int i13 = this.f238g;
        if (i10 < i12 || i11 < i13) {
            double d10 = ((double) i12) / ((double) i13);
            if (i11 > i10) {
                i13 = kotlin.ranges.e.i(i11, i13);
                i12 = (int) (((double) i13) * d10);
            } else {
                i12 = kotlin.ranges.e.i(i10, i12);
                i13 = (int) (((double) i12) / d10);
            }
        }
        return new g(i12, i13);
    }

    private final int l(p419x5.d dVar) {
        return (int) kotlin.ranges.e.f(TimeUnit.SECONDS.toMillis(1L) / ((long) (dVar.j() / dVar.a())), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j m() {
        if (this.f239h == null) {
            this.f239h = this.f234c.b(this.f236e, this.f233b, this.f232a);
        }
        return this.f239h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n() {
        return Unit.f48228a;
    }

    @Override // A5.a
    public void a() {
        j jVarM = m();
        if (jVarM != null) {
            jVarM.a();
        }
        d();
    }

    @Override // A5.a
    public void b(int i10, int i11, Function0 function0) {
        if (i10 <= 0 || i11 <= 0 || this.f237f <= 0 || this.f238g <= 0) {
            return;
        }
        g gVarK = k(i10, i11);
        j jVarM = m();
        if (jVarM != null) {
            int iB = gVarK.b();
            int iB2 = gVarK.b();
            if (function0 == null) {
                function0 = new e();
            }
            jVarM.b(iB, iB2, function0);
        }
    }

    @Override // A5.a
    public Z4.a c(int i10, int i11, int i12) {
        g gVarK = k(i11, i12);
        j jVarM = m();
        l lVarC = jVarM != null ? jVarM.c(i10, gVarK.b(), gVarK.a()) : null;
        if (lVarC != null) {
            C5.e.f1429a.h(this.f242k, lVarC);
        }
        if (lVarC != null) {
            return lVarC.a();
        }
        return null;
    }

    @Override // A5.a
    public void d() {
        j jVarM = m();
        if (jVarM != null) {
            k.f1458d.b(this.f236e, jVarM);
        }
        this.f239h = null;
    }

    @Override // A5.a
    public void e(b bVar, p437y5.b bVar2, p419x5.a aVar, int i10, Function0 function0) {
        A5.a.C0004a.e(this, bVar, bVar2, aVar, i10, function0);
    }
}
