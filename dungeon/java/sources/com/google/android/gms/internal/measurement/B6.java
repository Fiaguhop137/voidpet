package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class B6 implements B9.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final B6 f32486b = new B6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B9.t f32487a = B9.u.b(new D6());

    public static boolean a() {
        return f32486b.get().zza();
    }

    public static boolean b() {
        return f32486b.get().zzb();
    }

    @Override // B9.t
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C6 get() {
        return (C6) this.f32487a.get();
    }
}
