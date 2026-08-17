package Z6;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18800a = new a();

    private a() {
    }

    public static final int a(int i10) {
        return i10 % 2 == 0 ? 2 : 1;
    }

    public static final int b(int i10, int i11) {
        int i12 = i11 == -1 ? 1 : 2;
        if (i12 == 1 && !d(i10) && i10 % 2 == 0) {
            return 2;
        }
        return i12;
    }

    public static final int c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return a(view.getId());
    }

    public static final boolean d(int i10) {
        return i10 % 10 == 1;
    }
}
