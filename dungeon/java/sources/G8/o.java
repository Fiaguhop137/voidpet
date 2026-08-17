package G8;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2327u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class o extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3961e;

    o(p pVar, TaskCompletionSource taskCompletionSource) {
        this.f3961e = taskCompletionSource;
    }

    @Override // G8.f
    public final void P(Status status, zzc zzcVar) {
        AbstractC2327u.a(status, zzcVar != null ? new AppSetIdInfo(zzcVar.zzb(), zzcVar.zza()) : null, this.f3961e);
    }
}
