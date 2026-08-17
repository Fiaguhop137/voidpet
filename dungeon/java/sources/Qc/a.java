package Qc;

import expo.modules.notifications.service.ExpoFirebaseMessagingService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExpoFirebaseMessagingService f9565a;

    public /* synthetic */ a(ExpoFirebaseMessagingService expoFirebaseMessagingService) {
        this.f9565a = expoFirebaseMessagingService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ExpoFirebaseMessagingService.l(this.f9565a);
    }
}
