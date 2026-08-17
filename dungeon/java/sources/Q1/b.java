package Q1;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f9246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9248d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9249e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9250f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9251g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9252h = false;

    public interface a {
        void a(b bVar, Object obj);
    }

    public b(Context context) {
        this.f9247c = context.getApplicationContext();
    }

    public void a() {
        this.f9249e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f9252h = false;
    }

    public String d(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        if (obj == null) {
            sb2.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void e() {
    }

    public void f(Object obj) {
        a aVar = this.f9246b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f9245a);
        printWriter.print(" mListener=");
        printWriter.println(this.f9246b);
        if (this.f9248d || this.f9251g || this.f9252h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f9248d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f9251g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f9252h);
        }
        if (this.f9249e || this.f9250f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f9249e);
            printWriter.print(" mReset=");
            printWriter.println(this.f9250f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f9249e;
    }

    public boolean j() {
        return this.f9248d;
    }

    protected void k() {
    }

    protected abstract boolean l();

    public void m() {
        if (this.f9248d) {
            h();
        } else {
            this.f9251g = true;
        }
    }

    protected void n() {
    }

    protected void o() {
    }

    protected abstract void p();

    protected void q() {
    }

    public void r(int i10, a aVar) {
        if (this.f9246b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f9246b = aVar;
        this.f9245a = i10;
    }

    public void s() {
        o();
        this.f9250f = true;
        this.f9248d = false;
        this.f9249e = false;
        this.f9251g = false;
        this.f9252h = false;
    }

    public void t() {
        if (this.f9252h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f9245a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f9248d = true;
        this.f9250f = false;
        this.f9249e = false;
        p();
    }

    public void v() {
        this.f9248d = false;
        q();
    }

    public void w(a aVar) {
        a aVar2 = this.f9246b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f9246b = null;
    }
}
