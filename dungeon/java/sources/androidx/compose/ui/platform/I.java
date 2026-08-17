package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p216m0.C3978a;
import p216m0.InterfaceC3998v;

/* JADX INFO: loaded from: classes.dex */
final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f21886a = new I();

    private I() {
    }

    public final void a(@NotNull View view, @Nullable InterfaceC3998v interfaceC3998v) {
        PointerIcon pointerIconB = b(view.getContext(), interfaceC3998v);
        if (Intrinsics.b(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }

    public final PointerIcon b(Context context, InterfaceC3998v interfaceC3998v) {
        return interfaceC3998v instanceof C3978a ? PointerIcon.getSystemIcon(context, ((C3978a) interfaceC3998v).a()) : PointerIcon.getSystemIcon(context, 1000);
    }
}
