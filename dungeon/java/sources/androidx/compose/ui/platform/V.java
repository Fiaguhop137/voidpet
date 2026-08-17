package androidx.compose.ui.platform;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class V implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewConfiguration f21970a;

    public V(ViewConfiguration viewConfiguration) {
        this.f21970a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.e1
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.e1
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.e1
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.e1
    public float e() {
        return this.f21970a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.e1
    public float f() {
        return this.f21970a.getScaledTouchSlop();
    }
}
