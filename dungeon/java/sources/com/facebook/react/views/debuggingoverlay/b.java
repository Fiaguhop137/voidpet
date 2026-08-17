package com.facebook.react.views.debuggingoverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f30689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f30690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f30691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f30692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f30693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f30689a = paint;
        this.f30690b = new HashMap();
        this.f30691c = new HashMap();
        Paint paint2 = new Paint();
        this.f30692d = paint2;
        this.f30693e = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar, int i10) {
        bVar.f30690b.remove(Integer.valueOf(i10));
        bVar.f30691c.remove(Integer.valueOf(i10));
        bVar.invalidate();
    }

    public final void b() {
        this.f30693e.clear();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (Object obj : this.f30690b.values()) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            c cVar = (c) obj;
            this.f30689a.setColor(cVar.a());
            canvas.drawRect(cVar.c(), this.f30689a);
            int iB = cVar.b();
            a aVar = new a(this, iB);
            if (!this.f30691c.containsKey(Integer.valueOf(iB))) {
                this.f30691c.put(Integer.valueOf(iB), aVar);
                UiThreadUtil.runOnUiThread(aVar, 2000L);
            }
        }
        Iterator it = this.f30693e.iterator();
        while (it.hasNext()) {
            canvas.drawRect((RectF) it.next(), this.f30692d);
        }
    }

    public final void setHighlightedElementsRectangles(@NotNull List<RectF> elementsRectangles) {
        Intrinsics.checkNotNullParameter(elementsRectangles, "elementsRectangles");
        this.f30693e = elementsRectangles;
        invalidate();
    }

    public final void setTraceUpdates(@NotNull List<c> traceUpdates) {
        Intrinsics.checkNotNullParameter(traceUpdates, "traceUpdates");
        for (c cVar : traceUpdates) {
            int iB = cVar.b();
            if (this.f30691c.containsKey(Integer.valueOf(iB))) {
                Runnable runnable = (Runnable) this.f30691c.get(Integer.valueOf(iB));
                if (runnable != null) {
                    UiThreadUtil.removeOnUiThread(runnable);
                }
                this.f30691c.remove(Integer.valueOf(iB));
            }
            this.f30690b.put(Integer.valueOf(iB), cVar);
        }
        invalidate();
    }
}
