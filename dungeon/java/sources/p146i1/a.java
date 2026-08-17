package p146i1;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j.c f43505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f43506b;

    /* JADX INFO: renamed from: i1.a$a, reason: collision with other inner class name */
    class RunnableC0512a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.c f43507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f43508b;

        RunnableC0512a(j.c cVar, Typeface typeface) {
            this.f43507a = cVar;
            this.f43508b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f43507a.b(this.f43508b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.c f43510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43511b;

        b(j.c cVar, int i10) {
            this.f43510a = cVar;
            this.f43511b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f43510a.a(this.f43511b);
        }
    }

    a(j.c cVar, Executor executor) {
        this.f43505a = cVar;
        this.f43506b = executor;
    }

    private void a(int i10) {
        this.f43506b.execute(new b(this.f43505a, i10));
    }

    private void c(Typeface typeface) {
        this.f43506b.execute(new RunnableC0512a(this.f43505a, typeface));
    }

    void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f43541a);
        } else {
            a(eVar.f43542b);
        }
    }
}
