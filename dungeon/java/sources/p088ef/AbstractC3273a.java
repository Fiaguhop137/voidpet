package p088ef;

import Ed.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ef.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3273a extends H0 implements B0, b, O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f40812c;

    public AbstractC3273a(CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            r0((B0) coroutineContext.e(B0.f40749z1));
        }
        this.f40812c = coroutineContext.P(this);
    }

    @Override // p088ef.H0
    protected final void E0(Object obj) {
        if (!(obj instanceof C)) {
            W0(obj);
        } else {
            C c10 = (C) obj;
            V0(c10.f40752a, c10.a());
        }
    }

    protected void U0(Object obj) {
        B(obj);
    }

    protected void V0(Throwable th, boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p088ef.H0
    public String W() {
        return T.a(this) + " was cancelled";
    }

    protected void W0(Object obj) {
    }

    public final void X0(Q q10, Object obj, Function2 function2) {
        q10.g(function2, obj, this);
    }

    @Override // p088ef.H0, p088ef.B0
    public boolean a() {
        return super.a();
    }

    @Override // Ed.b
    public final CoroutineContext getContext() {
        return this.f40812c;
    }

    @Override // p088ef.O
    public CoroutineContext getCoroutineContext() {
        return this.f40812c;
    }

    @Override // p088ef.H0
    public final void q0(Throwable th) {
        M.a(this.f40812c, th);
    }

    @Override // Ed.b
    public final void resumeWith(Object obj) {
        Object objY0 = y0(E.b(obj));
        if (objY0 == I0.f40775b) {
            return;
        }
        U0(objY0);
    }

    @Override // p088ef.H0
    public String z0() {
        String strG = I.g(this.f40812c);
        if (strG == null) {
            return super.z0();
        }
        return '\"' + strG + "\":" + super.z0();
    }
}
