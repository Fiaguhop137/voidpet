package p145i0;

import I.A0;
import I.X1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f43503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0 f43504b;

    private c(int i10, Function1 function1) {
        this.f43503a = function1;
        this.f43504b = X1.d(a.c(i10), null, 2, null);
    }

    public /* synthetic */ c(int i10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function1);
    }

    @Override // p145i0.b
    public int a() {
        return ((a) this.f43504b.getValue()).i();
    }

    public void b(int i10) {
        this.f43504b.setValue(a.c(i10));
    }
}
