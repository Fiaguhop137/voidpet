package p217m1;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: m1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4001c {

    /* JADX INFO: renamed from: m1.c$a */
    static class a {
        static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: renamed from: m1.c$b */
    public interface b {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* JADX INFO: renamed from: m1.c$c, reason: collision with other inner class name */
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC0577c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f48992a;

        AccessibilityManagerTouchExplorationStateChangeListenerC0577c(b bVar) {
            this.f48992a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0577c) {
                return this.f48992a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0577c) obj).f48992a);
            }
            return false;
        }

        public int hashCode() {
            return this.f48992a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f48992a.onTouchExplorationStateChanged(z10);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0577c(bVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(accessibilityManager);
        }
        return true;
    }

    public static boolean c(AccessibilityManager accessibilityManager, b bVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0577c(bVar));
    }
}
