package com.facebook.react.defaults;

import com.facebook.react.AbstractActivityC2237q;
import com.facebook.react.C2240u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends C2240u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29561f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractActivityC2237q activity, String mainComponentName, boolean z10) {
        super(activity, mainComponentName);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mainComponentName, "mainComponentName");
        this.f29561f = z10;
    }

    @Override // com.facebook.react.C2240u
    protected boolean isFabricEnabled() {
        return this.f29561f;
    }
}
