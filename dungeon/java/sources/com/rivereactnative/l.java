package com.rivereactnative;

import androidx.lifecycle.InterfaceC1994q;
import app.rive.runtime.kotlin.RiveViewLifecycleObserver;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends RiveViewLifecycleObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List dependencies) {
        super(dependencies);
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
    }

    public final void a() {
        Iterator<T> it = getDependencies().iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        getDependencies().clear();
    }

    @Override // app.rive.runtime.kotlin.RiveViewLifecycleObserver, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC1994q owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        owner.y().d(this);
    }
}
