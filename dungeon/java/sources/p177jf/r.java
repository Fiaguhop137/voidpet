package p177jf;

import Ad.q;
import Ed.b;
import Md.n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p088ef.E0;
import p142hf.InterfaceC3565d;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends d implements InterfaceC3565d, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3565d f47427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f47428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CoroutineContext f47430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f47431e;

    public r(InterfaceC3565d interfaceC3565d, CoroutineContext coroutineContext) {
        super(n.f47421a, kotlin.coroutines.e.f48283a);
        this.f47427a = interfaceC3565d;
        this.f47428b = coroutineContext;
        this.f47429c = ((Number) coroutineContext.b0(0, new q())).intValue();
    }

    private final void j(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof k) {
            m((k) coroutineContext2, obj);
        }
        u.b(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    private final Object l(b bVar, Object obj) {
        CoroutineContext context = bVar.getContext();
        E0.j(context);
        CoroutineContext coroutineContext = this.f47430d;
        if (coroutineContext != context) {
            j(context, coroutineContext, obj);
            this.f47430d = context;
        }
        this.f47431e = bVar;
        n nVar = s.f47432a;
        InterfaceC3565d interfaceC3565d = this.f47427a;
        Intrinsics.d(interfaceC3565d, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = nVar.invoke(interfaceC3565d, obj, this);
        if (!Intrinsics.b(objInvoke, Fd.b.e())) {
            this.f47431e = null;
        }
        return objInvoke;
    }

    private final void m(k kVar, Object obj) {
        throw new IllegalStateException(StringsKt.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + kVar.f47420b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p142hf.InterfaceC3565d
    public Object emit(Object obj, b bVar) {
        try {
            Object objL = l(bVar, obj);
            if (objL == Fd.b.e()) {
                h.c(bVar);
            }
            return objL == Fd.b.e() ? objL : Unit.f48228a;
        } catch (Throwable th) {
            this.f47430d = new k(th, bVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        b bVar = this.f47431e;
        if (bVar instanceof e) {
            return (e) bVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, Ed.b
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f47430d;
        return coroutineContext == null ? kotlin.coroutines.e.f48283a : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thD = q.d(obj);
        if (thD != null) {
            this.f47430d = new k(thD, getContext());
        }
        b bVar = this.f47431e;
        if (bVar != null) {
            bVar.resumeWith(obj);
        }
        return Fd.b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
