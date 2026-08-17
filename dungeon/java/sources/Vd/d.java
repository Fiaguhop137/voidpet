package Vd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f14279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f14281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f14282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f14283e;

    public d(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f14279a = cls;
        this.f14280b = map;
        this.f14281c = lazy;
        this.f14282d = lazy2;
        this.f14283e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f14279a, this.f14280b, this.f14281c, this.f14282d, this.f14283e, obj, method, objArr);
    }
}
