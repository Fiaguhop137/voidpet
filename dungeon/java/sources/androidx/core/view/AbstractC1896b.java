package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1896b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f23185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0280b f23186c;

    /* JADX INFO: renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0280b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC1896b(Context context) {
        this.f23184a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f23186c = null;
        this.f23185b = null;
    }

    public void h(a aVar) {
        this.f23185b = aVar;
    }

    public abstract void i(InterfaceC0280b interfaceC0280b);
}
