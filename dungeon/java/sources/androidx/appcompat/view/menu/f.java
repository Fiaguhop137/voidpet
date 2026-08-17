package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f20357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.b f20358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f20359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f20360d;

    public f(e eVar) {
        this.f20357a = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f20358b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void b(e eVar, boolean z10) {
        if (z10 || eVar == this.f20357a) {
            a();
        }
        j.a aVar = this.f20360d;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c(e eVar) {
        j.a aVar = this.f20360d;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f20357a;
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(eVar.w());
        c cVar = new c(aVar.b(), p144i.g.f43218j);
        this.f20359c = cVar;
        cVar.e(this);
        this.f20357a.b(this.f20359c);
        aVar.c(this.f20359c.a(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            aVar.d(viewA);
        } else {
            aVar.e(eVar.y()).m(eVar.z());
        }
        aVar.j(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f20358b = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f20358b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f20358b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f20357a.O((g) this.f20359c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f20359c.b(this.f20357a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f20358b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f20358b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f20357a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f20357a.performShortcut(i10, keyEvent, 0);
    }
}
