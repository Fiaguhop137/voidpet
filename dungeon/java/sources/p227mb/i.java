package p227mb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface i {
    void a(Activity activity, Bundle bundle);

    default void b(Activity activity) {
    }

    default boolean c() {
        return false;
    }

    default void d(Activity activity) {
    }

    default void e(Activity activity) {
    }

    default void f(Activity activity) {
    }

    default boolean onNewIntent(Intent intent) {
        return false;
    }

    default void onUserLeaveHint(Activity activity) {
    }
}
