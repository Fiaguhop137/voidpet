package Rb;

import expo.modules.kotlin.ExpoBridgeModule;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExpoBridgeModule f10943a;

    public /* synthetic */ i(ExpoBridgeModule expoBridgeModule) {
        this.f10943a = expoBridgeModule;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(ExpoBridgeModule.installModules$lambda$0(this.f10943a));
    }
}
