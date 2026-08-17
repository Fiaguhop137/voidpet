package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class I7 implements B9.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final I7 f32545b = new I7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B9.t f32546a = B9.u.b(new K7());

    public static boolean a() {
        f32545b.get().zza();
        return true;
    }

    public static boolean b() {
        return f32545b.get().zzb();
    }

    @Override // B9.t
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final J7 get() {
        return (J7) this.f32546a.get();
    }
}
