package A;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.p[] f16a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f17b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f20e;

    public /* synthetic */ L(androidx.compose.ui.layout.p[] pVarArr, M m10, int i10, int i11, int[] iArr) {
        this.f16a = pVarArr;
        this.f17b = m10;
        this.f18c = i10;
        this.f19d = i11;
        this.f20e = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return M.i(this.f16a, this.f17b, this.f18c, this.f19d, this.f20e, (androidx.compose.ui.layout.p.a) obj);
    }
}
