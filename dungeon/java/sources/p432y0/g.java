package p432y0;

import Ad.r;
import Ed.b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f57732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f57733c;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f57734a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f57736c;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f57734a = obj;
            this.f57736c |= Integer.MIN_VALUE;
            return g.this.e(0.0f, this);
        }
    }

    public g(int i10, Function2 function2) {
        this.f57731a = i10;
        this.f57732b = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(float f10, b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f57736c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f57736c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objInvoke = aVar.f57734a;
        Object objE = Fd.b.e();
        int i11 = aVar.f57736c;
        if (i11 == 0) {
            r.b(objInvoke);
            Function2 function2 = this.f57732b;
            Float fC = kotlin.coroutines.jvm.internal.b.c(f10);
            aVar.f57736c = 1;
            objInvoke = function2.invoke(fC, aVar);
            if (objInvoke == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objInvoke);
        }
        this.f57733c += ((Number) objInvoke).floatValue();
        return Unit.f48228a;
    }

    public final float b() {
        return this.f57733c;
    }

    public final int c(int i10) {
        return e.m(i10 - Od.a.c(this.f57733c), 0, this.f57731a);
    }

    public final void d() {
        this.f57733c = 0.0f;
    }

    public final Object f(int i10, int i11, b bVar) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.f57731a;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.f57731a).toString());
        }
        float f10 = i10;
        float f11 = this.f57733c;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return Unit.f48228a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, bVar);
        return objG == Fd.b.e() ? objG : Unit.f48228a;
    }

    public final Object g(float f10, b bVar) {
        Object objE = e(f10 - this.f57733c, bVar);
        return objE == Fd.b.e() ? objE : Unit.f48228a;
    }
}
