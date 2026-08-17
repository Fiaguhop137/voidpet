package p379v1;

import Ad.r;
import Ed.b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import p088ef.AbstractC3322z;
import p088ef.InterfaceC3318x;
import p267of.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p267of.a f55923a = g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3318x f55924b = AbstractC3322z.b(null, 1, null);

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f55925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f55926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f55927c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f55929e;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55927c = obj;
            this.f55929e |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    public final Object a(b bVar) {
        Object objI = this.f55924b.i(bVar);
        return objI == Fd.b.e() ? objI : Unit.f48228a;
    }

    protected abstract Object b(b bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(b bVar) throws Throwable {
        a aVar;
        p267of.a aVar2;
        z zVar;
        p267of.a aVar3;
        Throwable th;
        z zVar2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f55929e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f55929e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f55927c;
        Object objE = Fd.b.e();
        int i11 = aVar.f55929e;
        try {
            if (i11 == 0) {
                r.b(obj);
                if (this.f55924b.p()) {
                    return Unit.f48228a;
                }
                aVar2 = this.f55923a;
                aVar.f55925a = this;
                aVar.f55926b = aVar2;
                aVar.f55929e = 1;
                if (aVar2.a(null, aVar) != objE) {
                    zVar = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (p267of.a) aVar.f55926b;
                zVar2 = (z) aVar.f55925a;
                try {
                    r.b(obj);
                    InterfaceC3318x interfaceC3318x = zVar2.f55924b;
                    Unit unit = Unit.f48228a;
                    interfaceC3318x.G(unit);
                    aVar3.e(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            p267of.a aVar4 = (p267of.a) aVar.f55926b;
            zVar = (z) aVar.f55925a;
            r.b(obj);
            aVar2 = aVar4;
            if (zVar.f55924b.p()) {
                Unit unit2 = Unit.f48228a;
                aVar2.e(null);
                return unit2;
            }
            aVar.f55925a = zVar;
            aVar.f55926b = aVar2;
            aVar.f55929e = 2;
            if (zVar.b(aVar) != objE) {
                aVar3 = aVar2;
                zVar2 = zVar;
                InterfaceC3318x interfaceC3318x2 = zVar2.f55924b;
                Unit unit3 = Unit.f48228a;
                interfaceC3318x2.G(unit3);
                aVar3.e(null);
                return unit3;
            }
            return objE;
        } catch (Throwable th3) {
            aVar3 = aVar2;
            th = th3;
            aVar3.e(null);
            throw th;
        }
    }
}
