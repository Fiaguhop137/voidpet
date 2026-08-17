package androidx.core.view;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.core.view.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1897b0 implements p199l1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f23187a;

    public /* synthetic */ C1897b0(ViewConfiguration viewConfiguration) {
        this.f23187a = viewConfiguration;
    }

    @Override // p199l1.j
    public final Object get() {
        return Integer.valueOf(this.f23187a.getScaledMinimumFlingVelocity());
    }
}
