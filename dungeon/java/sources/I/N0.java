package I;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements InterfaceC1072s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1072s0 f4502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1061o0 f4503b = new C1061o0();

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f4504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f4505b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4507d;

        a(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4505b = obj;
            this.f4507d |= Integer.MIN_VALUE;
            return N0.this.s(null, this);
        }
    }

    public N0(InterfaceC1072s0 interfaceC1072s0) {
        this.f4502a = interfaceC1072s0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return InterfaceC1072s0.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext S(CoroutineContext.b bVar) {
        return InterfaceC1072s0.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object b0(Object obj, Function2 function2) {
        return InterfaceC1072s0.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element e(CoroutineContext.b bVar) {
        return InterfaceC1072s0.a.b(this, bVar);
    }

    public final void g() {
        this.f4503b.d();
    }

    public final void j() {
        this.f4503b.f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // I.InterfaceC1072s0
    public Object s(Function1 function1, Ed.b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f4507d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4507d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f4505b;
        Object objE = Fd.b.e();
        int i11 = aVar.f4507d;
        if (i11 == 0) {
            Ad.r.b(obj);
            C1061o0 c1061o0 = this.f4503b;
            aVar.f4504a = function1;
            aVar.f4507d = 1;
            if (c1061o0.c(aVar) != objE) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ad.r.b(obj);
            return obj;
        }
        function1 = (Function1) aVar.f4504a;
        Ad.r.b(obj);
        InterfaceC1072s0 interfaceC1072s0 = this.f4502a;
        aVar.f4504a = null;
        aVar.f4507d = 2;
        Object objS = interfaceC1072s0.s(function1, aVar);
        return objS == objE ? objE : objS;
    }
}
