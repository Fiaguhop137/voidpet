package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p323s.C4102b;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f23683o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f23684p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile f f23685q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f23687b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f23690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f23691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f23692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f23693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f23694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f23695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f23696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f23697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f23698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e f23699n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f23686a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f23688c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f23689d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.i f23700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile n f23701c;

        /* JADX INFO: renamed from: androidx.emoji2.text.f$a$a, reason: collision with other inner class name */
        class C0289a extends i {
            C0289a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                a.this.f23703a.n(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.d(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        void a() {
            try {
                this.f23703a.f23691f.a(new C0289a());
            } catch (Throwable th) {
                this.f23703a.n(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f23700b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f23701c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f23703a.f23693h);
        }

        void d(n nVar) {
            if (nVar == null) {
                this.f23703a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f23701c = nVar;
            n nVar2 = this.f23701c;
            j jVar = this.f23703a.f23692g;
            e eVar = this.f23703a.f23699n;
            f fVar = this.f23703a;
            this.f23700b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f23694i, fVar.f23695j, androidx.emoji2.text.h.a());
            this.f23703a.o();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f23703a;

        b(f fVar) {
            this.f23703a = fVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f23704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f23705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f23706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f23707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f23708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set f23709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f23710g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23711h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f23712i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e f23713j = new androidx.emoji2.text.e();

        protected c(h hVar) {
            p199l1.g.h(hVar, "metadataLoader cannot be null.");
            this.f23704a = hVar;
        }

        protected final h a() {
            return this.f23704a;
        }

        public c b(int i10) {
            this.f23712i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0290f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f23714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f23715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f23716c;

        g(AbstractC0290f abstractC0290f, int i10) {
            this(Arrays.asList((AbstractC0290f) p199l1.g.h(abstractC0290f, "initCallback cannot be null")), i10, null);
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th) {
            p199l1.g.h(collection, "initCallbacks cannot be null");
            this.f23714a = new ArrayList(collection);
            this.f23716c = i10;
            this.f23715b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f23714a.size();
            int i10 = 0;
            if (this.f23716c != 1) {
                while (i10 < size) {
                    ((AbstractC0290f) this.f23714a.get(i10)).a(this.f23715b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((AbstractC0290f) this.f23714a.get(i10)).b();
                    i10++;
                }
            }
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f23693h = cVar.f23706c;
        this.f23694i = cVar.f23707d;
        this.f23695j = cVar.f23708e;
        this.f23696k = cVar.f23710g;
        this.f23697l = cVar.f23711h;
        this.f23691f = cVar.f23704a;
        this.f23698m = cVar.f23712i;
        this.f23699n = cVar.f23713j;
        C4102b c4102b = new C4102b();
        this.f23687b = c4102b;
        j jVar = cVar.f23705b;
        this.f23692g = jVar == null ? new d() : jVar;
        Set set = cVar.f23709f;
        if (set != null && !set.isEmpty()) {
            c4102b.addAll(cVar.f23709f);
        }
        this.f23690e = new a(this);
        m();
    }

    public static f c() {
        f fVar;
        synchronized (f23683o) {
            fVar = f23685q;
            p199l1.g.i(fVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.c(editable, i10, keyEvent);
    }

    public static f h(c cVar) {
        f fVar;
        f fVar2 = f23685q;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (f23683o) {
            try {
                fVar = f23685q;
                if (fVar == null) {
                    fVar = new f(cVar);
                    f23685q = fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static boolean i() {
        return f23685q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f23686a.writeLock().lock();
        try {
            if (this.f23698m == 0) {
                this.f23688c = 0;
            }
            this.f23686a.writeLock().unlock();
            if (e() == 0) {
                this.f23690e.a();
            }
        } catch (Throwable th) {
            this.f23686a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f23697l;
    }

    public int e() {
        this.f23686a.readLock().lock();
        try {
            return this.f23688c;
        } finally {
            this.f23686a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f23696k;
    }

    public void l() {
        p199l1.g.i(this.f23698m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f23686a.writeLock().lock();
        try {
            if (this.f23688c == 0) {
                this.f23686a.writeLock().unlock();
                return;
            }
            this.f23688c = 0;
            this.f23686a.writeLock().unlock();
            this.f23690e.a();
        } catch (Throwable th) {
            this.f23686a.writeLock().unlock();
            throw th;
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f23686a.writeLock().lock();
        try {
            this.f23688c = 2;
            arrayList.addAll(this.f23687b);
            this.f23687b.clear();
            this.f23686a.writeLock().unlock();
            this.f23689d.post(new g(arrayList, this.f23688c, th));
        } catch (Throwable th2) {
            this.f23686a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f23686a.writeLock().lock();
        try {
            this.f23688c = 1;
            arrayList.addAll(this.f23687b);
            this.f23687b.clear();
            this.f23686a.writeLock().unlock();
            this.f23689d.post(new g(arrayList, this.f23688c));
        } catch (Throwable th) {
            this.f23686a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        p199l1.g.i(k(), "Not initialized yet");
        p199l1.g.e(i10, "start cannot be negative");
        p199l1.g.e(i11, "end cannot be negative");
        p199l1.g.e(i12, "maxEmojiCount cannot be negative");
        p199l1.g.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        p199l1.g.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        p199l1.g.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f23693h : false;
        } else {
            z10 = true;
        }
        return this.f23690e.b(charSequence, i10, i11, i12, z10);
    }

    public void t(AbstractC0290f abstractC0290f) {
        p199l1.g.h(abstractC0290f, "initCallback cannot be null");
        this.f23686a.writeLock().lock();
        try {
            if (this.f23688c == 1 || this.f23688c == 2) {
                this.f23689d.post(new g(abstractC0290f, this.f23688c));
            } else {
                this.f23687b.add(abstractC0290f);
            }
        } finally {
            this.f23686a.writeLock().unlock();
        }
    }

    public void u(AbstractC0290f abstractC0290f) {
        p199l1.g.h(abstractC0290f, "initCallback cannot be null");
        this.f23686a.writeLock().lock();
        try {
            this.f23687b.remove(abstractC0290f);
        } finally {
            this.f23686a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f23690e.c(editorInfo);
    }
}
