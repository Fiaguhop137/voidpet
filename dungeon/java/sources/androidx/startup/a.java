package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p345t3.b;
import p345t3.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f25412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f25413e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f25416c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f25415b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f25414a = new HashMap();

    a(Context context) {
        this.f25416c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objCreate;
        if (p381v3.a.h()) {
            try {
                p381v3.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                p381v3.a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f25414a.containsKey(cls)) {
            objCreate = this.f25414a.get(cls);
        } else {
            set.add(cls);
            try {
                p345t3.a aVar = (p345t3.a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = aVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!this.f25414a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objCreate = aVar.create(this.f25416c);
                set.remove(cls);
                this.f25414a.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        p381v3.a.f();
        return objCreate;
    }

    public static a e(Context context) {
        if (f25412d == null) {
            synchronized (f25413e) {
                try {
                    if (f25412d == null) {
                        f25412d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25412d;
    }

    void a(Bundle bundle) {
        String string = this.f25416c.getString(b.f54438a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (p345t3.a.class.isAssignableFrom(cls)) {
                            this.f25415b.add(cls);
                        }
                    }
                }
                Iterator it = this.f25415b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    void b(Class cls) {
        try {
            try {
                p381v3.a.c("Startup");
                a(this.f25416c.getPackageManager().getProviderInfo(new ComponentName(this.f25416c, (Class<?>) cls), 128).metaData);
                p381v3.a.f();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } catch (Throwable th) {
            p381v3.a.f();
            throw th;
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f25413e) {
            try {
                objD = this.f25414a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f25415b.contains(cls);
    }
}
