package p450z0;

import V.k;
import kotlin.jvm.functions.Function1;
import p324s0.y0;

/* JADX INFO: renamed from: z0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4363b extends k.c implements y0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f58238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f58239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Function1 f58240q;

    public C4363b(boolean z10, boolean z11, Function1 function1) {
        this.f58238o = z10;
        this.f58239p = z11;
        this.f58240q = function1;
    }

    public final void W1(boolean z10) {
        this.f58238o = z10;
    }

    public final void X1(Function1 function1) {
        this.f58240q = function1;
    }

    @Override // p324s0.y0
    public boolean Y() {
        return this.f58239p;
    }

    @Override // p324s0.y0
    public void m0(B b10) {
        this.f58240q.invoke(b10);
    }

    @Override // p324s0.y0
    public boolean p1() {
        return this.f58238o;
    }
}
