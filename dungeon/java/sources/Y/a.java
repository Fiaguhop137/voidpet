package Y;

import O0.t;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p037c0.E;
import p037c0.S;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O0.d f16619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f16621c;

    private a(O0.d dVar, long j10, Function1 function1) {
        this.f16619a = dVar;
        this.f16620b = j10;
        this.f16621c = function1;
    }

    public /* synthetic */ a(O0.d dVar, long j10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, function1);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        p073e0.a aVar = new p073e0.a();
        O0.d dVar = this.f16619a;
        long j10 = this.f16620b;
        t tVar = t.Ltr;
        S sA = E.a(canvas);
        Function1 function1 = this.f16621c;
        p073e0.a.C0447a c0447aZ = aVar.z();
        O0.d dVarA = c0447aZ.a();
        t tVarB = c0447aZ.b();
        S sC = c0447aZ.c();
        long jD = c0447aZ.d();
        p073e0.a.C0447a c0447aZ2 = aVar.z();
        c0447aZ2.j(dVar);
        c0447aZ2.k(tVar);
        c0447aZ2.i(sA);
        c0447aZ2.l(j10);
        sA.j();
        function1.invoke(aVar);
        sA.f();
        p073e0.a.C0447a c0447aZ3 = aVar.z();
        c0447aZ3.j(dVarA);
        c0447aZ3.k(tVarB);
        c0447aZ3.i(sC);
        c0447aZ3.l(jD);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        O0.d dVar = this.f16619a;
        point.set(dVar.q0(dVar.W0(Float.intBitsToFloat((int) (this.f16620b >> 32)))), dVar.q0(dVar.W0(Float.intBitsToFloat((int) (this.f16620b & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }
}
