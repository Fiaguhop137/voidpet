package Gc;

import Rb.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import expo.modules.notifications.notifications.model.NotificationBehaviorRecord;
import expo.modules.notifications.service.NotificationsService;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f3984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p245nb.a f3985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Ic.a f3986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f3987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Gc.a f3988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f3989f = new b(this);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NotificationBehaviorRecord f3990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f3991b;

        /* JADX INFO: renamed from: Gc.c$a$a, reason: collision with other inner class name */
        class ResultReceiverC0089a extends ResultReceiver {
            ResultReceiverC0089a(Handler handler) {
                super(handler);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i10, Bundle bundle) {
                super.onReceiveResult(i10, bundle);
                if (i10 == 0) {
                    a.this.f3991b.c();
                } else {
                    a.this.f3991b.reject("ERR_NOTIFICATION_PRESENTATION_FAILED", "Notification presentation failed.", (Exception) bundle.getSerializable("exception"));
                }
            }
        }

        a(NotificationBehaviorRecord notificationBehaviorRecord, u uVar) {
            this.f3990a = notificationBehaviorRecord;
            this.f3991b = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NotificationsService.INSTANCE.q(c.this.f3987d, c.this.f3986c, this.f3990a, new ResultReceiverC0089a(c.this.f3984a));
            c.this.f();
        }
    }

    c(Context context, p245nb.a aVar, Handler handler, Ic.a aVar2, Gc.a aVar3) {
        this.f3987d = context;
        this.f3984a = handler;
        this.f3985b = aVar;
        this.f3986c = aVar2;
        this.f3988e = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f3984a.removeCallbacks(this.f3989f);
        this.f3988e.E(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Bundle bundle = new Bundle();
        bundle.putString("id", g());
        bundle.putBundle("notification", p408wc.c.b(this.f3986c));
        this.f3985b.a("onHandleNotificationTimeout", bundle);
        f();
    }

    String g() {
        return this.f3986c.f().j();
    }

    void i(NotificationBehaviorRecord notificationBehaviorRecord, u uVar) {
        this.f3984a.post(new a(notificationBehaviorRecord, uVar));
    }

    void j() {
        Bundle bundle = new Bundle();
        bundle.putString("id", g());
        bundle.putBundle("notification", p408wc.c.b(this.f3986c));
        this.f3985b.a("onHandleNotification", bundle);
        this.f3984a.postDelayed(this.f3989f, 3000L);
    }

    void k() {
        f();
    }
}
