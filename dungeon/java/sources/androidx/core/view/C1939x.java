package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1939x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f23273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f23274b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f23275c = new HashMap();

    public C1939x(Runnable runnable) {
        this.f23273a = runnable;
    }

    public void a(A a10) {
        this.f23274b.add(a10);
        this.f23273a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f23274b.iterator();
        while (it.hasNext()) {
            ((A) it.next()).d(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f23274b.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f23274b.iterator();
        while (it.hasNext()) {
            if (((A) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f23274b.iterator();
        while (it.hasNext()) {
            ((A) it.next()).b(menu);
        }
    }

    public void f(A a10) {
        this.f23274b.remove(a10);
        android.support.v4.media.session.b.a(this.f23275c.remove(a10));
        this.f23273a.run();
    }
}
