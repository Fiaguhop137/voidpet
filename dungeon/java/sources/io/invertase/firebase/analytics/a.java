package io.invertase.firebase.analytics;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f44146a;

    public /* synthetic */ a(Promise promise) {
        this.f44146a = promise;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        ReactNativeFirebaseAnalyticsModule.j(this.f44146a, task);
    }
}
