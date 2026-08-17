package C5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.K;
import kotlin.collections.N;
import kotlin.collections.W;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f1441n = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T5.d f1442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p437y5.c f1443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B5.c f1444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p419x5.d f1445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap f1448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile int f1449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f1450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f1451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f1453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set f1454m;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Z4.a f1455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1456b;

        public a(Z4.a bitmapRef) {
            Intrinsics.checkNotNullParameter(bitmapRef, "bitmapRef");
            this.f1455a = bitmapRef;
        }

        public final Z4.a a() {
            return this.f1455a;
        }

        public final boolean b() {
            return !this.f1456b && this.f1455a.p();
        }

        public final void c() {
            Z4.a.g(this.f1455a);
        }

        public final void d(boolean z10) {
            this.f1456b = z10;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g(T5.d platformBitmapFactory, p437y5.c bitmapFrameRenderer, B5.c fpsCompressor, p419x5.d animationInformation, int i10) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(fpsCompressor, "fpsCompressor");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f1442a = platformBitmapFactory;
        this.f1443b = bitmapFrameRenderer;
        this.f1444c = fpsCompressor;
        this.f1445d = animationInformation;
        this.f1446e = i10;
        int iE = kotlin.ranges.e.e((k(l()) * i10) / 1000, 1);
        this.f1447f = iE;
        this.f1448g = new ConcurrentHashMap();
        this.f1451j = new h(l().a());
        this.f1452k = -1;
        this.f1453l = N.i();
        this.f1454m = W.d();
        d(k(l()));
        this.f1449h = (int) (iE * 0.5f);
    }

    private final void f(Z4.a aVar) {
        if (aVar.p()) {
            new Canvas((Bitmap) aVar.m()).drawColor(0, PorterDuff.Mode.CLEAR);
        }
    }

    private final boolean g(int i10, int i11, int i12, int i13) throws IOException {
        int iIntValue;
        Z4.a aVarA;
        List listD = this.f1451j.d(i10, this.f1447f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (this.f1454m.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Set setY0 = CollectionsKt.Y0(arrayList);
        Set setKeySet = this.f1448g.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        ArrayDeque arrayDeque = new ArrayDeque(W.h(setKeySet, setY0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (this.f1448g.get(Integer.valueOf(iIntValue2)) == null) {
                int i14 = this.f1452k;
                if (i14 != -1 && !setY0.contains(Integer.valueOf(i14))) {
                    return false;
                }
                Integer num = (Integer) arrayDeque.pollFirst();
                int iIntValue3 = num != null ? num.intValue() : -1;
                a aVar = (a) this.f1448g.get(Integer.valueOf(iIntValue3));
                Z4.a aVarD = (aVar == null || (aVarA = aVar.a()) == null) ? null : aVarA.d();
                if (aVarD == null) {
                    Z4.a aVarA2 = this.f1442a.a(i11, i12);
                    Intrinsics.checkNotNullExpressionValue(aVarA2, "createBitmap(...)");
                    aVar = new a(aVarA2);
                    aVarD = aVar.a().clone();
                }
                aVar.d(true);
                try {
                    o(aVarD, iIntValue2, i11, i12);
                    Unit unit = Unit.f48228a;
                    kotlin.io.c.a(aVarD, null);
                    this.f1448g.remove(Integer.valueOf(iIntValue3));
                    aVar.d(false);
                    this.f1448g.put(Integer.valueOf(iIntValue2), aVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(aVarD, th);
                        throw th2;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            iIntValue = (int) (this.f1447f * 0.5f);
        } else {
            int size = arrayList.size();
            iIntValue = ((Number) arrayList.get(kotlin.ranges.e.m((int) (size * 0.5f), 0, size - 1))).intValue();
        }
        this.f1449h = iIntValue;
        return true;
    }

    static /* synthetic */ boolean h(g gVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return gVar.g(i10, i11, i12, i13);
    }

    private final C5.a i(int i10) {
        C5.a aVar;
        Iterator it = new IntRange(0, this.f1451j.b()).iterator();
        do {
            aVar = null;
            if (!it.hasNext()) {
                break;
            }
            int iA = this.f1451j.a(i10 - ((K) it).nextInt());
            a aVar2 = (a) this.f1448g.get(Integer.valueOf(iA));
            if (aVar2 != null) {
                if (!aVar2.b()) {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar = new C5.a(iA, aVar2.a());
                }
            }
        } while (aVar == null);
        return aVar;
    }

    private final l j(int i10) {
        C5.a aVarI = i(i10);
        if (aVarI == null) {
            return new l(null, l.a.MISSING);
        }
        Z4.a aVarClone = aVarI.a().clone();
        Intrinsics.checkNotNullExpressionValue(aVarClone, "clone(...)");
        this.f1452k = aVarI.b();
        return new l(aVarClone, l.a.NEAREST);
    }

    private final int k(p419x5.d dVar) {
        return (int) kotlin.ranges.e.f(TimeUnit.SECONDS.toMillis(1L) / ((long) (dVar.j() / dVar.a())), 1L);
    }

    private final void m(int i10, int i11) {
        if (this.f1450i) {
            return;
        }
        this.f1450i = true;
        B5.b.f585a.b(new f(this, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(g this$0, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        while (true) {
            g gVar = this$0;
            int i12 = i10;
            int i13 = i11;
            if (h(gVar, kotlin.ranges.e.e(this$0.f1452k, 0), i12, i13, 0, 8, null)) {
                gVar.f1450i = false;
                return;
            } else {
                this$0 = gVar;
                i10 = i12;
                i11 = i13;
            }
        }
    }

    private final void o(Z4.a aVar, int i10, int i11, int i12) throws IOException {
        Z4.a aVarA;
        Z4.a aVarD;
        C5.a aVarI = i(i10);
        if (aVarI != null && (aVarA = aVarI.a()) != null && (aVarD = aVarA.d()) != null) {
            try {
                int iB = aVarI.b();
                if (iB < i10) {
                    Object objM = aVarD.m();
                    Intrinsics.checkNotNullExpressionValue(objM, "get(...)");
                    p(aVar, (Bitmap) objM);
                    Iterator it = new IntRange(iB + 1, i10).iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((K) it).nextInt();
                        p437y5.c cVar = this.f1443b;
                        Object objM2 = aVar.m();
                        Intrinsics.checkNotNullExpressionValue(objM2, "get(...)");
                        cVar.a(iNextInt, (Bitmap) objM2);
                    }
                    kotlin.io.c.a(aVarD, null);
                    return;
                }
                Unit unit = Unit.f48228a;
                kotlin.io.c.a(aVarD, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.c.a(aVarD, th);
                    throw th2;
                }
            }
        }
        f(aVar);
        Iterator it2 = new IntRange(0, i10).iterator();
        while (it2.hasNext()) {
            int iNextInt2 = ((K) it2).nextInt();
            p437y5.c cVar2 = this.f1443b;
            Object objM3 = aVar.m();
            Intrinsics.checkNotNullExpressionValue(objM3, "get(...)");
            cVar2.a(iNextInt2, (Bitmap) objM3);
        }
    }

    private final Z4.a p(Z4.a aVar, Bitmap bitmap) {
        if (aVar.p() && !Intrinsics.b(aVar.m(), bitmap)) {
            Canvas canvas = new Canvas((Bitmap) aVar.m());
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        return aVar;
    }

    @Override // C5.j
    public void a() {
        j.a.a(this);
    }

    @Override // C5.j
    public void b(int i10, int i11, Function0 onAnimationLoaded) {
        Intrinsics.checkNotNullParameter(onAnimationLoaded, "onAnimationLoaded");
        m(i10, i11);
        onAnimationLoaded.invoke();
    }

    @Override // C5.j
    public l c(int i10, int i11, int i12) {
        Integer num = (Integer) this.f1453l.get(Integer.valueOf(i10));
        if (num == null) {
            return j(i10);
        }
        int iIntValue = num.intValue();
        this.f1452k = iIntValue;
        a aVar = (a) this.f1448g.get(num);
        if (aVar == null || !aVar.b()) {
            aVar = null;
        }
        if (aVar == null) {
            m(i11, i12);
            return j(iIntValue);
        }
        if (this.f1451j.c(this.f1449h, iIntValue, this.f1447f)) {
            m(i11, i12);
        }
        return new l(aVar.a().clone(), l.a.SUCCESS);
    }

    @Override // C5.j
    public void clear() {
        Collection collectionValues = this.f1448g.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        this.f1448g.clear();
        this.f1452k = -1;
    }

    @Override // C5.j
    public void d(int i10) {
        Map mapA = this.f1444c.a(l().j() * kotlin.ranges.e.e(l().b(), 1), l().a(), kotlin.ranges.e.i(i10, k(l())));
        this.f1453l = mapA;
        this.f1454m = CollectionsKt.Y0(mapA.values());
    }

    public p419x5.d l() {
        return this.f1445d;
    }
}
