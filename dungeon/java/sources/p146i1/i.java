package p146i1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p020b1.u;
import p323s.C4125z;
import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C4125z f43527a = new C4125z(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f43528b = k.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f43529c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final f0 f43530d = new f0();

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f43532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f43533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f43534d;

        a(String str, Context context, f fVar, int i10) {
            this.f43531a = str;
            this.f43532b = context;
            this.f43533c = fVar;
            this.f43534d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return i.c(this.f43531a, this.f43532b, h.a(new Object[]{this.f43533c}), this.f43534d);
        }
    }

    class b implements p199l1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p146i1.a f43535a;

        b(p146i1.a aVar) {
            this.f43535a = aVar;
        }

        @Override // p199l1.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f43535a.b(eVar);
        }
    }

    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f43537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f43538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f43539d;

        c(String str, Context context, List list, int i10) {
            this.f43536a = str;
            this.f43537b = context;
            this.f43538c = list;
            this.f43539d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.f43536a, this.f43537b, this.f43538c, this.f43539d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements p199l1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43540a;

        d(String str) {
            this.f43540a = str;
        }

        @Override // p199l1.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.f43529c) {
                try {
                    f0 f0Var = i.f43530d;
                    ArrayList arrayList = (ArrayList) f0Var.get(this.f43540a);
                    if (arrayList == null) {
                        return;
                    }
                    f0Var.remove(this.f43540a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((p199l1.b) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f43541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f43542b;

        e(int i10) {
            this.f43541a = null;
            this.f43542b = i10;
        }

        e(Typeface typeface) {
            this.f43541a = typeface;
            this.f43542b = 0;
        }

        boolean a() {
            return this.f43542b == 0;
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((f) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    private static int b(j.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        j.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (j.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, List list, int i10) {
        p381v3.a.c("getFontSync");
        try {
            C4125z c4125z = f43527a;
            Typeface typeface = (Typeface) c4125z.c(str);
            if (typeface != null) {
                e eVar = new e(typeface);
                p381v3.a.f();
                return eVar;
            }
            try {
                j.a aVarE = p146i1.e.e(context, list, null);
                int iB = b(aVarE);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    p381v3.a.f();
                    return eVar2;
                }
                Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? u.b(context, null, aVarE.c(), i10) : u.c(context, null, aVarE.d(), i10);
                if (typefaceB == null) {
                    e eVar3 = new e(-3);
                    p381v3.a.f();
                    return eVar3;
                }
                c4125z.d(str, typefaceB);
                e eVar4 = new e(typefaceB);
                p381v3.a.f();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                p381v3.a.f();
                return eVar5;
            }
        } catch (Throwable th) {
            p381v3.a.f();
            throw th;
        }
    }

    static Typeface d(Context context, List list, int i10, Executor executor, p146i1.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f43527a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f43529c) {
            try {
                f0 f0Var = f43530d;
                ArrayList arrayList = (ArrayList) f0Var.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                f0Var.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f43528b;
                }
                k.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, f fVar, p146i1.a aVar, int i10, int i11) {
        String strA = a(h.a(new Object[]{fVar}), i10);
        Typeface typeface = (Typeface) f43527a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, h.a(new Object[]{fVar}), i10);
            aVar.b(eVarC);
            return eVarC.f43541a;
        }
        try {
            e eVar = (e) k.d(f43528b, new a(strA, context, fVar, i10), i11);
            aVar.b(eVar);
            return eVar.f43541a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
