package p328s4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class j implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f53276k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f53277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f53278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f53280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f53281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f53282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53286j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        @Override // s4.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // s4.j.a
        public void b(Bitmap bitmap) {
        }
    }

    public j(long j10) {
        this(j10, l(), k());
    }

    j(long j10, k kVar, Set set) {
        this.f53279c = j10;
        this.f53281e = j10;
        this.f53277a = kVar;
        this.f53278b = set;
        this.f53280d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f53276k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f53283g + ", misses=" + this.f53284h + ", puts=" + this.f53285i + ", evictions=" + this.f53286j + ", currentSize=" + this.f53282f + ", maxSize=" + this.f53281e + "\nStrategy=" + this.f53277a);
    }

    private void j() {
        q(this.f53281e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f53277a.d(i10, i11, config != null ? config : f53276k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f53277a.b(i10, i11, config));
                }
                this.f53284h++;
            } else {
                this.f53283g++;
                this.f53282f -= (long) this.f53277a.e(bitmapD);
                this.f53280d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f53277a.b(i10, i11, config));
            }
            h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapD;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f53282f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f53277a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f53282f = 0L;
                    return;
                }
                this.f53280d.a(bitmapRemoveLast);
                this.f53282f -= (long) this.f53277a.e(bitmapRemoveLast);
                this.f53286j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f53277a.a(bitmapRemoveLast));
                }
                h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p328s4.d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // p328s4.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // p328s4.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f53277a.e(bitmap) <= this.f53281e && this.f53278b.contains(bitmap.getConfig())) {
                int iE = this.f53277a.e(bitmap);
                this.f53277a.c(bitmap);
                this.f53280d.b(bitmap);
                this.f53285i++;
                this.f53282f += (long) iE;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f53277a.a(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f53277a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f53278b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p328s4.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // p328s4.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        return bitmapM == null ? g(i10, i11, config) : bitmapM;
    }

    public long n() {
        return this.f53281e;
    }
}
