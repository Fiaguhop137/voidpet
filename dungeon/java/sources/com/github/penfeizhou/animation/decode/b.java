package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f31514u = "b";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Rect f31515v = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G7.b f31517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f31518c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31521f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f31523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f31524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f31525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f31526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f31527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f31528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Map f31529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ByteBuffer f31530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected volatile Rect f31531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.github.penfeizhou.animation.io.e f31532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Reader f31533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f31534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile k f31535t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List f31519d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f31520e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f31522g = null;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f31524i.get()) {
                return;
            }
            if (!b.this.q()) {
                b.this.U();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jT = b.this.T();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            b.this.f31518c.removeCallbacks(b.this.f31525j);
            b.this.f31518c.postDelayed(this, Math.max(0L, jT - jCurrentTimeMillis2));
            for (j jVar : b.this.f31523h) {
                ByteBuffer byteBuffer = b.this.f31530o;
                if (byteBuffer != null) {
                    jVar.a(byteBuffer);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.penfeizhou.animation.decode.b$b, reason: collision with other inner class name */
    class RunnableC0395b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f31537a;

        RunnableC0395b(j jVar) {
            this.f31537a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f31523h.add(this.f31537a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f31539a;

        c(j jVar) {
            this.f31539a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f31523h.remove(this.f31539a);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f31523h.size() == 0) {
                b.this.U();
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread f31542a;

        e(Thread thread) {
            this.f31542a = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (b.this.f31531p == null) {
                        if (b.this.f31533r == null) {
                            b bVar = b.this;
                            bVar.f31533r = bVar.A(bVar.f31517b.a());
                        } else {
                            b.this.f31533r.reset();
                        }
                        b bVar2 = b.this;
                        bVar2.D(bVar2.K(bVar2.f31533r));
                    }
                } finally {
                    LockSupport.unpark(this.f31542a);
                }
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                b.this.f31531p = b.f31515v;
            } catch (OutOfMemoryError e11) {
                e = e11;
                e.printStackTrace();
                b.this.f31531p = b.f31515v;
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.E();
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f31521f = 0;
            b bVar = b.this;
            bVar.f31520e = -1;
            bVar.f31534s = false;
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31548b;

        i(int i10, boolean z10) {
            this.f31547a = i10;
            this.f31548b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
            try {
                b bVar = b.this;
                bVar.f31526k = this.f31547a;
                bVar.D(bVar.K(bVar.A(bVar.f31517b.a())));
                if (this.f31548b) {
                    b.this.E();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public interface j {
        void a(ByteBuffer byteBuffer);

        void b();

        void c();
    }

    private enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public b(G7.b bVar, j jVar) {
        HashSet hashSet = new HashSet();
        this.f31523h = hashSet;
        this.f31524i = new AtomicBoolean(true);
        this.f31525j = new a();
        this.f31526k = 1;
        this.f31527l = new HashSet();
        this.f31528m = new Object();
        this.f31529n = new WeakHashMap();
        this.f31532q = C();
        this.f31533r = null;
        this.f31534s = false;
        this.f31535t = k.IDLE;
        this.f31517b = bVar;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int iA = B7.a.b().a();
        this.f31516a = iA;
        this.f31518c = new Handler(B7.a.b().c(iA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Rect rect) {
        this.f31531p = rect;
        long jWidth = ((long) rect.width()) * ((long) rect.height());
        int i10 = this.f31526k;
        long j10 = ((jWidth / (((long) i10) * ((long) i10))) + 1) * 4;
        try {
            this.f31530o = ByteBuffer.allocate((int) j10);
            if (this.f31532q == null) {
                this.f31532q = C();
            }
        } catch (OutOfMemoryError e10) {
            Log.e(f31514u, String.format("OutOfMemoryError in FrameSeqDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j10 / 1048576.0d), Long.valueOf(j10)));
            this.f31530o = null;
            this.f31531p = f31515v;
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        this.f31524i.compareAndSet(true, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (w() == 0) {
                try {
                    Reader reader = this.f31533r;
                    if (reader == null) {
                        this.f31533r = A(this.f31517b.a());
                    } else {
                        reader.reset();
                    }
                    D(K(this.f31533r));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            String str = f31514u;
            Log.i(str, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f31535t = k.RUNNING;
            if (z() != 0 && this.f31534s) {
                Log.i(str, r() + " No need to started");
                return;
            }
            this.f31520e = -1;
            this.f31518c.removeCallbacks(this.f31525j);
            this.f31525j.run();
            Iterator it = this.f31523h.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c();
            }
        } catch (Throwable th2) {
            Log.i(f31514u, r() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f31535t = k.RUNNING;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        this.f31518c.removeCallbacks(this.f31525j);
        this.f31519d.clear();
        synchronized (this.f31528m) {
            try {
                for (Bitmap bitmap : this.f31527l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f31527l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f31530o != null) {
            this.f31530o = null;
        }
        this.f31529n.clear();
        try {
            Reader reader = this.f31533r;
            if (reader != null) {
                reader.close();
                this.f31533r = null;
            }
            com.github.penfeizhou.animation.io.e eVar = this.f31532q;
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        M();
        this.f31535t = k.IDLE;
        Iterator it = this.f31523h.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        int i10 = this.f31520e + 1;
        this.f31520e = i10;
        if (i10 >= w()) {
            this.f31520e = 0;
            this.f31521f++;
        }
        com.github.penfeizhou.animation.decode.a aVarU = u(this.f31520e);
        if (aVarU == null) {
            return 0L;
        }
        O(aVarU);
        return aVarU.frameDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (!H() || w() == 0) {
            return false;
        }
        if (z() <= 0 || this.f31521f < z() - 1) {
            return true;
        }
        if (this.f31521f == z() - 1 && this.f31520e < w() - 1) {
            return true;
        }
        this.f31534s = true;
        return false;
    }

    private String r() {
        return "";
    }

    private int z() {
        Integer num = this.f31522g;
        return num != null ? num.intValue() : x();
    }

    protected abstract Reader A(Reader reader);

    public int B() {
        return this.f31526k;
    }

    protected abstract com.github.penfeizhou.animation.io.e C();

    public boolean G() {
        return this.f31524i.get();
    }

    public boolean H() {
        return this.f31535t == k.RUNNING || this.f31535t == k.INITIALIZING;
    }

    protected Bitmap I(int i10, int i11) {
        synchronized (this.f31528m) {
            try {
                Iterator it = this.f31527l.iterator();
                Bitmap bitmapCreateBitmap = null;
                while (it.hasNext()) {
                    int i12 = i10 * i11 * 4;
                    Bitmap bitmap = (Bitmap) it.next();
                    if (bitmap != null && bitmap.getAllocationByteCount() >= i12) {
                        it.remove();
                        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
                            if (i10 > 0 && i11 > 0) {
                                bitmap.reconfigure(i10, i11, Bitmap.Config.ARGB_8888);
                            }
                        }
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                    bitmapCreateBitmap = bitmap;
                }
                if (i10 <= 0 || i11 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } catch (OutOfMemoryError e11) {
                    e11.printStackTrace();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void J() {
        this.f31518c.removeCallbacks(this.f31525j);
        this.f31524i.compareAndSet(false, true);
    }

    protected abstract Rect K(Reader reader);

    protected void L(Bitmap bitmap) {
        synchronized (this.f31528m) {
            if (bitmap != null) {
                try {
                    this.f31527l.add(bitmap);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected abstract void M();

    public void N(j jVar) {
        this.f31518c.post(new c(jVar));
    }

    protected abstract void O(com.github.penfeizhou.animation.decode.a aVar);

    public void P() {
        this.f31518c.post(new h());
    }

    public void Q() {
        this.f31524i.compareAndSet(true, false);
        this.f31518c.removeCallbacks(this.f31525j);
        this.f31518c.post(this.f31525j);
    }

    public int R(int i10, int i11) {
        int iT = t(i10, i11);
        if (iT != B()) {
            boolean zH = H();
            this.f31518c.removeCallbacks(this.f31525j);
            this.f31518c.post(new i(iT, zH));
        }
        return iT;
    }

    public void S() {
        if (this.f31531p == f31515v) {
            return;
        }
        if (this.f31535t != k.RUNNING) {
            k kVar = this.f31535t;
            k kVar2 = k.INITIALIZING;
            if (kVar != kVar2) {
                if (this.f31535t == k.FINISHING) {
                    Log.e(f31514u, r() + " Processing,wait for finish at " + this.f31535t);
                }
                this.f31535t = kVar2;
                if (Looper.myLooper() == this.f31518c.getLooper()) {
                    E();
                    return;
                } else {
                    this.f31518c.post(new f());
                    return;
                }
            }
        }
        Log.i(f31514u, r() + " Already started");
    }

    public void U() {
        if (this.f31531p == f31515v) {
            return;
        }
        k kVar = this.f31535t;
        k kVar2 = k.FINISHING;
        if (kVar == kVar2 || this.f31535t == k.IDLE) {
            Log.i(f31514u, r() + "No need to stop");
            return;
        }
        if (this.f31535t == k.INITIALIZING) {
            Log.e(f31514u, r() + "Processing,wait for finish at " + this.f31535t);
        }
        this.f31535t = kVar2;
        if (Looper.myLooper() == this.f31518c.getLooper()) {
            F();
        } else {
            this.f31518c.post(new g());
        }
    }

    public void V() {
        this.f31518c.post(new d());
    }

    public void p(j jVar) {
        this.f31518c.post(new RunnableC0395b(jVar));
    }

    public Rect s() {
        if (this.f31531p == null) {
            if (this.f31535t == k.FINISHING) {
                Log.e(f31514u, "In finishing,do not interrupt");
            }
            Thread threadCurrentThread = Thread.currentThread();
            this.f31518c.post(new e(threadCurrentThread));
            LockSupport.park(threadCurrentThread);
        }
        return this.f31531p == null ? f31515v : this.f31531p;
    }

    protected int t(int i10, int i11) {
        int i12 = 1;
        if (i10 != 0 && i11 != 0) {
            int iMin = Math.min(s().width() / i10, s().height() / i11);
            while (true) {
                int i13 = i12 * 2;
                if (i13 > iMin) {
                    break;
                }
                i12 = i13;
            }
        }
        return i12;
    }

    public com.github.penfeizhou.animation.decode.a u(int i10) {
        if (i10 < 0 || i10 >= this.f31519d.size()) {
            return null;
        }
        return (com.github.penfeizhou.animation.decode.a) this.f31519d.get(i10);
    }

    public Bitmap v(int i10) throws IOException {
        if (this.f31535t != k.IDLE) {
            Log.e(f31514u, r() + ",stop first");
            return null;
        }
        this.f31535t = k.RUNNING;
        this.f31524i.compareAndSet(true, false);
        if (this.f31519d.size() == 0) {
            Reader reader = this.f31533r;
            if (reader == null) {
                this.f31533r = A(this.f31517b.a());
            } else {
                reader.reset();
            }
            D(K(this.f31533r));
        }
        if (i10 < 0) {
            i10 += this.f31519d.size();
        }
        int i11 = i10 >= 0 ? i10 : 0;
        this.f31520e = -1;
        while (this.f31520e < i11 && q()) {
            T();
        }
        this.f31530o.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(s().width() / B(), s().height() / B(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(this.f31530o);
        F();
        return bitmapCreateBitmap;
    }

    public int w() {
        return this.f31519d.size();
    }

    protected abstract int x();

    public int y() {
        int iCapacity;
        synchronized (this.f31528m) {
            try {
                iCapacity = 0;
                for (Bitmap bitmap : this.f31527l) {
                    if (!bitmap.isRecycled()) {
                        iCapacity += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.f31530o;
                if (byteBuffer != null) {
                    iCapacity += byteBuffer.capacity();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iCapacity;
    }
}
