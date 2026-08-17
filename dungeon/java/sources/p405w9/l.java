package p405w9;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import p423x9.i;

/* JADX INFO: loaded from: classes2.dex */
final class l extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f56721h;

    l(m mVar, TaskCompletionSource taskCompletionSource, String str) {
        super(mVar, new i("OnRequestInstallCallback"), taskCompletionSource);
        this.f56721h = str;
    }

    @Override // p405w9.k, p423x9.h
    public final void j(Bundle bundle) {
        super.j(bundle);
        this.f56719f.trySetResult(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
