package com.google.android.gms.tasks;

import R8.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzy implements OnCompleteListener {
    public final /* synthetic */ a zza;
    public final /* synthetic */ TaskCompletionSource zzb;
    public final /* synthetic */ zzb zzc;

    public /* synthetic */ zzy(a aVar, TaskCompletionSource taskCompletionSource, zzb zzbVar) {
        this.zza = aVar;
        this.zzb = taskCompletionSource;
        this.zzc = zzbVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zza.removeCallbacksAndMessages(null);
        TaskCompletionSource taskCompletionSource = this.zzb;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else {
            if (task.isCanceled()) {
                this.zzc.zza();
                return;
            }
            Exception exception = task.getException();
            exception.getClass();
            taskCompletionSource.trySetException(exception);
        }
    }
}
