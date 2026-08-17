package com.facebook.react.module.model;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReactModuleInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f29842g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f29848f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return TurboModule.class.isAssignableFrom(clazz);
        }
    }

    public ReactModuleInfo(String name, String className, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
        this.f29843a = name;
        this.f29844b = className;
        this.f29845c = z10;
        this.f29846d = z11;
        this.f29847e = z12;
        this.f29848f = z13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactModuleInfo(String name, String className, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(name, className, z10, z11, z13, z14);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
    }

    public final boolean a() {
        return this.f29845c;
    }

    public final String b() {
        return this.f29844b;
    }

    public final boolean c() {
        return this.f29847e;
    }

    public final boolean d() {
        return this.f29848f;
    }

    public final String e() {
        return this.f29843a;
    }

    public final boolean f() {
        return this.f29846d;
    }
}
