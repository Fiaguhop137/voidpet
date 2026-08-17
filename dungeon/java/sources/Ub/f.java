package Ub;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f13448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13449d;

    public /* synthetic */ f(Method method, Class cls, int i10) {
        this.f13447b = method;
        this.f13448c = cls;
        this.f13449d = i10;
    }

    @Override // Ub.i
    public final Object b() {
        return i.a.e(this.f13447b, this.f13448c, this.f13449d);
    }
}
