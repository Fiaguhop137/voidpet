package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements k, p288q0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p288q0.j f21601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O0.t f21602b;

    public static final class a implements p288q0.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f21605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f21606d;

        a(int i10, int i11, Map map, Function1 function1) {
            this.f21603a = i10;
            this.f21604b = i11;
            this.f21605c = map;
            this.f21606d = function1;
        }

        @Override // p288q0.y
        public int getHeight() {
            return this.f21604b;
        }

        @Override // p288q0.y
        public int getWidth() {
            return this.f21603a;
        }

        @Override // p288q0.y
        public Map t() {
            return this.f21605c;
        }

        @Override // p288q0.y
        public void u() {
        }

        @Override // p288q0.y
        public Function1 v() {
            return this.f21606d;
        }
    }

    public g(p288q0.j jVar, O0.t tVar) {
        this.f21601a = jVar;
        this.f21602b = tVar;
    }

    @Override // O0.l
    public long P(float f10) {
        return this.f21601a.P(f10);
    }

    @Override // O0.l
    public float S(long j10) {
        return this.f21601a.S(j10);
    }

    @Override // O0.d
    public float V0(int i10) {
        return this.f21601a.V0(i10);
    }

    @Override // O0.d
    public float W0(float f10) {
        return this.f21601a.W0(f10);
    }

    @Override // O0.d
    public long b0(float f10) {
        return this.f21601a.b0(f10);
    }

    @Override // O0.l
    public float b1() {
        return this.f21601a.b1();
    }

    @Override // O0.d
    public float e1(float f10) {
        return this.f21601a.e1(f10);
    }

    @Override // O0.d
    public float getDensity() {
        return this.f21601a.getDensity();
    }

    @Override // p288q0.j
    public O0.t getLayoutDirection() {
        return this.f21602b;
    }

    @Override // androidx.compose.ui.layout.k
    public p288q0.y h1(int i10, int i11, Map map, Function1 function1, Function1 function2) {
        boolean z10 = false;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            z10 = true;
        }
        if (!z10) {
            p270p0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, function1);
    }

    @Override // p288q0.j
    public boolean i0() {
        return this.f21601a.i0();
    }

    @Override // O0.d
    public long n1(long j10) {
        return this.f21601a.n1(j10);
    }

    @Override // O0.d
    public int q0(float f10) {
        return this.f21601a.q0(f10);
    }

    @Override // O0.d
    public float w0(long j10) {
        return this.f21601a.w0(j10);
    }
}
