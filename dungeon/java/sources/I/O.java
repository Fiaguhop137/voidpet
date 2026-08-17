package I;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class O extends Z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P f4508b;

    public O(Function1 function1) {
        super(new N());
        this.f4508b = new P(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h() {
        AbstractC1083w.u("Unexpected call to default provider");
        throw new Ad.g();
    }

    @Override // I.Z0
    public C1020a1 c(Object obj) {
        return new C1020a1(this, obj, obj == null, null, null, null, true);
    }

    @Override // I.D
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public P a() {
        return this.f4508b;
    }
}
