package com.google.android.gms.tasks;

import R8.a;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        r.j();
        r.h();
        r.m(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task, long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        r.j();
        r.h();
        r.m(task, "Task must not be null");
        r.m(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        if (zzadVar.zzb(j10, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        r.m(executor, "Executor must not be null");
        r.m(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forException(@NonNull Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    @NonNull
    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzwVar = new zzw();
        zzaf zzafVar = new zzaf(collection.size(), zzwVar);
        Iterator<? extends Task<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            zzb(it2.next(), zzafVar);
        }
        return zzwVar;
    }

    @NonNull
    public static Task<Void> whenAll(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(null) : whenAll(Arrays.asList(taskArr));
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        return whenAllComplete(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, Collection<? extends Task<?>> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.EMPTY_LIST) : whenAll(collection).continueWithTask(executor, new zzab(collection));
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@NonNull Executor executor, Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.EMPTY_LIST) : whenAllComplete(executor, Arrays.asList(taskArr));
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.EMPTY_LIST) : whenAllComplete(Arrays.asList(taskArr));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> collection) {
        return whenAllSuccess(TaskExecutors.MAIN_THREAD, collection);
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, Collection<? extends Task> collection) {
        return (collection == null || collection.isEmpty()) ? forResult(Collections.EMPTY_LIST) : (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(executor, new zzaa(collection));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@NonNull Executor executor, Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.EMPTY_LIST) : whenAllSuccess(executor, Arrays.asList(taskArr));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? forResult(Collections.EMPTY_LIST) : whenAllSuccess(Arrays.asList(taskArr));
    }

    @NonNull
    public static <T> Task<T> withTimeout(@NonNull Task<T> task, long j10, @NonNull TimeUnit timeUnit) {
        r.m(task, "Task must not be null");
        r.b(j10 > 0, "Timeout must be positive");
        r.m(timeUnit, "TimeUnit must not be null");
        zzb zzbVar = new zzb();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        a aVar = new a(Looper.getMainLooper());
        aVar.postDelayed(new zzx(taskCompletionSource), timeUnit.toMillis(j10));
        task.addOnCompleteListener(new zzy(aVar, taskCompletionSource, zzbVar));
        return taskCompletionSource.getTask();
    }

    private static Object zza(@NonNull Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzae zzaeVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzaeVar);
        task.addOnFailureListener(executor, zzaeVar);
        task.addOnCanceledListener(executor, zzaeVar);
    }
}
