package p395w;

import Ad.r;
import Ed.b;
import Md.n;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AbstractC1876q0;
import androidx.compose.ui.platform.e1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019b0.e;
import p216m0.AbstractC3994q;
import p216m0.C3993p;
import p216m0.I;
import p216m0.S;
import p216m0.U;
import p216m0.z;
import p324s0.AbstractC4142i;
import p324s0.AbstractC4146k;
import p413x.s;
import p413x.v;
import p431y.k;
import p450z0.C4368g;

/* JADX INFO: loaded from: classes.dex */
public class i extends c {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final boolean f56517M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private z f56518N;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w.i$a$a, reason: collision with other inner class name */
        static final class C0723a extends m implements n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f56520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f56521b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ long f56522c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f56523d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0723a(i iVar, b bVar) {
                super(3, bVar);
                this.f56523d = iVar;
            }

            public final Object i(s sVar, long j10, b bVar) {
                C0723a c0723a = new C0723a(this.f56523d, bVar);
                c0723a.f56521b = sVar;
                c0723a.f56522c = j10;
                return c0723a.invokeSuspend(Unit.f48228a);
            }

            @Override // Md.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return i((s) obj, ((e) obj2).t(), (b) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = Fd.b.e();
                int i10 = this.f56520a;
                if (i10 == 0) {
                    r.b(obj);
                    s sVar = (s) this.f56521b;
                    long j10 = this.f56522c;
                    if (this.f56523d.t2()) {
                        i iVar = this.f56523d;
                        this.f56520a = 1;
                        if (iVar.v2(sVar, j10, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return Unit.f48228a;
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(i iVar, e eVar) {
            if (iVar.t2()) {
                iVar.u2().invoke();
            }
            return Unit.f48228a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(I i10, b bVar) {
            Object objI = v.i(i10, new C0723a(i.this, null), new h(i.this), bVar);
            return objI == Fd.b.e() ? objI : Unit.f48228a;
        }
    }

    private i(k kVar, s sVar, boolean z10, boolean z11, String str, C4368g c4368g, Function0 function0) {
        super(kVar, sVar, z10, z11, str, c4368g, function0, null);
        this.f56517M = (k.f56527c && k.f56535k) ? false : true;
    }

    public /* synthetic */ i(k kVar, s sVar, boolean z10, boolean z11, String str, C4368g c4368g, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, sVar, z10, z11, str, c4368g, function0);
    }

    private final long I2(long j10) {
        long jN1 = AbstractC4146k.j(this).n1(((e1) AbstractC4142i.a(this, AbstractC1876q0.k())).d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jN1 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        return p019b0.k.d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jN1 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    @Override // p395w.c
    protected final boolean B2(KeyEvent keyEvent) {
        return false;
    }

    @Override // p395w.c
    protected final boolean C2(KeyEvent keyEvent) {
        u2().invoke();
        return true;
    }

    public final void J2(k kVar, s sVar, boolean z10, boolean z11, String str, C4368g c4368g, Function0 function0) {
        H2(kVar, sVar, z10, z11, str, c4368g, function0);
    }

    @Override // p395w.c, p324s0.u0
    public void R0() {
        super.R0();
        if (this.f56518N != null) {
            this.f56518N = null;
            w2();
        }
    }

    @Override // p395w.c, p324s0.u0
    public void d0(C3993p c3993p, p216m0.r rVar, long j10) {
        super.d0(c3993p, rVar, j10);
        if (this.f56517M) {
            return;
        }
        int i10 = 0;
        if (rVar != p216m0.r.Main) {
            if (rVar != p216m0.r.Final || this.f56518N == null) {
                return;
            }
            List listC = c3993p.c();
            int size = listC.size();
            while (i10 < size) {
                z zVar = (z) listC.get(i10);
                if (zVar.o() && !Intrinsics.b(zVar, this.f56518N)) {
                    this.f56518N = null;
                    w2();
                    return;
                }
                i10++;
            }
            return;
        }
        z zVar2 = this.f56518N;
        if (zVar2 == null) {
            if (v.n(c3993p, true, false, 2, null)) {
                z zVar3 = (z) c3993p.c().get(0);
                zVar3.a();
                this.f56518N = zVar3;
                if (t2()) {
                    y2(zVar3.h());
                    return;
                }
                return;
            }
            return;
        }
        List listC2 = c3993p.c();
        int size2 = listC2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (!AbstractC3994q.c((z) listC2.get(i11))) {
                long jI2 = I2(j10);
                List listC3 = c3993p.c();
                int size3 = listC3.size();
                while (i10 < size3) {
                    z zVar4 = (z) listC3.get(i10);
                    if (zVar4.o() || AbstractC3994q.f(zVar4, j10, jI2)) {
                        this.f56518N = null;
                        w2();
                        return;
                    }
                    i10++;
                }
                return;
            }
        }
        ((z) c3993p.c().get(0)).a();
        if (t2()) {
            x2(zVar2.h());
            u2().invoke();
        }
        this.f56518N = null;
    }

    @Override // p395w.c
    public U o2() {
        if (this.f56517M) {
            return S.a(new a());
        }
        return null;
    }
}
