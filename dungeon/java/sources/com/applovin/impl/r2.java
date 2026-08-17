package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class r2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f28323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f28324d = p.f28247J;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28325e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f28326f;

    public r2(String str, p pVar, boolean z10) {
        this.f28322b = str;
        this.f28321a = pVar;
        this.f28323c = pVar.g();
        this.f28326f = z10;
    }

    public final void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f28325e)) {
            mapHashMap.put("details", this.f28325e);
        }
        u0 u0VarE = this.f28321a.e();
        b1 b1Var = b1.f27956n;
        String str = this.f28322b;
        u0VarE.getClass();
        mapHashMap.put("source", str);
        u0VarE.b(b1Var, mapHashMap);
        p1 p1Var = this.f28323c;
        if (p1.f28289b) {
            p1Var.d(this.f28322b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds", null);
        }
    }

    public final ScheduledFuture b(Thread thread, long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f28321a.n().f27977c.schedule(new g3(this.f28321a, false, "timeout:" + this.f28322b, new p184k4.s0(this, thread, j10)), j10, TimeUnit.MILLISECONDS);
    }
}
