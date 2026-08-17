package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends z implements kotlin.reflect.l {
    public t() {
    }

    public t(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.AbstractC3967d
    protected kotlin.reflect.c computeReflected() {
        return F.i(this);
    }

    @Override // kotlin.reflect.k
    public kotlin.reflect.l.a d() {
        return ((kotlin.reflect.l) getReflected()).d();
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }
}
