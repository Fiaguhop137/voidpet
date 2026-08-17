package I;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends Z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S1 f4580b;

    public Z(S1 s10, Function0 function0) {
        super(function0);
        this.f4580b = s10;
    }

    @Override // I.Z0
    public C1020a1 c(Object obj) {
        return new C1020a1(this, obj, obj == null, this.f4580b, null, null, true);
    }
}
