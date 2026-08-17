package p429xf;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0 f57671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, boolean z10, Function0 function0) {
        super(str, z10);
        this.f57671e = function0;
    }

    @Override // p429xf.a
    public long f() {
        this.f57671e.invoke();
        return -1L;
    }
}
