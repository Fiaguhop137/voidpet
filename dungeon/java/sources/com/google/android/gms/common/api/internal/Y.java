package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C2335d;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class Y extends AbstractC2326t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2326t.a f31795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y(AbstractC2326t.a aVar, C2335d[] c2335dArr, boolean z10, int i10) {
        super(c2335dArr, z10, i10);
        this.f31795d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2326t
    protected final void b(h8.a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f31795d.f31857a.accept(bVar, taskCompletionSource);
    }
}
