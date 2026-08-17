package p301qd;

import Ad.n;
import Ad.r;
import android.content.Context;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p247nd.f;
import p247nd.m;
import p247nd.p;
import p247nd.s;
import p247nd.t;
import p265od.g;
import p283pd.q;
import p337sd.j;
import p355td.e;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f51793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f51794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f51795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p122gd.c f51796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f51797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f51798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f51799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p158id.d f51800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Function1 f51801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f51802j;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f51803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f51804b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f51806d;

        a(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f51804b = obj;
            this.f51806d |= Integer.MIN_VALUE;
            return d.this.g(null, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f51807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f51808b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f51810d;

        b(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f51808b = obj;
            this.f51810d |= Integer.MIN_VALUE;
            return d.this.b(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f51811a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f51813c;

        c(Ed.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f51811a = obj;
            this.f51813c |= Integer.MIN_VALUE;
            return d.this.h(null, null, this);
        }
    }

    public d(Context context, expo.modules.updates.d updatesConfiguration, g logger, p122gd.c databaseHolder, File updatesDirectory, f fileDownloader, j selectionPolicy, p158id.d dVar, Function1 callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updatesConfiguration, "updatesConfiguration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(databaseHolder, "databaseHolder");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(selectionPolicy, "selectionPolicy");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f51793a = context;
        this.f51794b = updatesConfiguration;
        this.f51795c = logger;
        this.f51796d = databaseHolder;
        this.f51797e = updatesDirectory;
        this.f51798f = fileDownloader;
        this.f51799g = selectionPolicy;
        this.f51800h = dVar;
        this.f51801i = callback;
        this.f51802j = "timer-fetch-update";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(nd.g.d dVar, j.a aVar, Ed.b bVar) {
        a aVar2;
        if (bVar instanceof a) {
            aVar2 = (a) bVar;
            int i10 = aVar2.f51806d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f51806d = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(bVar);
            }
        } else {
            aVar2 = new a(bVar);
        }
        a aVar3 = aVar2;
        Object objE = aVar3.f51804b;
        Object objE2 = Fd.b.e();
        int i11 = aVar3.f51806d;
        if (i11 == 0) {
            r.b(objE);
            p.a aVar4 = p.f50115w;
            Context context = this.f51793a;
            expo.modules.updates.d dVar2 = this.f51794b;
            g gVar = this.f51795c;
            UpdatesDatabase updatesDatabaseC = this.f51796d.c();
            j jVar = this.f51799g;
            File file = this.f51797e;
            p158id.d dVar3 = this.f51800h;
            aVar3.f51803a = aVar;
            aVar3.f51806d = 1;
            objE = aVar4.e(context, dVar2, gVar, updatesDatabaseC, jVar, file, dVar3, dVar, aVar3);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (j.a) aVar3.f51803a;
            r.b(objE);
        }
        m mVar = (m) objE;
        p158id.d dVarA = mVar.a();
        if (mVar.b()) {
            aVar.a(new e.h());
            this.f51801i.invoke(new expo.modules.updates.c.b.C0469c());
        } else if (dVarA == null) {
            aVar.a(new e.g());
            this.f51801i.invoke(new expo.modules.updates.c.b.C0468b());
        } else {
            aVar.a(new e.i(dVarA.i()));
            this.f51801i.invoke(new expo.modules.updates.c.b.e(dVarA));
        }
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(UpdatesDatabase updatesDatabase, j.a aVar, Ed.b bVar) throws Exception {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f51813c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f51813c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objK = cVar.f51811a;
        Object objE = Fd.b.e();
        int i11 = cVar.f51813c;
        try {
            if (i11 == 0) {
                r.b(objK);
                p pVar = new p(this.f51793a, this.f51794b, this.f51795c, updatesDatabase, this.f51798f, this.f51797e, this.f51800h);
                pVar.q(new p301qd.b(aVar));
                p301qd.c cVar2 = new p301qd.c(this);
                cVar.f51813c = 1;
                objK = pVar.k(cVar2, cVar);
                if (objK == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objK);
            }
            return (nd.g.d) objK;
        } catch (CancellationException e10) {
            g.k(this.f51795c, "Remote loader cancelled during fetch update procedure", null, 2, null);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(j.a aVar, double d10) {
        aVar.a(new e.k(d10));
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nd.g.e j(d dVar, s updateResponse) {
        q qVarA;
        Intrinsics.checkNotNullParameter(updateResponse, "updateResponse");
        t.a aVarA = updateResponse.a();
        p247nd.r rVarA = aVarA != null ? aVarA.a() : null;
        if (rVarA != null) {
            if ((rVarA instanceof nd.r.c) || (rVarA instanceof nd.r.b)) {
                return new nd.g.e(false);
            }
            throw new n();
        }
        t.b bVarB = updateResponse.b();
        if (bVarB == null || (qVarA = bVarB.a()) == null) {
            return new nd.g.e(false);
        }
        j jVar = dVar.f51799g;
        p158id.d dVarC = qVarA.c();
        p158id.d dVar2 = dVar.f51800h;
        p283pd.n nVarC = updateResponse.c();
        return new nd.g.e(jVar.c(dVarC, dVar2, nVarC != null ? nVarC.d() : null));
    }

    @Override // p301qd.j
    public String a() {
        return this.f51802j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (g((nd.g.d) r8, r7, r0) == r1) goto L30;
     */
    @Override // p301qd.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(qd.j.a r7, Ed.b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qd.d.b
            if (r0 == 0) goto L13
            r0 = r8
            qd.d$b r0 = (qd.d.b) r0
            int r1 = r0.f51810d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51810d = r1
            goto L18
        L13:
            qd.d$b r0 = new qd.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f51808b
            java.lang.Object r1 = Fd.b.e()
            int r2 = r0.f51810d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f51807a
            qd.j$a r7 = (qd.j.a) r7
            Ad.r.b(r8)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            goto L71
        L30:
            r0 = move-exception
            r8 = r0
            goto Laa
        L34:
            r0 = move-exception
            r8 = r0
            r2 = r8
            goto L75
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f51807a
            qd.j$a r7 = (qd.j.a) r7
            Ad.r.b(r8)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            goto L64
        L48:
            Ad.r.b(r8)
            td.e$f r8 = new td.e$f
            r8.<init>()
            r7.a(r8)
            gd.c r8 = r6.f51796d
            expo.modules.updates.db.UpdatesDatabase r8 = r8.c()
            r0.f51807a = r7     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            r0.f51810d = r4     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            java.lang.Object r8 = r6.h(r8, r7, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            if (r8 != r1) goto L64
            goto L70
        L64:
            nd.g$d r8 = (nd.g.d) r8     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            r0.f51807a = r7     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            r0.f51810d = r3     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            java.lang.Object r8 = r6.g(r8, r7, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L34
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            r7.c()
            goto La7
        L75:
            od.g r0 = r6.f51795c     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = "Failed to download new update"
            r4 = 4
            r5 = 0
            r3 = 0
            p265od.g.h(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L30
            td.e$j r8 = new td.e$j     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Failed to download new update: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L30
            r1.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L30
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r7.a(r8)     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.functions.Function1 r8 = r6.f51801i     // Catch: java.lang.Throwable -> L30
            expo.modules.updates.c$b$a r0 = new expo.modules.updates.c$b$a     // Catch: java.lang.Throwable -> L30
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L30
            r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            goto L71
        La7:
            kotlin.Unit r7 = kotlin.Unit.f48228a
            return r7
        Laa:
            r7.c()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p301qd.d.b(qd.j$a, Ed.b):java.lang.Object");
    }
}
