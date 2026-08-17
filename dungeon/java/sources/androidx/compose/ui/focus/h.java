package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21387a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f21388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f21389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f21390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f21391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f21392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f21393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f21394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f21395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Function1 f21396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Function1 f21397k;

    static final class a extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21398a = new a();

        a() {
            super(1);
        }

        public final void a(p001a0.c cVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p001a0.c) obj);
            return Unit.f48228a;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21399a = new b();

        b() {
            super(1);
        }

        public final void a(p001a0.c cVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((p001a0.c) obj);
            return Unit.f48228a;
        }
    }

    public h() {
        i.a aVar = i.f21400b;
        this.f21388b = aVar.b();
        this.f21389c = aVar.b();
        this.f21390d = aVar.b();
        this.f21391e = aVar.b();
        this.f21392f = aVar.b();
        this.f21393g = aVar.b();
        this.f21394h = aVar.b();
        this.f21395i = aVar.b();
        this.f21396j = a.f21398a;
        this.f21397k = b.f21399a;
    }

    @Override // androidx.compose.ui.focus.g
    public i a() {
        return this.f21392f;
    }

    @Override // androidx.compose.ui.focus.g
    public i b() {
        return this.f21393g;
    }

    @Override // androidx.compose.ui.focus.g
    public i c() {
        return this.f21394h;
    }

    @Override // androidx.compose.ui.focus.g
    public i d() {
        return this.f21390d;
    }

    @Override // androidx.compose.ui.focus.g
    public i e() {
        return this.f21395i;
    }

    @Override // androidx.compose.ui.focus.g
    public i f() {
        return this.f21391e;
    }

    @Override // androidx.compose.ui.focus.g
    public void g(boolean z10) {
        this.f21387a = z10;
    }

    @Override // androidx.compose.ui.focus.g
    public void h(Function1 function1) {
        this.f21396j = function1;
    }

    @Override // androidx.compose.ui.focus.g
    public boolean i() {
        return this.f21387a;
    }

    @Override // androidx.compose.ui.focus.g
    public i j() {
        return this.f21389c;
    }

    @Override // androidx.compose.ui.focus.g
    public Function1 k() {
        return this.f21396j;
    }

    @Override // androidx.compose.ui.focus.g
    public i l() {
        return this.f21388b;
    }

    @Override // androidx.compose.ui.focus.g
    public Function1 m() {
        return this.f21397k;
    }

    @Override // androidx.compose.ui.focus.g
    public void n(Function1 function1) {
        this.f21397k = function1;
    }
}
