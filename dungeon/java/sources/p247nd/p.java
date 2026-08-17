package p247nd;

import Ad.r;
import Ed.b;
import android.content.Context;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import p140hd.e;
import p158id.d;
import p265od.g;
import p283pd.k;
import p283pd.q;
import p337sd.j;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f50115w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f50116x = p.class.getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f f50117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final d f50118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f50119v;

    public static final class a {

        /* JADX INFO: renamed from: nd.p$a$a, reason: collision with other inner class name */
        static final class C0595a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f50120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f50121b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f50122c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f50123d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f50125f;

            C0595a(Ed.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f50123d = obj;
                this.f50125f |= Integer.MIN_VALUE;
                return a.this.c(null, null, null, null, null, null, null, null, this);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f50126a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f50128c;

            b(Ed.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f50126a = obj;
                this.f50128c |= Integer.MIN_VALUE;
                return a.this.e(null, null, null, null, null, null, null, null, this);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        public final Object c(Context context, expo.modules.updates.d dVar, g gVar, UpdatesDatabase updatesDatabase, j jVar, File file, d dVar2, r.c cVar, Ed.b bVar) {
            C0595a c0595a;
            Exception exc;
            g gVar2;
            g gVar3;
            UpdatesDatabase updatesDatabase2;
            r.c cVar2 = cVar;
            if (bVar instanceof C0595a) {
                c0595a = (C0595a) bVar;
                int i10 = c0595a.f50125f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0595a.f50125f = i10 - Integer.MIN_VALUE;
                } else {
                    c0595a = new C0595a(bVar);
                }
            } else {
                c0595a = new C0595a(bVar);
            }
            C0595a c0595a2 = c0595a;
            Object objK = c0595a2.f50123d;
            Object objE = Fd.b.e();
            int i11 = c0595a2.f50125f;
            boolean z10 = false;
            if (i11 == 0) {
                r.b(objK);
                if (!dVar.i()) {
                    return kotlin.coroutines.jvm.internal.b.a(false);
                }
                p283pd.d dVarB = p283pd.a.f50902a.b(context, dVar);
                Intrinsics.c(dVarB);
                d dVarC = dVarB.c();
                if (!jVar.d(cVar2, dVarC, dVar2, k.f50942a.f(updatesDatabase, dVar))) {
                    return kotlin.coroutines.jvm.internal.b.a(false);
                }
                dVarC.p(cVar2.b());
                try {
                    p247nd.a aVar = new p247nd.a(context, dVar, gVar, updatesDatabase, file);
                    o oVar = new o();
                    c0595a2.f50120a = gVar;
                    c0595a2.f50121b = updatesDatabase;
                    c0595a2.f50122c = cVar2;
                    c0595a2.f50125f = 1;
                    objK = aVar.k(oVar, c0595a2);
                    if (objK == objE) {
                        return objE;
                    }
                    gVar3 = gVar;
                    updatesDatabase2 = updatesDatabase;
                } catch (Exception e10) {
                    exc = e10;
                    gVar2 = gVar;
                    gVar2.f("Embedded update erroneously null when applying roll back to embedded directive", exc, p265od.b.UpdateFailedToLoad);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.c cVar3 = (r.c) c0595a2.f50122c;
                updatesDatabase2 = (UpdatesDatabase) c0595a2.f50121b;
                gVar3 = (g) c0595a2.f50120a;
                try {
                    r.b(objK);
                    cVar2 = cVar3;
                } catch (Exception e11) {
                    exc = e11;
                    gVar2 = gVar3;
                    gVar2.f("Embedded update erroneously null when applying roll back to embedded directive", exc, p265od.b.UpdateFailedToLoad);
                }
            }
            d dVarB2 = ((g.d) objK).b();
            e eVarO = updatesDatabase2.O();
            Intrinsics.c(dVarB2);
            eVarO.v(dVarB2, cVar2.b());
            z10 = true;
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g.e d(s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new g.e(true);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0016  */
        public final Object e(Context context, expo.modules.updates.d dVar, g gVar, UpdatesDatabase updatesDatabase, j jVar, File file, d dVar2, g.d dVar3, Ed.b bVar) {
            b bVar2;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f50128c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar2.f50128c = i10 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            b bVar3 = bVar2;
            Object objC = bVar3.f50126a;
            Object objE = Fd.b.e();
            int i11 = bVar3.f50128c;
            if (i11 == 0) {
                r.b(objC);
                d dVarB = dVar3.b();
                r rVarA = dVar3.a();
                if (rVarA == null || !(rVarA instanceof r.c)) {
                    return new m(dVarB, false);
                }
                bVar3.f50128c = 1;
                objC = c(context, dVar, gVar, updatesDatabase, jVar, file, dVar2, (r.c) rVarA, bVar3);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objC);
            }
            return new m(null, ((Boolean) objC).booleanValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(Context context, expo.modules.updates.d configuration, g logger, UpdatesDatabase database, f fileDownloader, File updatesDirectory, d dVar) {
        this(context, configuration, logger, database, fileDownloader, updatesDirectory, dVar, new h());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, expo.modules.updates.d configuration, g logger, UpdatesDatabase database, f mFileDownloader, File updatesDirectory, d dVar, h loaderFiles) {
        super(context, configuration, logger, database, updatesDirectory, loaderFiles, null, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(mFileDownloader, "mFileDownloader");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
        Intrinsics.checkNotNullParameter(loaderFiles, "loaderFiles");
        this.f50117t = mFileDownloader;
        this.f50118u = dVar;
        this.f50119v = loaderFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(p pVar, p158id.a aVar, double d10) {
        pVar.e(aVar, d10);
        return Unit.f48228a;
    }

    @Override // p247nd.g
    protected Object l(p158id.a aVar, File file, expo.modules.updates.d dVar, d dVar2, d dVar3, b bVar) throws JSONException {
        return this.f50117t.h(aVar, file, f.f49964f.a(this.f50118u, dVar3, dVar2), new n(this, aVar), bVar);
    }

    @Override // p247nd.g
    protected Object m(UpdatesDatabase updatesDatabase, expo.modules.updates.d dVar, b bVar) {
        q qVarE = this.f50119v.e(h(), dVar);
        return this.f50117t.n(f.f49964f.b(updatesDatabase, dVar, this.f50118u, qVarE != null ? qVarE.c() : null), bVar);
    }
}
