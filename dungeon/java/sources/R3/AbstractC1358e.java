package R3;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: R3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1358e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10773a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10774b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10775c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f10776d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static p023b4.f f10778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static p023b4.e f10779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile p023b4.h f10780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile p023b4.g f10781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ThreadLocal f10782j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static EnumC1354a f10777e = EnumC1354a.AUTOMATIC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static V3.b f10783k = new V3.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f10774b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f10774b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static EnumC1354a d() {
        return f10777e;
    }

    public static boolean e() {
        return f10776d;
    }

    public static V3.b f() {
        return f10783k;
    }

    private static p077e4.i g() {
        p077e4.i iVar = (p077e4.i) f10782j.get();
        if (iVar != null) {
            return iVar;
        }
        p077e4.i iVar2 = new p077e4.i();
        f10782j.set(iVar2);
        return iVar2;
    }

    public static boolean h() {
        return f10774b;
    }

    public static p023b4.g i(Context context) {
        p023b4.g gVar;
        if (!f10775c) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        p023b4.g gVar2 = f10781i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (p023b4.g.class) {
            try {
                gVar = f10781i;
                if (gVar == null) {
                    p023b4.e c1357d = f10779g;
                    if (c1357d == null) {
                        c1357d = new C1357d(applicationContext);
                    }
                    gVar = new p023b4.g(c1357d);
                    f10781i = gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static p023b4.h j(Context context) {
        p023b4.h hVar;
        p023b4.h hVar2 = f10780h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (p023b4.h.class) {
            try {
                hVar = f10780h;
                if (hVar == null) {
                    p023b4.g gVarI = i(context);
                    p023b4.f bVar = f10778f;
                    if (bVar == null) {
                        bVar = new p023b4.b();
                    }
                    hVar = new p023b4.h(gVarI, bVar);
                    f10780h = hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
