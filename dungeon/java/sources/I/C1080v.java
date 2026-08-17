package I;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: I.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1080v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1073s1 f4868a;

    public /* synthetic */ C1080v(InterfaceC1073s1 interfaceC1073s1) {
        this.f4868a = interfaceC1073s1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return AbstractC1083w.P(this.f4868a, ((Integer) obj).intValue(), obj2);
    }
}
