package p365u5;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0689a f55005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float f55006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f55007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f55008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f55009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f55010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f55011g;

    /* JADX INFO: renamed from: u5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0689a {
        boolean b();
    }

    public a(Context context) {
        this.f55006b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f55005a = null;
        e();
    }

    public boolean b() {
        return this.f55007c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0689a interfaceC0689a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f55007c = true;
            this.f55008d = true;
            this.f55009e = motionEvent.getEventTime();
            this.f55010f = motionEvent.getX();
            this.f55011g = motionEvent.getY();
        } else if (action == 1) {
            this.f55007c = false;
            if (Math.abs(motionEvent.getX() - this.f55010f) > this.f55006b || Math.abs(motionEvent.getY() - this.f55011g) > this.f55006b) {
                this.f55008d = false;
            }
            if (this.f55008d && motionEvent.getEventTime() - this.f55009e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0689a = this.f55005a) != null) {
                interfaceC0689a.b();
            }
            this.f55008d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f55007c = false;
                this.f55008d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f55010f) > this.f55006b || Math.abs(motionEvent.getY() - this.f55011g) > this.f55006b) {
            this.f55008d = false;
        }
        return true;
    }

    public void e() {
        this.f55007c = false;
        this.f55008d = false;
    }

    public void f(InterfaceC0689a interfaceC0689a) {
        this.f55005a = interfaceC0689a;
    }
}
