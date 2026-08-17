package androidx.core.view;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.core.view.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1895a0 implements p199l1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f23183a;

    public /* synthetic */ C1895a0(ViewConfiguration viewConfiguration) {
        this.f23183a = viewConfiguration;
    }

    @Override // p199l1.j
    public final Object get() {
        return Integer.valueOf(this.f23183a.getScaledMaximumFlingVelocity());
    }
}
