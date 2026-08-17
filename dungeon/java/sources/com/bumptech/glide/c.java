package com.bumptech.glide;

import E4.o;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.module.AppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile c f28531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile boolean f28532l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p310r4.k f28533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p328s4.d f28534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p346t4.h f28535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f28536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p328s4.b f28537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f28538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final E4.c f28539g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f28541i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f28540h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f28542j = g.NORMAL;

    public interface a {
        H4.f build();
    }

    c(Context context, p310r4.k kVar, p346t4.h hVar, p328s4.d dVar, p328s4.b bVar, o oVar, E4.c cVar, int i10, a aVar, Map map, List list, List list2, AppGlideModule appGlideModule, f fVar) {
        this.f28533a = kVar;
        this.f28534b = dVar;
        this.f28537e = bVar;
        this.f28535c = hVar;
        this.f28538f = oVar;
        this.f28539g = cVar;
        this.f28541i = aVar;
        this.f28536d = new e(context, bVar, j.d(this, list2, appGlideModule), new I4.b(), aVar, map, list, kVar, fVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f28532l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f28532l = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            f28532l = false;
        }
    }

    public static c d(Context context) {
        if (f28531k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleE = e(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f28531k == null) {
                        a(context, generatedAppGlideModuleE);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28531k;
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            r(e10);
            return null;
        } catch (InstantiationException e11) {
            r(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            r(e12);
            return null;
        } catch (InvocationTargetException e13) {
            r(e13);
            return null;
        }
    }

    private static o m(Context context) {
        L4.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    private static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new d(), generatedAppGlideModule);
    }

    private static void o(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listB = new F4.c(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set setD = generatedAppGlideModule.d();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                F4.a aVar = (F4.a) it.next();
                if (setD.contains(aVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + aVar);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((F4.a) it2.next()).getClass());
            }
        }
        dVar.c(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            ((F4.a) it3.next()).a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c cVarA = dVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(cVarA);
        f28531k = cVarA;
    }

    private static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static l u(Activity activity) {
        return v(activity.getApplicationContext());
    }

    public static l v(Context context) {
        return m(context).d(context);
    }

    public void b() {
        L4.l.a();
        this.f28533a.e();
    }

    public void c() {
        L4.l.b();
        this.f28535c.b();
        this.f28534b.b();
        this.f28537e.b();
    }

    public p328s4.b f() {
        return this.f28537e;
    }

    public p328s4.d g() {
        return this.f28534b;
    }

    E4.c h() {
        return this.f28539g;
    }

    public Context i() {
        return this.f28536d.getBaseContext();
    }

    e j() {
        return this.f28536d;
    }

    public i k() {
        return this.f28536d.h();
    }

    public o l() {
        return this.f28538f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        s(i10);
    }

    void p(l lVar) {
        synchronized (this.f28540h) {
            try {
                if (this.f28540h.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f28540h.add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(I4.d dVar) {
        synchronized (this.f28540h) {
            try {
                Iterator it = this.f28540h.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).B(dVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i10) {
        L4.l.b();
        synchronized (this.f28540h) {
            try {
                Iterator it = this.f28540h.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f28535c.a(i10);
        this.f28534b.a(i10);
        this.f28537e.a(i10);
    }

    void t(l lVar) {
        synchronized (this.f28540h) {
            try {
                if (!this.f28540h.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f28540h.remove(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
