package S;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: S.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1430j implements InterfaceC1427g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f11375a;

    public /* synthetic */ C1430j(Function1 function1) {
        this.f11375a = function1;
    }

    @Override // S.InterfaceC1427g
    public final void dispose() {
        AbstractC1432l.a.k(this.f11375a);
    }
}
