package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class K6 implements B9.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final K6 f32557b = new K6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B9.t f32558a = B9.u.b(new M6());

    public static boolean a() {
        f32557b.get().zza();
        return true;
    }

    public static boolean b() {
        return f32557b.get().zzb();
    }

    public static boolean c() {
        return f32557b.get().zzc();
    }

    @Override // B9.t
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final L6 get() {
        return (L6) this.f32558a.get();
    }
}
