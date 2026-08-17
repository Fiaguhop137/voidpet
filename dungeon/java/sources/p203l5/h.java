package p203l5;

import U5.x;
import V4.f;
import V4.n;
import android.content.res.Resources;
import java.util.concurrent.Executor;
import p257o5.a;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f48671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f48672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p007a6.a f48673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p007a6.a f48674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Executor f48675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f48676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f48677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f48678h;

    public void a(Resources resources, a aVar, p007a6.a aVar2, p007a6.a aVar3, Executor executor, x xVar, f fVar, n nVar) {
        this.f48671a = resources;
        this.f48672b = aVar;
        this.f48673c = aVar2;
        this.f48674d = aVar3;
        this.f48675e = executor;
        this.f48676f = xVar;
        this.f48677g = fVar;
        this.f48678h = nVar;
    }

    protected e b(Resources resources, a aVar, p007a6.a aVar2, p007a6.a aVar3, Executor executor, x xVar, f fVar) {
        return new e(resources, aVar, aVar2, aVar3, executor, xVar, fVar);
    }

    public e c() {
        e eVarB = b(this.f48671a, this.f48672b, this.f48673c, this.f48674d, this.f48675e, this.f48676f, this.f48677g);
        n nVar = this.f48678h;
        if (nVar != null) {
            eVarB.A0(((Boolean) nVar.get()).booleanValue());
        }
        return eVarB;
    }
}
