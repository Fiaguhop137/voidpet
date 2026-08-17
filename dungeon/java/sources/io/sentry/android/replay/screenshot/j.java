package io.sentry.android.replay.screenshot;

import Ad.v;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import io.sentry.C3833z3;
import io.sentry.EnumC3721i3;
import io.sentry.android.replay.r;
import io.sentry.android.replay.s;
import io.sentry.android.replay.util.q;
import io.sentry.android.replay.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f45532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3833z3 f45533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f45534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.android.replay.util.d f45535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f45536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.android.replay.util.i f45537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f45538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Bitmap f45539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f45540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f45541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f45542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f45543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f45544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f45545n;

    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f45547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Canvas f45548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, Canvas canvas) {
            super(1);
            this.f45547b = list;
            this.f45548c = canvas;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b node) {
            Pair pairA;
            Integer numI;
            Intrinsics.checkNotNullParameter(node, "node");
            if (node.c() && node.e() > 0 && node.b() > 0) {
                if (node.d() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof io.sentry.android.replay.viewhierarchy.b.c) {
                    List listE = CollectionsKt.e(node.d());
                    j jVar = j.this;
                    pairA = v.a(listE, Integer.valueOf(jVar.r(jVar.f45539h, node.d())));
                } else {
                    if (node instanceof io.sentry.android.replay.viewhierarchy.b.d) {
                        io.sentry.android.replay.viewhierarchy.b.d dVar = (io.sentry.android.replay.viewhierarchy.b.d) node;
                        q qVarJ = dVar.j();
                        pairA = v.a(io.sentry.android.replay.util.r.d(dVar.j(), node.d(), dVar.k(), dVar.l()), Integer.valueOf(((qVarJ == null || (numI = qVarJ.f()) == null) && (numI = dVar.i()) == null) ? -16777216 : numI.intValue()));
                    } else {
                        pairA = v.a(CollectionsKt.e(node.d()), -16777216);
                    }
                }
                List list = (List) pairA.getFirst();
                j.this.s().setColor(((Number) pairA.getSecond()).intValue());
                Canvas canvas = this.f45548c;
                j jVar2 = j.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, jVar2.s());
                }
                if (j.this.f45533b.getReplayController().F()) {
                    this.f45547b.addAll(list);
                }
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f45549a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    static final class c extends o implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            j jVar = j.this;
            matrix.preScale(jVar.f45534c.e(), jVar.f45534c.f());
            return matrix;
        }
    }

    static final class d extends o implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f45551a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bitmap invoke() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            return bitmapCreateBitmap;
        }
    }

    static final class e extends o implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(j.this.u());
        }
    }

    public j(io.sentry.android.replay.b executorProvider, r rVar, C3833z3 options, s config, io.sentry.android.replay.util.d debugOverlayDrawable) {
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(debugOverlayDrawable, "debugOverlayDrawable");
        this.f45532a = rVar;
        this.f45533b = options;
        this.f45534c = config;
        this.f45535d = debugOverlayDrawable;
        this.f45536e = executorProvider.c();
        this.f45537f = executorProvider.b();
        Ad.m mVar = Ad.m.NONE;
        this.f45538g = Ad.j.a(mVar, d.f45551a);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.d(), config.c(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f45539h = bitmapCreateBitmap;
        this.f45540i = Ad.j.a(mVar, new e());
        this.f45541j = Ad.j.a(mVar, new c());
        this.f45542k = new AtomicBoolean(false);
        this.f45543l = Ad.j.a(mVar, b.f45549a);
        this.f45544m = new AtomicBoolean(false);
        this.f45545n = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(j jVar, View view, int i10) {
        if (jVar.f45545n.get()) {
            jVar.f45533b.getLogger().c(EnumC3721i3.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 != 0) {
            jVar.f45533b.getLogger().c(EnumC3721i3.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i10));
            jVar.f45542k.set(false);
        } else if (jVar.f45544m.get()) {
            jVar.f45533b.getLogger().c(EnumC3721i3.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            jVar.f45542k.set(false);
        } else {
            io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f45629m.a(view, null, 0, jVar.f45533b);
            io.sentry.android.replay.util.r.k(view, bVarA, jVar.f45533b);
            jVar.f45536e.submit(new io.sentry.android.replay.util.m("screenshot_recorder.mask", new h(jVar, bVarA, view)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(j jVar, io.sentry.android.replay.viewhierarchy.b bVar, View view) {
        if (jVar.f45545n.get() || jVar.f45539h.isRecycled()) {
            jVar.f45533b.getLogger().c(EnumC3721i3.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(jVar.f45539h);
        canvas.setMatrix(jVar.t());
        bVar.h(jVar.new a(arrayList, canvas));
        if (jVar.f45533b.getReplayController().F()) {
            jVar.f45537f.b(new i(jVar, view, arrayList));
        }
        r rVar = jVar.f45532a;
        if (rVar != null) {
            rVar.e(jVar.f45539h);
        }
        jVar.f45542k.set(true);
        jVar.f45544m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(j jVar, View view, List list) {
        if (jVar.f45535d.getCallback() == null) {
            view.getOverlay().add(jVar.f45535d);
        }
        jVar.f45535d.b(list);
        view.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(j jVar) {
        if (!jVar.f45539h.isRecycled()) {
            synchronized (jVar.f45539h) {
                try {
                    if (!jVar.f45539h.isRecycled()) {
                        jVar.f45539h.recycle();
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (jVar.u().isRecycled()) {
            return;
        }
        jVar.u().recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Bitmap bitmap, Rect rect) {
        if (this.f45545n.get() || bitmap.isRecycled() || u().isRecycled()) {
            return -16777216;
        }
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        t().mapRect(rectF);
        rectF.round(rect2);
        v().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return u().getPixel(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Paint s() {
        return (Paint) this.f45543l.getValue();
    }

    private final Matrix t() {
        return (Matrix) this.f45541j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap u() {
        return (Bitmap) this.f45538g.getValue();
    }

    private final Canvas v() {
        return (Canvas) this.f45540i.getValue();
    }

    @Override // io.sentry.android.replay.screenshot.k
    public boolean a() {
        return this.f45542k.get();
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void b() {
        r rVar;
        if (!a() || this.f45539h.isRecycled() || (rVar = this.f45532a) == null) {
            return;
        }
        rVar.e(this.f45539h);
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void c(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        Window windowA = y.a(root);
        if (windowA == null) {
            this.f45533b.getLogger().c(EnumC3721i3.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (this.f45545n.get()) {
            this.f45533b.getLogger().c(EnumC3721i3.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.f45544m.set(false);
            PixelCopy.request(windowA, this.f45539h, new f(this, root), this.f45537f.a());
        } catch (Throwable th) {
            this.f45533b.getLogger().b(EnumC3721i3.WARNING, "Failed to capture replay recording", th);
            this.f45542k.set(false);
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void close() {
        this.f45545n.set(true);
        this.f45536e.submit(new io.sentry.android.replay.util.m("PixelCopyStrategy.close", new g(this)));
    }

    @Override // io.sentry.android.replay.screenshot.k
    public void onContentChanged() {
        this.f45544m.set(true);
    }
}
