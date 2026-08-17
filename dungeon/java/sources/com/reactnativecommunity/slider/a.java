package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.C1836y;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class a extends C1836y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f38620n = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f38621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f38622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f38623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f38625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f38626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f38627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f38628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f38629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f38630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f38631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38632m;

    /* JADX INFO: renamed from: com.reactnativecommunity.slider.a$a, reason: collision with other inner class name */
    class C0420a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f38633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccessibilityEvent f38634b;

        C0420a(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            this.f38633a = accessibilityManager;
            this.f38634b = accessibilityEvent;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f38633a.sendAccessibilityEvent(this.f38634b);
        }
    }

    class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38636a;

        b(String str) {
            this.f38636a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitmapDrawable call() {
            Bitmap bitmapDecodeStream;
            try {
                if (this.f38636a.startsWith("http://") || this.f38636a.startsWith("https://") || this.f38636a.startsWith("file://") || this.f38636a.startsWith("asset://") || this.f38636a.startsWith("data:")) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(new URL(this.f38636a).openStream());
                } else {
                    bitmapDecodeStream = BitmapFactory.decodeResource(a.this.getResources(), a.this.getResources().getIdentifier(this.f38636a, "drawable", a.this.getContext().getPackageName()));
                }
                return new BitmapDrawable(a.this.getResources(), bitmapDecodeStream);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38621b = 0.0d;
        this.f38622c = 0.0d;
        this.f38623d = 0.0d;
        this.f38624e = false;
        this.f38625f = 0.0d;
        this.f38626g = 0.0d;
        this.f38629j = -9.223372036854776E18d;
        this.f38631l = 9.223372036854776E18d;
        super.setLayoutDirection(com.facebook.react.modules.i18nmanager.a.f().i(context) ? 1 : 0);
        a();
    }

    private void a() {
        if (Build.VERSION.SDK_INT < 26) {
            super.setStateListAnimator(null);
        }
    }

    private BitmapDrawable b(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new b(str)).get();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void f() {
        if (this.f38625f == 0.0d) {
            this.f38626g = (this.f38622c - this.f38621b) / ((double) f38620n);
        }
        setMax(getTotalSteps());
        setKeyProgressIncrement(1);
        g();
        h();
        i();
    }

    private void g() {
        double dMax = Math.max(this.f38629j, this.f38621b);
        double d10 = this.f38621b;
        this.f38630k = (int) Math.round(((dMax - d10) / (this.f38622c - d10)) * ((double) getTotalSteps()));
    }

    private double getStepValue() {
        double d10 = this.f38625f;
        return d10 > 0.0d ? d10 : this.f38626g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f38622c - this.f38621b) / getStepValue());
    }

    private void h() {
        double dMin = Math.min(this.f38631l, this.f38622c);
        double d10 = this.f38621b;
        this.f38632m = (int) Math.round(((dMin - d10) / (this.f38622c - d10)) * ((double) getTotalSteps()));
    }

    private void i() {
        double d10 = this.f38623d;
        double d11 = this.f38621b;
        setProgress((int) Math.round(((d10 - d11) / (this.f38622c - d11)) * ((double) getTotalSteps())));
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(getClass().getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityEventObtain.getText().add(charSequence);
            new Timer().schedule(new C0420a(accessibilityManager, accessibilityEventObtain), 1000L);
        }
    }

    void c(boolean z10) {
        this.f38624e = z10;
    }

    boolean d() {
        return this.f38624e;
    }

    public double e(int i10) {
        return i10 == getMax() ? this.f38622c : (((double) i10) * getStepValue()) + this.f38621b;
    }

    int getLowerLimit() {
        return this.f38630k;
    }

    int getUpperLimit() {
        return this.f38632m;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.f38623d);
        }
    }

    void setAccessibilityIncrements(List<String> list) {
        this.f38628i = list;
    }

    void setAccessibilityUnits(String str) {
        this.f38627h = str;
    }

    void setLowerLimit(double d10) {
        this.f38629j = d10;
        g();
    }

    void setMaxValue(double d10) {
        this.f38622c = d10;
        f();
    }

    void setMinValue(double d10) {
        this.f38621b = d10;
        f();
    }

    void setStep(double d10) {
        this.f38625f = d10;
        f();
    }

    public void setThumbImage(String str) {
        if (str == null) {
            setThumb(getThumb());
        } else {
            setThumb(b(str));
            setSplitTrack(false);
        }
    }

    void setUpperLimit(double d10) {
        this.f38631l = d10;
        h();
    }

    void setValue(double d10) {
        this.f38623d = d10;
        i();
    }

    public void setupAccessibility(int i10) {
        List list;
        if (this.f38627h == null || (list = this.f38628i) == null || list.size() - 1 != ((int) this.f38622c)) {
            return;
        }
        String str = (String) this.f38628i.get(i10);
        int length = this.f38627h.length();
        String strSubstring = this.f38627h;
        if (str != null && Integer.parseInt(str) == 1) {
            strSubstring = strSubstring.substring(0, length - 1);
        }
        announceForAccessibility(String.format("%s %s", str, strSubstring));
    }
}
