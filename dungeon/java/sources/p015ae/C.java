package p015ae;

import android.support.v4.media.session.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f19679a = new G("InvalidModuleNotifier");

    public static final void a(H h10) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        b.a(h10.n0(f19679a));
        throw new B("Accessing invalid module descriptor " + h10);
    }
}
