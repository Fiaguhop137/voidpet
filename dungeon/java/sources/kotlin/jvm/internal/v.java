package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v extends z implements kotlin.reflect.m {
    public v() {
    }

    public v(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3967d
    protected kotlin.reflect.c computeReflected() {
        return F.j(this);
    }

    @Override // kotlin.reflect.k
    /* JADX INFO: renamed from: d */
    public kotlin.reflect.m.a j0() {
        return ((kotlin.reflect.m) getReflected()).j0();
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }
}
