package p216m0;

import V.g;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p019b0.e;
import p288q0.m;

/* JADX INFO: loaded from: classes.dex */
public final class J implements G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f48792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Q f48793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f48794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F f48795e = new b();

    private enum a {
        Unknown,
        Dispatching,
        NotDispatching;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f48800e = Gd.a.a(e());
    }

    public static final class b extends F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f48801a = a.Unknown;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3993p f48802b;

        static final class a extends o implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ J f48805b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J j10) {
                super(1);
                this.f48805b = j10;
            }

            public final void a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f48805b.d().invoke(motionEvent);
                } else {
                    b.this.f48801a = ((Boolean) this.f48805b.d().invoke(motionEvent)).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Unit.f48228a;
            }
        }

        /* JADX INFO: renamed from: m0.J$b$b, reason: collision with other inner class name */
        static final class C0575b extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ J f48806a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0575b(J j10) {
                super(1);
                this.f48806a = j10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f48806a.d().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Unit.f48228a;
            }
        }

        static final class c extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ J f48807a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(J j10) {
                super(1);
                this.f48807a = j10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f48807a.d().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return Unit.f48228a;
            }
        }

        b() {
        }

        private final void b(C3993p c3993p, boolean z10) {
            List listC = c3993p.c();
            int size = listC.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                if (((z) listC.get(i11)).o()) {
                    d(c3993p);
                    return;
                }
            }
            m layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
            if (layoutCoordinates$ui_release == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            L.c(c3993p, layoutCoordinates$ui_release.k0(e.f25805b.c()), new a(J.this));
            if (this.f48801a == a.Dispatching) {
                if (!g.f13744k) {
                    int size2 = listC.size();
                    while (i10 < size2) {
                        ((z) listC.get(i10)).a();
                        i10++;
                    }
                } else if (z10) {
                    int size3 = listC.size();
                    while (i10 < size3) {
                        ((z) listC.get(i10)).a();
                        i10++;
                    }
                }
                C3983f c3983fE = c3993p.e();
                if (c3983fE != null) {
                    c3983fE.e(!J.this.c());
                }
            }
        }

        private final void c() {
            this.f48801a = a.Unknown;
            J.this.f(false);
            this.f48802b = null;
        }

        private final void d(C3993p c3993p) {
            if (this.f48801a == a.Dispatching) {
                m layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                if (layoutCoordinates$ui_release == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                L.b(c3993p, layoutCoordinates$ui_release.k0(e.f25805b.c()), new c(J.this));
            }
            this.f48801a = a.NotDispatching;
        }

        @Override // p216m0.F
        public boolean getShareWithSiblings() {
            return true;
        }

        @Override // p216m0.F
        public void onCancel() {
            if (this.f48801a == a.Dispatching) {
                L.a(SystemClock.uptimeMillis(), new C0575b(J.this));
                c();
            }
        }

        @Override // p216m0.F
        /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
        public void mo58onPointerEventH0pRuoY(C3993p c3993p, r rVar, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            List listC = c3993p.c();
            int size = listC.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = true;
                    break;
                }
                z zVar = (z) listC.get(i10);
                if (AbstractC3994q.b(zVar) || AbstractC3994q.d(zVar)) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                z11 = false;
                break;
            }
            int size2 = listC.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    z11 = true;
                    break;
                } else {
                    if (((z) listC.get(i11)).o()) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (J.this.c()) {
                z12 = true;
                break;
            }
            int size3 = listC.size();
            int i12 = 0;
            while (true) {
                if (i12 < size3) {
                    z zVar2 = (z) listC.get(i12);
                    if (!AbstractC3994q.b(zVar2) && !AbstractC3994q.d(zVar2)) {
                        i12++;
                    }
                } else if (!z11 || !g.f13744k) {
                    z12 = false;
                    break;
                }
                z12 = true;
                break;
            }
            if (this.f48801a != a.NotDispatching) {
                if (rVar == r.Initial && z12) {
                    this.f48802b = c3993p;
                    b(c3993p, !z10 || J.this.c());
                }
                if (rVar == r.Main && z10 && Intrinsics.b(c3993p, this.f48802b) && J.this.c() && g.f13744k) {
                    int size4 = listC.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        ((z) listC.get(i13)).a();
                    }
                }
                if (!g.f13744k ? !(rVar != r.Final || z12) : !(rVar != r.Final || z12 || Intrinsics.b(c3993p, this.f48802b))) {
                    b(c3993p, true);
                }
            }
            if (rVar == r.Final) {
                int size5 = listC.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        c();
                        break;
                    } else if (!AbstractC3994q.d((z) listC.get(i14))) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (Intrinsics.b(c3993p, this.f48802b) && z10 && g.f13744k) {
                    int size6 = listC.size();
                    for (int i15 = 0; i15 < size6; i15++) {
                        if (((z) listC.get(i15)).o()) {
                            if (J.this.c()) {
                                break;
                            }
                            d(c3993p);
                            return;
                        }
                    }
                    int size7 = listC.size();
                    for (int i16 = 0; i16 < size7; i16++) {
                        ((z) listC.get(i16)).a();
                    }
                }
            }
        }
    }

    public final boolean c() {
        return this.f48794d;
    }

    public final Function1 d() {
        Function1 function1 = this.f48792b;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.r("onTouchEvent");
        return null;
    }

    public final void f(boolean z10) {
        this.f48794d = z10;
    }

    public final void g(Function1 function1) {
        this.f48792b = function1;
    }

    @Override // p216m0.G
    public F getPointerInputFilter() {
        return this.f48795e;
    }

    public final void h(Q q10) {
        Q q11 = this.f48793c;
        if (q11 != null) {
            q11.b(null);
        }
        this.f48793c = q10;
        if (q10 != null) {
            q10.b(this);
        }
    }
}
