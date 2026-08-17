package Qc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import expo.modules.notifications.service.NotificationsService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f9566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f9567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotificationsService f9568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f9569d;

    public /* synthetic */ b(Intent intent, BroadcastReceiver.PendingResult pendingResult, NotificationsService notificationsService, Context context) {
        this.f9566a = intent;
        this.f9567b = pendingResult;
        this.f9568c = notificationsService;
        this.f9569d = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return NotificationsService.q(this.f9566a, this.f9567b, this.f9568c, this.f9569d);
    }
}
