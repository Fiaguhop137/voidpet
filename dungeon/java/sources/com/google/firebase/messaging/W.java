package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f37531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f37532b = new C4101a();

    interface a {
        Task start();
    }

    W(Executor executor) {
        this.f37531a = executor;
    }

    public static /* synthetic */ Task a(W w10, String str, Task task) {
        synchronized (w10) {
            w10.f37532b.remove(str);
        }
        return task;
    }

    synchronized Task b(String str, a aVar) {
        Task task = (Task) this.f37532b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskContinueWithTask = aVar.start().continueWithTask(this.f37531a, new V(this, str));
        this.f37532b.put(str, taskContinueWithTask);
        return taskContinueWithTask;
    }
}
