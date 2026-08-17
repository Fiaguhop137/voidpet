package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p020b1.C;

/* JADX INFO: loaded from: classes.dex */
public class k extends f.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f23741k = new a();

    public static class a {
        public Typeface a(Context context, i1.j.b bVar) {
            return p146i1.j.a(context, null, new i1.j.b[]{bVar});
        }

        public i1.j.a b(Context context, p146i1.f fVar) {
            return p146i1.j.b(context, null, fVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements f.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p146i1.f f23743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f23744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f23745d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f23746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f23747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f23748g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        f.i f23749h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f23750i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f23751j;

        b(Context context, p146i1.f fVar, a aVar) {
            p199l1.g.h(context, "Context cannot be null");
            p199l1.g.h(fVar, "FontRequest cannot be null");
            this.f23742a = context.getApplicationContext();
            this.f23743b = fVar;
            this.f23744c = aVar;
        }

        private void b() {
            synchronized (this.f23745d) {
                try {
                    this.f23749h = null;
                    ContentObserver contentObserver = this.f23750i;
                    if (contentObserver != null) {
                        this.f23744c.c(this.f23742a, contentObserver);
                        this.f23750i = null;
                    }
                    Handler handler = this.f23746e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f23751j);
                    }
                    this.f23746e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f23748g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f23747f = null;
                    this.f23748g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private i1.j.b e() {
            try {
                i1.j.a aVarB = this.f23744c.b(this.f23742a, this.f23743b);
                if (aVarB.e() == 0) {
                    i1.j.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            p199l1.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f23745d) {
                this.f23749h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f23745d) {
                try {
                    if (this.f23749h == null) {
                        return;
                    }
                    try {
                        i1.j.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f23745d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            p128h1.n.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f23744c.a(this.f23742a, bVarE);
                            ByteBuffer byteBufferF = C.f(this.f23742a, null, bVarE.e());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n nVarB = n.b(typefaceA, byteBufferF);
                            p128h1.n.b();
                            synchronized (this.f23745d) {
                                try {
                                    f.i iVar = this.f23749h;
                                    if (iVar != null) {
                                        iVar.b(nVarB);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            p128h1.n.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f23745d) {
                            try {
                                f.i iVar2 = this.f23749h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        void d() {
            synchronized (this.f23745d) {
                try {
                    if (this.f23749h == null) {
                        return;
                    }
                    if (this.f23747f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = c.b("emojiCompat");
                        this.f23748g = threadPoolExecutorB;
                        this.f23747f = threadPoolExecutorB;
                    }
                    this.f23747f.execute(new l(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f23745d) {
                this.f23747f = executor;
            }
        }
    }

    public k(Context context, p146i1.f fVar) {
        super(new b(context, fVar, f23741k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
