package Ub;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Class f13452d;

    public /* synthetic */ g(Method method, Object obj, Class cls) {
        this.f13450b = method;
        this.f13451c = obj;
        this.f13452d = cls;
    }

    @Override // Ub.i
    public final Object b() {
        return i.a.f(this.f13450b, this.f13451c, this.f13452d);
    }
}
