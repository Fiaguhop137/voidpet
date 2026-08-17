package app.rive.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1994q;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"app/rive/core/CommandQueue$withLifecycle$observer$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/q;", "owner", "", "onResume", "(Landroidx/lifecycle/q;)V", "onPause", "onDestroy", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CommandQueue$withLifecycle$observer$1 implements DefaultLifecycleObserver {
    final /* synthetic */ A $audioAcquired;
    final /* synthetic */ E $onClose;

    CommandQueue$withLifecycle$observer$1(A a10, E e10) {
        this.$audioAcquired = a10;
        this.$onClose = e10;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull InterfaceC1994q owner) {
        CloseOnce closeOnce;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Object obj = this.$onClose.f48338a;
        if (obj == null) {
            Intrinsics.r("onClose");
            closeOnce = null;
        } else {
            closeOnce = (CloseOnce) obj;
        }
        closeOnce.close();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull InterfaceC1994q owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.$audioAcquired.f48334a) {
            AudioEngine.INSTANCE.release();
            this.$audioAcquired.f48334a = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull InterfaceC1994q owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.$audioAcquired.f48334a) {
            return;
        }
        AudioEngine.INSTANCE.acquire();
        this.$audioAcquired.f48334a = true;
    }
}
