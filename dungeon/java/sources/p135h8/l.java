package p135h8;

import com.google.android.gms.common.C2335d;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2335d f42666a;

    public l(C2335d c2335d) {
        this.f42666a = c2335d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f42666a));
    }
}
