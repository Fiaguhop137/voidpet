package androidx.core.view;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f23154a;

    public /* synthetic */ V(AtomicBoolean atomicBoolean) {
        this.f23154a = atomicBoolean;
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
        this.f23154a.set((i10 & 8) != 0);
    }
}
