package Rc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class d implements p227mb.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p408wc.b f10992a;

    public d(p408wc.b bVar) {
        this.f10992a = bVar;
    }

    @Override // p227mb.i
    public void a(Activity activity, Bundle bundle) {
        Bundle extras;
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        if (extras.containsKey("notificationResponse") || extras.containsKey("textInputNotificationResponse")) {
            Log.d("ReactNativeJS", "[native] ExpoNotificationLifecycleListener contains an unmarshalled notification response. Skipping.");
        } else {
            Dc.a.a("ExpoNotificationLifeCycleListener.onCreate:", extras);
            this.f10992a.c(extras);
        }
    }

    @Override // p227mb.i
    public boolean onNewIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("notificationResponse") || extras.containsKey("textInputNotificationResponse")) {
                intent.removeExtra("notificationResponse");
                intent.removeExtra("textInputNotificationResponse");
                return super.onNewIntent(intent);
            }
            Dc.a.a("ExpoNotificationLifeCycleListener.onNewIntent:", extras);
            this.f10992a.c(extras);
        }
        return super.onNewIntent(intent);
    }
}
