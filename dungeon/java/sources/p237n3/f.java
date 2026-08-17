package p237n3;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p273p3.b f49896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p237n3.b.C0589b f49897b;

    public interface a {
        void a(i iVar);
    }

    public interface b {
        Bundle a();
    }

    public f(p273p3.b impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f49896a = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49896a.c(key);
    }

    public final b b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49896a.d(key);
    }

    public final void c(String key, b provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f49896a.j(key, provider);
    }

    public final void d(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f49896a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        p237n3.b.C0589b c0589b = this.f49897b;
        if (c0589b == null) {
            c0589b = new p237n3.b.C0589b(this);
        }
        this.f49897b = c0589b;
        try {
            clazz.getDeclaredConstructor(null);
            p237n3.b.C0589b c0589b2 = this.f49897b;
            if (c0589b2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c0589b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49896a.k(key);
    }
}
