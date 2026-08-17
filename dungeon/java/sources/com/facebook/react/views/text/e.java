package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31021b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f31022c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p366u6.a f31023a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            e eVar = e.f31022c;
            if (eVar != null) {
                return eVar;
            }
            e eVar2 = new e(p366u6.a.f55012c.c(), null);
            e.f31022c = eVar2;
            return eVar2;
        }
    }

    private e(p366u6.a aVar) {
        this.f31023a = aVar;
    }

    public /* synthetic */ e(p366u6.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final e c() {
        return f31021b.a();
    }

    public final Typeface d(String fontFamilyName, int i10, int i11, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return this.f31023a.d(fontFamilyName, i10, i11, assetManager);
    }

    public final Typeface e(String fontFamilyName, int i10, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(fontFamilyName, "fontFamilyName");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        return this.f31023a.e(fontFamilyName, i10, assetManager);
    }
}
