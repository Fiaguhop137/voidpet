package com.google.firebase.concurrent;

import K9.C1135c;
import K9.D;
import K9.InterfaceC1136d;
import K9.w;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final w f37361a = new w(new L9.b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w f37362b = new w(new L9.c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final w f37363c = new w(new L9.d());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final w f37364d = new w(new L9.e());

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC1136d interfaceC1136d) {
        return (ScheduledExecutorService) f37362b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC1136d interfaceC1136d) {
        return (ScheduledExecutorService) f37363c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC1136d interfaceC1136d) {
        return (ScheduledExecutorService) f37361a.get();
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f37364d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C1135c.d(D.a(J9.a.class, ScheduledExecutorService.class), D.a(J9.a.class, ExecutorService.class), D.a(J9.a.class, Executor.class)).f(new L9.f()).d(), C1135c.d(D.a(J9.b.class, ScheduledExecutorService.class), D.a(J9.b.class, ExecutorService.class), D.a(J9.b.class, Executor.class)).f(new L9.g()).d(), C1135c.d(D.a(J9.c.class, ScheduledExecutorService.class), D.a(J9.c.class, ExecutorService.class), D.a(J9.c.class, Executor.class)).f(new L9.h()).d(), C1135c.c(D.a(J9.d.class, Executor.class)).f(new L9.i()).d());
    }
}
