package p395w;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import p324s0.AbstractC4147l;
import p324s0.InterfaceC4144j;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f56524a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f56524a;
    }

    public static final boolean b(InterfaceC4144j interfaceC4144j) {
        return c(AbstractC4147l.a(interfaceC4144j));
    }

    private static final boolean c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
