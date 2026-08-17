package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.k;
import p002a1.n;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public class c extends e implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0326c f25689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f25691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f25692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f25693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f25694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Drawable.Callback f25695h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f25694g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f25694g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0326c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f25699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f25700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f25701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C4101a f25702e;

        public C0326c(Context context, C0326c c0326c, Drawable.Callback callback, Resources resources) {
            if (c0326c != null) {
                this.f25698a = c0326c.f25698a;
                f fVar = c0326c.f25699b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f25699b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f25699b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f25699b.mutate();
                    this.f25699b = fVar2;
                    fVar2.setCallback(callback);
                    this.f25699b.setBounds(c0326c.f25699b.getBounds());
                    this.f25699b.g(false);
                }
                ArrayList arrayList = c0326c.f25701d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f25701d = new ArrayList(size);
                    this.f25702e = new C4101a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0326c.f25701d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0326c.f25702e.get(animator);
                        animatorClone.setTarget(this.f25699b.c(str));
                        this.f25701d.add(animatorClone);
                        this.f25702e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f25700c == null) {
                this.f25700c = new AnimatorSet();
            }
            this.f25700c.playTogether(this.f25701d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25698a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f25703a;

        public d(Drawable.ConstantState constantState) {
            this.f25703a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f25703a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f25703a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f25703a.newDrawable();
            cVar.f25704a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f25695h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f25703a.newDrawable(resources);
            cVar.f25704a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f25695h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f25703a.newDrawable(resources, theme);
            cVar.f25704a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f25695h);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(Context context) {
        this(context, null, null);
    }

    private c(Context context, C0326c c0326c, Resources resources) {
        this.f25691d = null;
        this.f25693f = null;
        this.f25694g = null;
        a aVar = new a();
        this.f25695h = aVar;
        this.f25690c = context;
        if (c0326c != null) {
            this.f25689b = c0326c;
        } else {
            this.f25689b = new C0326c(context, c0326c, aVar, resources);
        }
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableF = k.f(context.getResources(), i10, context.getTheme());
        cVar.f25704a = drawableF;
        drawableF.setCallback(cVar.f25695h);
        cVar.f25692e = new d(cVar.f25704a.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f25693f;
        if (animatorListener != null) {
            this.f25689b.f25700c.removeListener(animatorListener);
            this.f25693f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f25689b.f25699b.c(str));
        C0326c c0326c = this.f25689b;
        if (c0326c.f25701d == null) {
            c0326c.f25701d = new ArrayList();
            this.f25689b.f25702e = new C4101a();
        }
        this.f25689b.f25701d.add(animator);
        this.f25689b.f25702e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f25694g == null) {
            this.f25694g = new ArrayList();
        }
        if (this.f25694g.contains(bVar)) {
            return;
        }
        this.f25694g.add(bVar);
        if (this.f25693f == null) {
            this.f25693f = new b();
        }
        this.f25689b.f25700c.addListener(this.f25693f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            return p038c1.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f25689b.f25699b.draw(canvas);
        if (this.f25689b.f25700c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f25694g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f25694g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f25704a;
        return drawable != null ? p038c1.a.d(drawable) : this.f25689b.f25699b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f25689b.f25698a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f25704a;
        return drawable != null ? p038c1.a.e(drawable) : this.f25689b.f25699b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f25704a != null) {
            return new d(this.f25704a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f25689b.f25699b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f25689b.f25699b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.getOpacity() : this.f25689b.f25699b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f25679e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f25695h);
                        f fVar = this.f25689b.f25699b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f25689b.f25699b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f25680f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f25690c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f25689b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f25704a;
        return drawable != null ? p038c1.a.h(drawable) : this.f25689b.f25699b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f25704a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f25689b.f25700c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.isStateful() : this.f25689b.f25699b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f25689b.f25699b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.setLevel(i10) : this.f25689b.f25699b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f25704a;
        return drawable != null ? drawable.setState(iArr) : this.f25689b.f25699b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f25689b.f25699b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.j(drawable, z10);
        } else {
            this.f25689b.f25699b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f25689b.f25699b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.n(drawable, i10);
        } else {
            this.f25689b.f25699b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.o(drawable, colorStateList);
        } else {
            this.f25689b.f25699b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            p038c1.a.p(drawable, mode);
        } else {
            this.f25689b.f25699b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f25689b.f25699b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f25689b.f25700c.isStarted()) {
                return;
            }
            this.f25689b.f25700c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f25704a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f25689b.f25700c.end();
        }
    }
}
