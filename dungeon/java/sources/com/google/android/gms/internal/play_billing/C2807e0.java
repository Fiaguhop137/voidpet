package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2807e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final C2807e0 f34701b = new C2807e0(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f34702a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0$a */
    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    C2807e0(Throwable th) {
        th.getClass();
        this.f34702a = th;
    }
}
