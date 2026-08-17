package com.stroketext;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class a extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f38827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f38830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextPaint f38834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final TextPaint f38835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Layout.Alignment f38836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private StaticLayout f38837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private StaticLayout f38838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f38840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f38841p;

    /* JADX INFO: renamed from: com.stroketext.a$a, reason: collision with other inner class name */
    class RunnableC0427a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactContext f38842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38844c;

        RunnableC0427a(ReactContext reactContext, int i10, int i11) {
            this.f38842a = reactContext;
            this.f38843b = i10;
            this.f38844c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f38842a.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.updateNodeSize(a.this.getId(), this.f38843b, this.f38844c);
            }
        }
    }

    public a(C2262k0 c2262k0) {
        super(c2262k0);
        this.f38826a = "";
        this.f38827b = 14.0f;
        this.f38828c = -16777216;
        this.f38829d = -1;
        this.f38830e = 1.0f;
        this.f38831f = "sans-serif";
        this.f38832g = 0;
        this.f38833h = false;
        this.f38836k = Layout.Alignment.ALIGN_CENTER;
        this.f38839n = true;
        this.f38840o = 0.0f;
        this.f38841p = new HashMap();
        this.f38834i = new TextPaint(1);
        this.f38835j = new TextPaint(1);
    }

    private void a() {
        if (this.f38839n) {
            Typeface typefaceC = c(this.f38831f);
            this.f38834i.setTypeface(typefaceC);
            this.f38834i.setTextSize(this.f38827b);
            this.f38834i.setColor(this.f38828c);
            this.f38835j.setStyle(Paint.Style.STROKE);
            this.f38835j.setStrokeJoin(Paint.Join.ROUND);
            this.f38835j.setStrokeCap(Paint.Cap.ROUND);
            this.f38835j.setStrokeWidth(this.f38830e);
            this.f38835j.setColor(this.f38829d);
            this.f38835j.setTypeface(typefaceC);
            this.f38835j.setTextSize(this.f38827b);
            int iB = (int) b();
            CharSequence charSequenceEllipsize = this.f38833h ? TextUtils.ellipsize(this.f38826a, this.f38834i, iB, TextUtils.TruncateAt.END) : this.f38826a;
            StaticLayout staticLayout = new StaticLayout(charSequenceEllipsize, this.f38834i, iB, this.f38836k, 1.0f, 0.0f, false);
            this.f38837l = staticLayout;
            int i10 = this.f38832g;
            if (i10 > 0 && i10 < staticLayout.getLineCount()) {
                charSequenceEllipsize = charSequenceEllipsize.subSequence(0, this.f38837l.getLineEnd(this.f38832g - 1));
                this.f38837l = new StaticLayout(charSequenceEllipsize, this.f38834i, iB, this.f38836k, 1.0f, 0.0f, false);
            }
            this.f38838m = new StaticLayout(charSequenceEllipsize, this.f38835j, iB, this.f38836k, 1.0f, 0.0f, false);
            this.f38839n = false;
        }
    }

    private float b() {
        float f10 = this.f38840o;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            return d(f10);
        }
        for (String str : this.f38826a.split("\n")) {
            float fMeasureText = this.f38834i.measureText(str);
            if (fMeasureText > f11) {
                f11 = fMeasureText;
            }
        }
        return f11 + (d(this.f38830e) / 2.0f);
    }

    private Typeface c(String str) {
        if (this.f38841p.containsKey(str)) {
            return (Typeface) this.f38841p.get(str);
        }
        Typeface typefaceB = Fa.a.b(getContext(), str);
        this.f38841p.put(str, typefaceB);
        return typefaceB;
    }

    private float d(float f10) {
        return TypedValue.applyDimension(2, f10, getResources().getDisplayMetrics());
    }

    private int e(String str) {
        if (str.startsWith("#")) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgb")) {
            return f(str);
        }
        return -16777216;
    }

    private int f(String str) {
        String[] strArrSplit = str.replaceAll("[rgba()\\s]", "").split(",");
        return Color.argb(strArrSplit.length > 3 ? (int) (Float.parseFloat(strArrSplit[3]) * 255.0f) : 255, Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
    }

    private void q(int i10, int i11) {
        ReactContext reactContext = (ReactContext) getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC0427a(reactContext, i10, i11));
    }

    public void g(float f10) {
        if (this.f38840o != f10) {
            this.f38840o = f10;
            this.f38839n = true;
            invalidate();
        }
    }

    public void h(boolean z10) {
        if (this.f38833h != z10) {
            this.f38833h = z10;
            this.f38839n = true;
            invalidate();
        }
    }

    public void i(String str) {
        if (this.f38831f.equals(str)) {
            return;
        }
        this.f38831f = str;
        this.f38839n = true;
        invalidate();
    }

    public void j(float f10) {
        float fD = d(f10);
        if (this.f38827b != fD) {
            this.f38827b = fD;
            this.f38839n = true;
            invalidate();
        }
    }

    public void k(int i10) {
        if (this.f38832g != i10) {
            this.f38832g = i10;
            this.f38839n = true;
            invalidate();
        }
    }

    public void l(String str) {
        int iE = e(str);
        if (this.f38829d != iE) {
            this.f38829d = iE;
            this.f38839n = true;
            invalidate();
        }
    }

    public void m(float f10) {
        float fD = d(f10);
        if (this.f38830e != fD) {
            this.f38830e = fD;
            this.f38839n = true;
            invalidate();
        }
    }

    public void n(String str) {
        if (this.f38826a.equals(str)) {
            return;
        }
        this.f38826a = str;
        this.f38839n = true;
        invalidate();
    }

    public void o(String str) {
        Layout.Alignment alignment;
        if ("left".equals(str)) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if ("right".equals(str)) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = "center".equals(str) ? Layout.Alignment.ALIGN_CENTER : this.f38836k;
        }
        if (this.f38836k != alignment) {
            this.f38836k = alignment;
            this.f38839n = true;
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
        this.f38838m.draw(canvas);
        this.f38837l.draw(canvas);
        q(this.f38837l.getWidth(), this.f38837l.getHeight());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f38839n = true;
        a();
    }

    public void p(String str) {
        int iE = e(str);
        if (this.f38828c != iE) {
            this.f38828c = iE;
            this.f38839n = true;
            invalidate();
        }
    }
}
