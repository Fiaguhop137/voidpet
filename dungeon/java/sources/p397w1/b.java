package p397w1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p379v1.C4230d;
import p379v1.InterfaceC4231e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC4231e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f56566a;

    public b(Function1 produceNewData) {
        Intrinsics.checkNotNullParameter(produceNewData, "produceNewData");
        this.f56566a = produceNewData;
    }

    @Override // p379v1.InterfaceC4231e
    public Object a(C4230d c4230d, Ed.b bVar) {
        return this.f56566a.invoke(c4230d);
    }
}
