package p378v0;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f55664a;

    private b(AutofillId autofillId) {
        this.f55664a = autofillId;
    }

    public static b b(AutofillId autofillId) {
        return new b(autofillId);
    }

    public AutofillId a() {
        return a.a(this.f55664a);
    }
}
