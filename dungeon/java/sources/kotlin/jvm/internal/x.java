package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends z implements kotlin.reflect.n {
    public x() {
    }

    public x(Class cls, String str, String str2, int i10) {
        super(AbstractC3967d.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3967d
    protected kotlin.reflect.c computeReflected() {
        return F.k(this);
    }

    @Override // kotlin.reflect.k
    public kotlin.reflect.n.a d() {
        return ((kotlin.reflect.n) getReflected()).d();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return s(obj, obj2);
    }
}
