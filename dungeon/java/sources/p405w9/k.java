package p405w9;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import p423x9.g;
import p423x9.i;
import p423x9.t;

/* JADX INFO: loaded from: classes2.dex */
abstract class k extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final i f56718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final TaskCompletionSource f56719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ m f56720g;

    k(m mVar, i iVar, TaskCompletionSource taskCompletionSource) {
        this.f56720g = mVar;
        this.f56718e = iVar;
        this.f56719f = taskCompletionSource;
    }

    @Override // p423x9.h
    public void j(Bundle bundle) {
        t tVar = this.f56720g.f56723a;
        if (tVar != null) {
            tVar.r(this.f56719f);
        }
        this.f56718e.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
