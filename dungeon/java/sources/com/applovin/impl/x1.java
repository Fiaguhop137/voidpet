package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p184k4.C0;
import p184k4.D0;
import p184k4.E0;
import p184k4.F0;

/* JADX INFO: loaded from: classes.dex */
public final class x1 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f28399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f28400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f28402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f28403e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f28404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f28405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f28406h;

    public x1(p pVar) {
        ArrayList arrayList = new ArrayList();
        this.f28404f = arrayList;
        this.f28405g = new HashSet();
        this.f28406h = new ArrayList();
        if (pVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f28399a = pVar;
        this.f28400b = pVar.g();
        int iIntValue = ((Integer) pVar.l().a(m2.f28147N)).intValue();
        this.f28401c = iIntValue;
        if (!((Boolean) pVar.l().a(m2.f28141K)).booleanValue()) {
            this.f28402d = null;
            return;
        }
        y1 y1Var = new y1(this, pVar);
        this.f28402d = y1Var;
        ArrayList arrayList2 = new ArrayList();
        z0 z0VarF = pVar.f();
        File fileA = z0VarF.a(false, p.f28247J);
        if (fileA == null || !fileA.exists() || fileA.isDirectory()) {
            p1.c("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.", null);
        } else {
            File fileA2 = z0VarF.a(true, p.f28247J);
            String strC = z0VarF.c(fileA2);
            if (TextUtils.isEmpty(strC)) {
                p1.c("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.", null);
            } else {
                try {
                    JSONArray jSONArray = new JSONObject(strC).getJSONArray("pb");
                    p1 p1Var = y1Var.f28417h;
                    if (p1.f28289b) {
                        p1Var.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
                    }
                    arrayList2.ensureCapacity(Math.max(1, jSONArray.length()));
                    Integer num = (Integer) pVar.l().a(m2.f28149O);
                    for (int i10 = 0; i10 < jSONArray.length() && arrayList2.size() < iIntValue; i10++) {
                        try {
                            z1 z1Var = new z1(jSONArray.getJSONObject(i10));
                            if (z1Var.f28440n < num.intValue()) {
                                arrayList2.add(z1Var);
                            } else {
                                p1.c("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + z1Var, null);
                            }
                        } catch (Throwable th) {
                            p1.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                        }
                    }
                    p1 p1Var2 = y1Var.f28417h;
                    if (p1.f28289b) {
                        p1Var2.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList2.size() + " postback(s).");
                    }
                } catch (Throwable th2) {
                    p1.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                    if (((Boolean) y1Var.f28321a.l().a(m2.f28151P)).booleanValue()) {
                        p1 p1Var3 = z0VarF.f28424b;
                        if (p1.f28289b) {
                            p1Var3.a("FileManager", "Removing file " + fileA2.getName() + " for source removeAfterDeserializationFail.");
                        }
                        try {
                            if (!fileA2.delete()) {
                                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", fileA2.getAbsolutePath());
                                mapHashMap.put("details", z0.a(fileA2));
                                u0 u0VarE = z0VarF.f28423a.e();
                                b1 b1Var = b1.f27954l;
                                u0VarE.getClass();
                                mapHashMap.put("source", "removeAfterDeserializationFail");
                                u0VarE.b(b1Var, mapHashMap);
                            }
                        } catch (Throwable th3) {
                            p1 p1Var4 = z0VarF.f28424b;
                            if (p1.f28289b) {
                                p1Var4.a("FileManager", "Failed to remove file " + fileA2.getName() + " from filesystem after failed operation.", th3);
                            }
                            z0VarF.f28423a.e().a("FileManager", "removeAfterDeserializationFail", th3);
                        }
                    }
                }
                y1Var.f28419j = arrayList2.isEmpty();
            }
        }
        arrayList.addAll(arrayList2);
        n.a(new IntentFilter("com.applovin.application_paused"), this);
    }

    public static void a(c2 c2Var, String str) {
        if (c2Var == null) {
            return;
        }
        i3.a(false, new F0(c2Var, str));
    }

    public static void a(c2 c2Var, String str, int i10) {
        if (c2Var == null) {
            return;
        }
        i3.a(false, new D0(c2Var, str, i10));
    }

    public static /* synthetic */ void b(c2 c2Var, String str) {
        try {
            c2Var.a(str);
        } catch (Throwable th) {
            p1.c("PersistentPostbackManager", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
        }
    }

    public static /* synthetic */ void b(c2 c2Var, String str, int i10) {
        try {
            c2Var.a(str, i10);
        } catch (Throwable th) {
            p1.c("PersistentPostbackManager", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i10 + "):", th);
        }
    }

    public final void a() {
        synchronized (this.f28403e) {
            this.f28404f.clear();
            this.f28406h.clear();
        }
        this.f28399a.n().a(this.f28402d, 0L);
    }

    @Override // com.applovin.impl.l
    public final void a(Intent intent) {
        this.f28399a.n().a(this.f28402d, 0L);
    }

    public final void a(z1 z1Var) {
        synchronized (this.f28403e) {
            this.f28405g.remove(z1Var);
            this.f28404f.remove(z1Var);
        }
        p1 p1Var = this.f28400b;
        if (p1.f28289b) {
            p1Var.a("PersistentPostbackManager", "Dequeued postback: " + z1Var);
        }
    }

    public final void a(z1 z1Var, c2 c2Var) {
        p1 p1Var = this.f28400b;
        if (p1.f28289b) {
            p1Var.a("PersistentPostbackManager", "Preparing to submit postback: " + z1Var);
        }
        if (TextUtils.isEmpty(z1Var.f28429c)) {
            p1 p1Var2 = this.f28400b;
            if (p1.f28289b) {
                p1Var2.a("PersistentPostbackManager", "Skipping empty postback dispatch...", null);
                return;
            }
            return;
        }
        synchronized (this.f28403e) {
            try {
                if (this.f28405g.contains(z1Var)) {
                    p1 p1Var3 = this.f28400b;
                    if (p1.f28289b) {
                        p1Var3.a("PersistentPostbackManager", "Skipping in progress postback: " + z1Var.f28429c);
                    }
                    return;
                }
                z1Var.f28440n++;
                Integer num = (Integer) this.f28399a.l().a(m2.f28149O);
                if (z1Var.f28440n > num.intValue()) {
                    p1 p1Var4 = this.f28400b;
                    if (p1.f28289b) {
                        p1Var4.d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + z1Var, null);
                    }
                    a(z1Var);
                    return;
                }
                synchronized (this.f28403e) {
                    this.f28405g.add(z1Var);
                }
                JSONObject jSONObject = z1Var.f28433g != null ? new JSONObject(z1Var.f28433g) : null;
                a2 a2Var = new a2(this.f28399a);
                a2Var.f27999b = z1Var.f28429c;
                a2Var.f28000c = z1Var.f28430d;
                a2Var.f28001d = z1Var.f28431e;
                a2Var.f27998a = z1Var.f28428b;
                a2Var.f28002e = z1Var.f28432f;
                a2Var.f28003f = jSONObject;
                a2Var.f28012o = z1Var.f28436j;
                a2Var.f28010m = z1Var.f28435i;
                a2Var.f28013p = z1Var.f28434h;
                a2Var.f27933q = z1Var.f28438l;
                b2 b2Var = new b2(a2Var);
                p1 p1Var5 = this.f28400b;
                if (p1.f28289b) {
                    p1Var5.a("PersistentPostbackManager", "Submitting postback: " + z1Var);
                }
                d2 d2VarI = this.f28399a.i();
                d2VarI.f27974a.n().a(new u2(b2Var, d2VarI.f27974a, new w1(this, z1Var, c2Var)), 0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        this.f28399a.n().a(new g3(this.f28399a, false, "runPostbackTask", new C0(this)), 0L);
    }

    public final void b(z1 z1Var) {
        synchronized (this.f28403e) {
            while (this.f28404f.size() > this.f28401c) {
                try {
                    this.f28404f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f28404f.add(z1Var);
        }
        p1 p1Var = this.f28400b;
        if (p1.f28289b) {
            p1Var.a("PersistentPostbackManager", "Enqueued postback: " + z1Var);
        }
    }

    public final /* synthetic */ void b(z1 z1Var, c2 c2Var) {
        synchronized (this.f28403e) {
            b(z1Var);
            a(z1Var, c2Var);
        }
    }

    public final void c() {
        synchronized (this.f28403e) {
            try {
                Iterator it = new ArrayList(this.f28404f).iterator();
                while (it.hasNext()) {
                    a((z1) it.next(), (c2) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(z1 z1Var) {
        if (TextUtils.isEmpty(z1Var.f28429c)) {
            p1 p1Var = this.f28400b;
            if (p1.f28289b) {
                p1Var.a("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...", null);
                return;
            }
            return;
        }
        Map map = CollectionUtils.map(z1Var.f28431e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        z1Var.f28431e = map;
        E0 e10 = new E0(this, z1Var, null);
        Handler handler = i3.f28069a;
        boolean z10 = Looper.myLooper() == Looper.getMainLooper();
        boolean z11 = z1Var.f28437k;
        if (z10) {
            this.f28399a.n().a(new g3(this.f28399a, z11, "runPostbackTask", e10), 0L);
        } else {
            e10.run();
        }
    }
}
