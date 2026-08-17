package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1990m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1990m f24359a = new C1990m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f24360b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    public static final class a extends AbstractC1983f {
        @Override // androidx.lifecycle.AbstractC1983f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            E.INSTANCE.c(activity);
        }
    }

    private C1990m() {
    }

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f24360b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
