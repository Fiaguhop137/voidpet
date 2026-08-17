package p142hf;

import Ad.g;
import Ad.r;
import Ed.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class M implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f42911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f42912b;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f42913a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f42915c;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42913a = obj;
            this.f42915c |= Integer.MIN_VALUE;
            return M.this.collect(null, this);
        }
    }

    public M(x xVar, Function2 function2) {
        this.f42911a = xVar;
        this.f42912b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p142hf.x, p142hf.InterfaceC3564c
    public Object collect(InterfaceC3565d interfaceC3565d, b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f42915c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f42915c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f42913a;
        Object objE = Fd.b.e();
        int i11 = aVar.f42915c;
        if (i11 == 0) {
            r.b(obj);
            x xVar = this.f42911a;
            L l10 = new L(interfaceC3565d, this.f42912b);
            aVar.f42915c = 1;
            if (xVar.collect(l10, aVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
        }
        throw new g();
    }
}
