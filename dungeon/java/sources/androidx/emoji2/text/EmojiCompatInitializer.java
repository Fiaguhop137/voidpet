package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC1987j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1994q;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements p345t3.a {

    class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1987j f23673a;

        a(AbstractC1987j abstractC1987j) {
            this.f23673a = abstractC1987j;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC1994q interfaceC1994q) {
            EmojiCompatInitializer.this.c();
            this.f23673a.d(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23675a;

        class a extends f.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f23676a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f23677b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f23676a = iVar;
                this.f23677b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                try {
                    this.f23676a.a(th);
                } finally {
                    this.f23677b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f23676a.b(nVar);
                } finally {
                    this.f23677b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f23675a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new g(this, iVar, threadPoolExecutorB));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k kVarA = androidx.emoji2.text.d.a(this.f23675a);
                if (kVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                kVarA.c(threadPoolExecutor);
                kVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p128h1.n.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.i()) {
                    f.c().l();
                }
            } finally {
                p128h1.n.b();
            }
        }
    }

    @Override // p345t3.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        f.h(new b(context));
        b(context);
        return Boolean.TRUE;
    }

    void b(Context context) {
        AbstractC1987j abstractC1987jY = ((InterfaceC1994q) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).y();
        abstractC1987jY.a(new a(abstractC1987jY));
    }

    void c() {
        androidx.emoji2.text.c.c().postDelayed(new d(), 500L);
    }

    @Override // p345t3.a
    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
