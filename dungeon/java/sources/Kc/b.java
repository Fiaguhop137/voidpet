package Kc;

import Rb.u;
import android.os.Bundle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f6169a;

    public /* synthetic */ b(u uVar) {
        this.f6169a = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return c.z(this.f6169a, ((Integer) obj).intValue(), (Bundle) obj2);
    }
}
