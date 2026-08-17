package I;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2 f4439a;

    private D(Function0 function0) {
        this.f4439a = new C1067q0(function0);
    }

    public /* synthetic */ D(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public i2 a() {
        return this.f4439a;
    }

    public abstract i2 b(C1020a1 c1020a1, i2 i2Var);
}
