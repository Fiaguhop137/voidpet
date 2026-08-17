package Kc;

import Rb.u;
import android.os.Bundle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f6168a;

    public /* synthetic */ a(u uVar) {
        this.f6168a = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return c.B(this.f6168a, ((Integer) obj).intValue(), (Bundle) obj2);
    }
}
