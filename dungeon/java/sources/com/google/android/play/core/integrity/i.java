package com.google.android.play.core.integrity;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import p459z9.C4391f;

/* JADX INFO: loaded from: classes2.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p459z9.z f37264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f37266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f37267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final C4391f f37268e;

    i(Context context, p459z9.z zVar, p pVar, s sVar) {
        this.f37265b = context.getPackageName();
        this.f37264a = zVar;
        this.f37266c = pVar;
        this.f37267d = sVar;
        if (p459z9.j.a(context)) {
            this.f37268e = new C4391f(context, zVar, "IntegrityService", j.f37269a, p369u9.b.f55036a, null);
        } else {
            zVar.a("Phonesky is not installed.", new Object[0]);
            this.f37268e = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(i iVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", iVar.f37265b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        p459z9.r.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(p459z9.r.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f37268e == null) {
            return Tasks.forException(new a(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof m) {
            }
            this.f37264a.c("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f37268e.t(new f(this, taskCompletionSource, bArrDecode, lA, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new a(-13, e10));
        }
    }
}
