package B8;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f595b;

    private c(boolean z10, Intent intent) {
        this.f594a = z10;
        this.f595b = intent;
    }

    public static c a(Intent intent) {
        return new c(true, intent);
    }

    public static c b(Intent intent) {
        return new c(false, intent);
    }

    public final boolean c() {
        return this.f594a;
    }

    public final Intent d() {
        return this.f595b;
    }
}
