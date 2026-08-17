package com.google.firebase.installations;

import K9.w;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class c implements X9.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f37422m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f37423n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.e f37424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z9.c f37425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y9.c f37426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f37427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f37428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X9.g f37429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f37430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f37431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f37432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f37433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f37434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f37435l;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f37436a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f37436a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f37438b;

        static {
            int[] iArr = new int[Z9.f.b.values().length];
            f37438b = iArr;
            try {
                iArr[Z9.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37438b[Z9.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37438b[Z9.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Z9.d.b.values().length];
            f37437a = iArr2;
            try {
                iArr2[Z9.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37437a[Z9.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(H9.e eVar, W9.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new Z9.c(eVar.l(), bVar), new Y9.c(eVar), i.c(), new w(new X9.a(eVar)), new X9.g());
    }

    c(ExecutorService executorService, Executor executor, H9.e eVar, Z9.c cVar, Y9.c cVar2, i iVar, w wVar, X9.g gVar) {
        this.f37430g = new Object();
        this.f37434k = new HashSet();
        this.f37435l = new ArrayList();
        this.f37424a = eVar;
        this.f37425b = cVar;
        this.f37426c = cVar2;
        this.f37427d = iVar;
        this.f37428e = wVar;
        this.f37429f = gVar;
        this.f37431h = executorService;
        this.f37432i = executor;
    }

    private synchronized void A(String str) {
        this.f37433j = str;
    }

    private synchronized void B(Y9.d dVar, Y9.d dVar2) {
        if (this.f37434k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f37434k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    public static /* synthetic */ Y9.b e(H9.e eVar) {
        return new Y9.b(eVar);
    }

    private Task f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(this.f37427d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new f(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(h hVar) {
        synchronized (this.f37430g) {
            this.f37435l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        Y9.d dVarX;
        Y9.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarX = x(dVarR);
            } else {
                if (!z10 && !this.f37427d.f(dVarR)) {
                    return;
                }
                dVarX = k(dVarR);
            }
            u(dVarX);
            B(dVarR, dVarX);
            if (dVarX.k()) {
                A(dVarX.d());
            }
            if (dVarX.i()) {
                y(new d(d.a.BAD_CONFIG));
            } else if (dVarX.j()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(dVarX);
            }
        } catch (d e10) {
            y(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean z10) {
        Y9.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f37432i.execute(new X9.c(this, z10));
    }

    private Y9.d k(Y9.d dVar) throws d {
        Z9.f fVarE = this.f37425b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f37438b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f37427d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    private synchronized String n() {
        return this.f37433j;
    }

    private Y9.b o() {
        return (Y9.b) this.f37428e.get();
    }

    public static c p() {
        return q(H9.e.n());
    }

    public static c q(H9.e eVar) {
        r.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.j(X9.e.class);
    }

    private Y9.d r() {
        Y9.d dVarD;
        synchronized (f37422m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f37424a.l(), "generatefid.lock");
                try {
                    dVarD = this.f37426c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    private Y9.d s() {
        Y9.d dVarD;
        synchronized (f37422m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f37424a.l(), "generatefid.lock");
                try {
                    dVarD = this.f37426c.d();
                    if (dVarD.j()) {
                        dVarD = this.f37426c.b(dVarD.t(w(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    private void u(Y9.d dVar) {
        synchronized (f37422m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f37424a.l(), "generatefid.lock");
                try {
                    this.f37426c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void v() {
        r.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String w(Y9.d dVar) {
        if ((!this.f37424a.p().equals("CHIME_ANDROID_SDK") && !this.f37424a.x()) || !dVar.m()) {
            return this.f37429f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f37429f.a() : strF;
    }

    private Y9.d x(Y9.d dVar) throws d {
        Z9.d dVarD = this.f37425b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.f37437a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f37427d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void y(Exception exc) {
        synchronized (this.f37430g) {
            try {
                Iterator it = this.f37435l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void z(Y9.d dVar) {
        synchronized (this.f37430g) {
            try {
                Iterator it = this.f37435l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X9.e
    public Task a(boolean z10) {
        v();
        Task taskF = f();
        this.f37431h.execute(new X9.d(this, z10));
        return taskF;
    }

    @Override // X9.e
    public Task getId() {
        v();
        String strN = n();
        if (strN != null) {
            return Tasks.forResult(strN);
        }
        Task taskG = g();
        this.f37431h.execute(new X9.b(this));
        return taskG;
    }

    String l() {
        return this.f37424a.q().b();
    }

    String m() {
        return this.f37424a.q().c();
    }

    String t() {
        return this.f37424a.q().g();
    }
}
