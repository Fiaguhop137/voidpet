package com.swmansion.reanimated;

import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements UIBlock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReanimatedModule f38920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f38921b;

    public /* synthetic */ e(ReanimatedModule reanimatedModule, ArrayList arrayList) {
        this.f38920a = reanimatedModule;
        this.f38921b = arrayList;
    }

    @Override // com.facebook.react.fabric.interop.UIBlock
    public final void execute(UIBlockViewResolver uIBlockViewResolver) {
        this.f38920a.lambda$willDispatchViewUpdates$0(this.f38921b, uIBlockViewResolver);
    }
}
