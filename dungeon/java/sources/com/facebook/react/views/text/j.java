package com.facebook.react.views.text;

import android.text.Spannable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f31053k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spannable f31054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f31057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f31058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f31059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f31060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f31061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f31062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f31063j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(Spannable text, int i10, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new j(text, i10, false, i11, i12, i13);
        }
    }

    public j(Spannable text, int i10, boolean z10, float f10, float f11, float f12, float f13, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f31054a = text;
        this.f31055b = i10;
        this.f31056c = z10;
        this.f31057d = f10;
        this.f31058e = f11;
        this.f31059f = f12;
        this.f31060g = f13;
        this.f31061h = i11;
        this.f31062i = i12;
        this.f31063j = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Spannable text, int i10, boolean z10, int i11, int i12, int i13) {
        this(text, i10, z10, -1.0f, -1.0f, -1.0f, -1.0f, i11, i12, i13);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public final boolean a() {
        return this.f31056c;
    }

    public final int b() {
        return this.f31055b;
    }

    public final int c() {
        return this.f31063j;
    }

    public final float d() {
        return this.f31060g;
    }

    public final float e() {
        return this.f31057d;
    }

    public final float f() {
        return this.f31059f;
    }

    public final float g() {
        return this.f31058e;
    }

    public final Spannable h() {
        return this.f31054a;
    }

    public final int i() {
        return this.f31061h;
    }

    public final int j() {
        return this.f31062i;
    }
}
