package R3;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: R3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1363j extends androidx.appcompat.widget.r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f10788q = "j";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final P f10789r = new C1360g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P f10790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P f10791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private P f10792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L f10794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f10795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f10800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f10801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private W f10802p;

    /* JADX INFO: renamed from: R3.j$a */
    private static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0162a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f10803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f10805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f10806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f10807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10809g;

        /* JADX INFO: renamed from: R3.j$a$a, reason: collision with other inner class name */
        class C0162a implements Parcelable.Creator {
            C0162a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        private a(Parcel parcel) {
            super(parcel);
            this.f10803a = parcel.readString();
            this.f10805c = parcel.readFloat();
            this.f10806d = parcel.readInt() == 1;
            this.f10807e = parcel.readString();
            this.f10808f = parcel.readInt();
            this.f10809g = parcel.readInt();
        }

        /* synthetic */ a(Parcel parcel, AbstractC1362i abstractC1362i) {
            this(parcel);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f10803a);
            parcel.writeFloat(this.f10805c);
            parcel.writeInt(this.f10806d ? 1 : 0);
            parcel.writeString(this.f10807e);
            parcel.writeInt(this.f10808f);
            parcel.writeInt(this.f10809g);
        }
    }

    /* JADX INFO: renamed from: R3.j$b */
    private enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: renamed from: R3.j$c */
    private static class c implements P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f10817a;

        public c(C1363j c1363j) {
            this.f10817a = new WeakReference(c1363j);
        }

        @Override // R3.P
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            C1363j c1363j = (C1363j) this.f10817a.get();
            if (c1363j == null) {
                return;
            }
            if (c1363j.f10793g != 0) {
                c1363j.setImageResource(c1363j.f10793g);
            }
            (c1363j.f10792f == null ? C1363j.f10789r : c1363j.f10792f).onResult(th);
        }
    }

    /* JADX INFO: renamed from: R3.j$d */
    private static class d implements P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f10818a;

        public d(C1363j c1363j) {
            this.f10818a = new WeakReference(c1363j);
        }

        @Override // R3.P
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(C1364k c1364k) {
            C1363j c1363j = (C1363j) this.f10818a.get();
            if (c1363j == null) {
                return;
            }
            c1363j.setComposition(c1364k);
        }
    }

    public C1363j(Context context) {
        super(context);
        this.f10790d = new d(this);
        this.f10791e = new c(this);
        this.f10793g = 0;
        this.f10794h = new L();
        this.f10797k = false;
        this.f10798l = false;
        this.f10799m = true;
        this.f10800n = new HashSet();
        this.f10801o = new HashSet();
        r(null, Y.f10734a);
    }

    private void B() {
        boolean zS = s();
        setImageDrawable(null);
        setImageDrawable(this.f10794h);
        if (zS) {
            this.f10794h.o0();
        }
    }

    private void D(float f10, boolean z10) {
        if (z10) {
            this.f10800n.add(b.SET_PROGRESS);
        }
        this.f10794h.P0(f10);
    }

    public static /* synthetic */ U c(C1363j c1363j, String str) {
        return c1363j.f10799m ? AbstractC1373u.n(c1363j.getContext(), str) : AbstractC1373u.o(c1363j.getContext(), str, null);
    }

    public static /* synthetic */ void d(Throwable th) {
        if (!p077e4.r.k(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        p077e4.g.d("Unable to load composition.", th);
    }

    public static /* synthetic */ U e(C1363j c1363j, int i10) {
        return c1363j.f10799m ? AbstractC1373u.z(c1363j.getContext(), i10) : AbstractC1373u.A(c1363j.getContext(), i10, null);
    }

    private void m() {
        W w10 = this.f10802p;
        if (w10 != null) {
            w10.k(this.f10790d);
            this.f10802p.j(this.f10791e);
        }
    }

    private void n() {
        this.f10794h.v();
    }

    private W p(String str) {
        if (isInEditMode()) {
            return new W(new CallableC1359f(this, str), true);
        }
        return this.f10799m ? AbstractC1373u.l(getContext(), str) : AbstractC1373u.m(getContext(), str, null);
    }

    private W q(int i10) {
        if (isInEditMode()) {
            return new W(new CallableC1361h(this, i10), true);
        }
        return this.f10799m ? AbstractC1373u.x(getContext(), i10) : AbstractC1373u.y(getContext(), i10, null);
    }

    private void r(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Z.f10735a, i10, 0);
        this.f10799m = typedArrayObtainStyledAttributes.getBoolean(Z.f10740f, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(Z.f10752r);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(Z.f10747m);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(Z.f10757w);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(Z.f10752r, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(Z.f10747m);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(Z.f10757w)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(Z.f10746l, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(Z.f10739e, false)) {
            this.f10798l = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(Z.f10750p, false)) {
            this.f10794h.R0(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10755u)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(Z.f10755u, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10754t)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(Z.f10754t, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10756v)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(Z.f10756v, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10742h)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(Z.f10742h, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10741g)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(Z.f10741g, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10744j)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(Z.f10744j));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(Z.f10749o));
        D(typedArrayObtainStyledAttributes.getFloat(Z.f10751q, 0.0f), typedArrayObtainStyledAttributes.hasValue(Z.f10751q));
        o(typedArrayObtainStyledAttributes.getBoolean(Z.f10745k, false));
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(Z.f10736b, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(Z.f10737c, true));
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10743i)) {
            k(new X3.e("**"), T.f10688N, new p095f4.c(new b0(p161j.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(Z.f10743i, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10753s)) {
            int i11 = Z.f10753s;
            a0 a0Var = a0.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i11, a0Var.ordinal());
            if (iOrdinal >= a0.values().length) {
                iOrdinal = a0Var.ordinal();
            }
            setRenderMode(a0.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10738d)) {
            int i12 = Z.f10738d;
            EnumC1354a enumC1354a = EnumC1354a.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i12, enumC1354a.ordinal());
            if (iOrdinal2 >= a0.values().length) {
                iOrdinal2 = enumC1354a.ordinal();
            }
            setAsyncUpdates(EnumC1354a.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(Z.f10748n, false));
        if (typedArrayObtainStyledAttributes.hasValue(Z.f10758x)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(Z.f10758x, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(W w10) {
        U uE = w10.e();
        L l10 = this.f10794h;
        if (uE != null && l10 == getDrawable() && l10.J() == uE.b()) {
            return;
        }
        this.f10800n.add(b.SET_ANIMATION);
        n();
        m();
        this.f10802p = w10.d(this.f10790d).c(this.f10791e);
    }

    public void A(String str, String str2) {
        setCompositionTask(AbstractC1373u.C(getContext(), str, str2));
    }

    public void C(int i10, int i11) {
        this.f10794h.I0(i10, i11);
    }

    public EnumC1354a getAsyncUpdates() {
        return this.f10794h.E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f10794h.F();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f10794h.H();
    }

    public boolean getClipToCompositionBounds() {
        return this.f10794h.I();
    }

    public C1364k getComposition() {
        Drawable drawable = getDrawable();
        L l10 = this.f10794h;
        if (drawable == l10) {
            return l10.J();
        }
        return null;
    }

    public long getDuration() {
        C1364k composition = getComposition();
        if (composition != null) {
            return (long) composition.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f10794h.M();
    }

    public String getImageAssetsFolder() {
        return this.f10794h.O();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f10794h.Q();
    }

    public float getMaxFrame() {
        return this.f10794h.S();
    }

    public float getMinFrame() {
        return this.f10794h.T();
    }

    public X getPerformanceTracker() {
        return this.f10794h.U();
    }

    public float getProgress() {
        return this.f10794h.V();
    }

    public a0 getRenderMode() {
        return this.f10794h.W();
    }

    public int getRepeatCount() {
        return this.f10794h.X();
    }

    public int getRepeatMode() {
        return this.f10794h.Y();
    }

    public float getSpeed() {
        return this.f10794h.Z();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f10794h.q(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof L) && ((L) drawable).W() == a0.SOFTWARE) {
            this.f10794h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        L l10 = this.f10794h;
        if (drawable2 == l10) {
            super.invalidateDrawable(l10);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(S s10) {
        C1364k composition = getComposition();
        if (composition != null) {
            s10.a(composition);
        }
        return this.f10801o.add(s10);
    }

    public void k(X3.e eVar, Object obj, p095f4.c cVar) {
        this.f10794h.r(eVar, obj, cVar);
    }

    public void l() {
        this.f10798l = false;
        this.f10800n.add(b.PLAY_OPTION);
        this.f10794h.u();
    }

    public void o(boolean z10) {
        this.f10794h.A(M.MergePathsApi19, z10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f10798l) {
            return;
        }
        this.f10794h.l0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f10795i = aVar.f10803a;
        Set set = this.f10800n;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f10795i)) {
            setAnimation(this.f10795i);
        }
        this.f10796j = aVar.f10804b;
        if (!this.f10800n.contains(bVar) && (i10 = this.f10796j) != 0) {
            setAnimation(i10);
        }
        if (!this.f10800n.contains(b.SET_PROGRESS)) {
            D(aVar.f10805c, false);
        }
        if (!this.f10800n.contains(b.PLAY_OPTION) && aVar.f10806d) {
            u();
        }
        if (!this.f10800n.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(aVar.f10807e);
        }
        if (!this.f10800n.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(aVar.f10808f);
        }
        if (this.f10800n.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(aVar.f10809g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f10803a = this.f10795i;
        aVar.f10804b = this.f10796j;
        aVar.f10805c = this.f10794h.V();
        aVar.f10806d = this.f10794h.e0();
        aVar.f10807e = this.f10794h.O();
        aVar.f10808f = this.f10794h.Y();
        aVar.f10809g = this.f10794h.X();
        return aVar;
    }

    public boolean s() {
        return this.f10794h.d0();
    }

    public void setAnimation(int i10) {
        this.f10796j = i10;
        this.f10795i = null;
        setCompositionTask(q(i10));
    }

    public void setAnimation(String str) {
        this.f10795i = str;
        this.f10796j = 0;
        setCompositionTask(p(str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f10799m ? AbstractC1373u.B(getContext(), str) : AbstractC1373u.C(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f10794h.r0(z10);
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.f10794h.s0(z10);
    }

    public void setAsyncUpdates(EnumC1354a enumC1354a) {
        this.f10794h.t0(enumC1354a);
    }

    public void setCacheComposition(boolean z10) {
        this.f10799m = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f10794h.u0(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f10794h.v0(z10);
    }

    public void setComposition(@NonNull C1364k c1364k) {
        if (AbstractC1358e.f10773a) {
            Log.v(f10788q, "Set Composition \n" + c1364k);
        }
        this.f10794h.setCallback(this);
        this.f10797k = true;
        boolean zW0 = this.f10794h.w0(c1364k);
        if (this.f10798l) {
            this.f10794h.l0();
        }
        this.f10797k = false;
        if (getDrawable() != this.f10794h || zW0) {
            if (!zW0) {
                B();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f10801o.iterator();
            while (it.hasNext()) {
                ((S) it.next()).a(c1364k);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f10794h.x0(str);
    }

    public void setFailureListener(P p10) {
        this.f10792f = p10;
    }

    public void setFallbackResource(int i10) {
        this.f10793g = i10;
    }

    public void setFontAssetDelegate(AbstractC1355b abstractC1355b) {
        this.f10794h.y0(abstractC1355b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f10794h.z0(map);
    }

    public void setFrame(int i10) {
        this.f10794h.A0(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f10794h.B0(z10);
    }

    public void setImageAssetDelegate(InterfaceC1356c interfaceC1356c) {
        this.f10794h.C0(interfaceC1356c);
    }

    public void setImageAssetsFolder(String str) {
        this.f10794h.D0(str);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f10796j = 0;
        this.f10795i = null;
        m();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f10796j = 0;
        this.f10795i = null;
        m();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f10796j = 0;
        this.f10795i = null;
        m();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f10794h.E0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f10794h.F0(i10);
    }

    public void setMaxFrame(String str) {
        this.f10794h.G0(str);
    }

    public void setMaxProgress(float f10) {
        this.f10794h.H0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f10794h.J0(str);
    }

    public void setMinFrame(int i10) {
        this.f10794h.K0(i10);
    }

    public void setMinFrame(String str) {
        this.f10794h.L0(str);
    }

    public void setMinProgress(float f10) {
        this.f10794h.M0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f10794h.N0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f10794h.O0(z10);
    }

    public void setProgress(float f10) {
        D(f10, true);
    }

    public void setRenderMode(a0 a0Var) {
        this.f10794h.Q0(a0Var);
    }

    public void setRepeatCount(int i10) {
        this.f10800n.add(b.SET_REPEAT_COUNT);
        this.f10794h.R0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f10800n.add(b.SET_REPEAT_MODE);
        this.f10794h.S0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f10794h.T0(z10);
    }

    public void setSpeed(float f10) {
        this.f10794h.U0(f10);
    }

    public void setTextDelegate(c0 c0Var) {
        this.f10794h.V0(c0Var);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f10794h.W0(z10);
    }

    public void t() {
        this.f10798l = false;
        this.f10794h.k0();
    }

    public void u() {
        this.f10800n.add(b.PLAY_OPTION);
        this.f10794h.l0();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        L l10;
        if (!this.f10797k && drawable == (l10 = this.f10794h) && l10.d0()) {
            t();
        } else if (!this.f10797k && (drawable instanceof L)) {
            L l11 = (L) drawable;
            if (l11.d0()) {
                l11.k0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f10800n.add(b.PLAY_OPTION);
        this.f10794h.o0();
    }

    public void w() {
        this.f10794h.p0();
    }

    public void x(InputStream inputStream, String str) {
        setCompositionTask(AbstractC1373u.q(inputStream, str));
    }

    public void y(ZipInputStream zipInputStream, String str) {
        setCompositionTask(AbstractC1373u.E(zipInputStream, str));
    }

    public void z(String str, String str2) {
        x(new ByteArrayInputStream(str.getBytes()), str2);
    }
}
