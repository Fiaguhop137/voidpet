package p079e6;

import V4.k;
import W5.z;
import Y4.a;
import Y4.i;
import Y4.l;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.facebook.imagepipeline.memory.c;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imagepipeline.memory.e;
import com.facebook.imagepipeline.memory.f;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f40470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f40471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f40472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f40473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f40474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f40475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f40476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f40477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f40478i;

    public D(B b10) {
        this.f40470a = (B) k.g(b10);
    }

    private f a() {
        if (this.f40471b == null) {
            try {
                this.f40471b = (f) AshmemMemoryChunkPool.class.getConstructor(Y4.d.class, E.class, F.class).newInstance(this.f40470a.i(), this.f40470a.g(), this.f40470a.h());
            } catch (ClassNotFoundException unused) {
                this.f40471b = null;
            } catch (IllegalAccessException unused2) {
                this.f40471b = null;
            } catch (InstantiationException unused3) {
                this.f40471b = null;
            } catch (NoSuchMethodException unused4) {
                this.f40471b = null;
            } catch (InvocationTargetException unused5) {
                this.f40471b = null;
            }
        }
        return this.f40471b;
    }

    private f f(int i10) {
        if (i10 == 0) {
            return g();
        }
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2) {
            return a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    public i b() {
        byte b10;
        if (this.f40472c == null) {
            switch (this.f40470a.e()) {
                case "legacy_default_params":
                    b10 = 3;
                    break;
                case "legacy":
                    b10 = 4;
                    break;
                case "experimental":
                    b10 = 2;
                    break;
                case "dummy_with_tracking":
                    b10 = 1;
                    break;
                case "dummy":
                    b10 = 0;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                this.f40472c = new r();
            } else if (b10 == 1) {
                this.f40472c = new s();
            } else if (b10 == 2) {
                this.f40472c = new t(this.f40470a.b(), this.f40470a.a(), z.h(), this.f40470a.m() ? this.f40470a.i() : null);
            } else if (b10 != 3) {
                this.f40472c = new c(this.f40470a.i(), this.f40470a.c(), this.f40470a.d(), this.f40470a.l());
            } else {
                this.f40472c = new c(this.f40470a.i(), n.a(), this.f40470a.d(), this.f40470a.l());
            }
        }
        return this.f40472c;
    }

    public f c() {
        if (this.f40473d == null) {
            try {
                this.f40473d = (f) BufferMemoryChunkPool.class.getConstructor(Y4.d.class, E.class, F.class).newInstance(this.f40470a.i(), this.f40470a.g(), this.f40470a.h());
            } catch (ClassNotFoundException unused) {
                this.f40473d = null;
            } catch (IllegalAccessException unused2) {
                this.f40473d = null;
            } catch (InstantiationException unused3) {
                this.f40473d = null;
            } catch (NoSuchMethodException unused4) {
                this.f40473d = null;
            } catch (InvocationTargetException unused5) {
                this.f40473d = null;
            }
        }
        return this.f40473d;
    }

    public d d() {
        if (this.f40474e == null) {
            this.f40474e = new d(this.f40470a.i(), this.f40470a.f());
        }
        return this.f40474e;
    }

    public int e() {
        return this.f40470a.f().f40485g;
    }

    public f g() {
        if (this.f40475f == null) {
            try {
                this.f40475f = (f) NativeMemoryChunkPool.class.getConstructor(Y4.d.class, E.class, F.class).newInstance(this.f40470a.i(), this.f40470a.g(), this.f40470a.h());
            } catch (ClassNotFoundException e10) {
                W4.a.n("PoolFactory", "", e10);
                this.f40475f = null;
            } catch (IllegalAccessException e11) {
                W4.a.n("PoolFactory", "", e11);
                this.f40475f = null;
            } catch (InstantiationException e12) {
                W4.a.n("PoolFactory", "", e12);
                this.f40475f = null;
            } catch (NoSuchMethodException e13) {
                W4.a.n("PoolFactory", "", e13);
                this.f40475f = null;
            } catch (InvocationTargetException e14) {
                W4.a.n("PoolFactory", "", e14);
                this.f40475f = null;
            }
        }
        return this.f40475f;
    }

    public i h() {
        return i(!z.a() ? 1 : 0);
    }

    public i i(int i10) {
        if (this.f40476g == null) {
            f fVarF = f(i10);
            k.h(fVarF, "failed to get pool for chunk type: " + i10);
            this.f40476g = new y(fVarF, j());
        }
        return this.f40476g;
    }

    public l j() {
        if (this.f40477h == null) {
            this.f40477h = new l(k());
        }
        return this.f40477h;
    }

    public a k() {
        if (this.f40478i == null) {
            this.f40478i = new e(this.f40470a.i(), this.f40470a.j(), this.f40470a.k());
        }
        return this.f40478i;
    }
}
