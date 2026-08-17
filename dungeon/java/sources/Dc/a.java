package Dc;

import android.os.Bundle;
import com.google.firebase.messaging.T;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2401a = new a();

    private a() {
    }

    public static final void a(String caller, Bundle bundleToLog) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(bundleToLog, "bundleToLog");
    }

    public final void b(String caller, Ic.a notification) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(notification, "notification");
    }

    public final void c(String caller, T message) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
