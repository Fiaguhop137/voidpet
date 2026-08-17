package com.swmansion.rnscreens.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0433a f39327c = new C0433a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f39328d = new a(new b(Integer.MIN_VALUE, false), 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f39329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39330b;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.utils.a$a, reason: collision with other inner class name */
    public static final class C0433a {
        private C0433a() {
        }

        public /* synthetic */ C0433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(b cacheKey, float f10) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.f39329a = cacheKey;
        this.f39330b = f10;
    }

    public final float a() {
        return this.f39330b;
    }

    public final boolean b(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f39329a.a() != Integer.MIN_VALUE && Intrinsics.b(this.f39329a, key);
    }
}
