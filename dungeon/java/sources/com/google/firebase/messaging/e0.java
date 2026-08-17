package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f37589d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f37590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a0 f37591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f37592c;

    private e0(SharedPreferences sharedPreferences, Executor executor) {
        this.f37592c = executor;
        this.f37590a = sharedPreferences;
    }

    public static synchronized e0 a(Context context, Executor executor) {
        e0 e0Var;
        try {
            WeakReference weakReference = f37589d;
            e0Var = weakReference != null ? (e0) weakReference.get() : null;
            if (e0Var == null) {
                e0Var = new e0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                e0Var.c();
                f37589d = new WeakReference(e0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e0Var;
    }

    private synchronized void c() {
        this.f37591b = a0.c(this.f37590a, "topic_operation_queue", ",", this.f37592c);
    }

    synchronized d0 b() {
        return d0.a(this.f37591b.e());
    }

    synchronized boolean d(d0 d0Var) {
        return this.f37591b.f(d0Var.e());
    }
}
