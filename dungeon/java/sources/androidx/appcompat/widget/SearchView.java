package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class SearchView extends T implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final o f20645p0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Rect f20646A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int[] f20647B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int[] f20648C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final ImageView f20649D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Drawable f20650E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f20651F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f20652G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Intent f20653H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Intent f20654I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final CharSequence f20655J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private m f20656K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private l f20657L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    View.OnFocusChangeListener f20658M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private View.OnClickListener f20659N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f20660O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f20661P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    p289q1.a f20662Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f20663R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private CharSequence f20664S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f20665T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f20666U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f20667V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f20668W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence f20669a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence f20670b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f20671c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f20672d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    SearchableInfo f20673e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Bundle f20674f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Runnable f20675g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Runnable f20676h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final WeakHashMap f20677i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final View.OnClickListener f20678j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    View.OnKeyListener f20679k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f20680l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f20681m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f20682n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private TextWatcher f20683o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f20684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f20685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f20686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f20687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ImageView f20688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ImageView f20689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f20690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f20691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f20692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private q f20693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f20694z;

    public static class SearchAutoComplete extends C1816d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f20696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f20697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f20698h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, p144i.a.f43085m);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f20698h = new a();
            this.f20695e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f20645p0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f20697g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f20697g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f20695e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1816d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f20697g) {
                removeCallbacks(this.f20698h);
                post(this.f20698h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f20696f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f20696f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f20696f.hasFocus() && getVisibility() == 0) {
                this.f20697g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f20697g = false;
                removeCallbacks(this.f20698h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f20697g = true;
                    return;
                }
                this.f20697g = false;
                removeCallbacks(this.f20698h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f20696f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f20695e = i10;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p289q1.a aVar = SearchView.this.f20662Q;
            if (aVar instanceof b0) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f20658M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f20688t) {
                searchView.T();
                return;
            }
            if (view == searchView.f20690v) {
                searchView.P();
                return;
            }
            if (view == searchView.f20689u) {
                searchView.U();
            } else if (view == searchView.f20691w) {
                searchView.Y();
            } else if (view == searchView.f20684p) {
                searchView.F();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f20673e0 == null) {
                return false;
            }
            if (searchView.f20684p.isPopupShowing() && SearchView.this.f20684p.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f20684p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f20684p.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f20710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f20711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f20712c;

        o() {
            this.f20710a = null;
            this.f20711b = null;
            this.f20712c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f20710a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f20711b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f20712c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f20711b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f20710a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f20712c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends p325s1.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f20713c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f20713c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f20713c + "}";
        }

        @Override // p325s1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f20713c));
        }
    }

    private static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f20714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f20715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f20716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f20717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f20718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20719f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f20718e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f20715b = new Rect();
            this.f20717d = new Rect();
            this.f20716c = new Rect();
            a(rect, rect2);
            this.f20714a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f20715b.set(rect);
            this.f20717d.set(rect);
            Rect rect3 = this.f20717d;
            int i10 = this.f20718e;
            rect3.inset(-i10, -i10);
            this.f20716c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f20719f;
                    if (z11 && !this.f20717d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f20719f;
                    this.f20719f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f20715b.contains(x10, y10)) {
                this.f20719f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f20716c.contains(x10, y10)) {
                Rect rect = this.f20716c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f20714a.getWidth() / 2, this.f20714a.getHeight() / 2);
            }
            return this.f20714a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f20645p0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p144i.a.f43066G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20694z = new Rect();
        this.f20646A = new Rect();
        this.f20647B = new int[2];
        this.f20648C = new int[2];
        this.f20675g0 = new b();
        this.f20676h0 = new c();
        this.f20677i0 = new WeakHashMap();
        f fVar = new f();
        this.f20678j0 = fVar;
        this.f20679k0 = new g();
        h hVar = new h();
        this.f20680l0 = hVar;
        i iVar = new i();
        this.f20681m0 = iVar;
        j jVar = new j();
        this.f20682n0 = jVar;
        this.f20683o0 = new a();
        h0 h0VarV = h0.v(context, attributeSet, p144i.j.f43397f2, i10, 0);
        androidx.core.view.Z.k0(this, context, p144i.j.f43397f2, attributeSet, h0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(h0VarV.n(p144i.j.f43447p2, p144i.g.f43226r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(p144i.f.f43170E);
        this.f20684p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f20685q = findViewById(p144i.f.f43166A);
        View viewFindViewById = findViewById(p144i.f.f43169D);
        this.f20686r = viewFindViewById;
        View viewFindViewById2 = findViewById(p144i.f.f43176K);
        this.f20687s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(p144i.f.f43207y);
        this.f20688t = imageView;
        ImageView imageView2 = (ImageView) findViewById(p144i.f.f43167B);
        this.f20689u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(p144i.f.f43208z);
        this.f20690v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(p144i.f.f43171F);
        this.f20691w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(p144i.f.f43168C);
        this.f20649D = imageView5;
        androidx.core.view.Z.q0(viewFindViewById, h0VarV.g(p144i.j.f43452q2));
        androidx.core.view.Z.q0(viewFindViewById2, h0VarV.g(p144i.j.f43472u2));
        imageView.setImageDrawable(h0VarV.g(p144i.j.f43467t2));
        imageView2.setImageDrawable(h0VarV.g(p144i.j.f43437n2));
        imageView3.setImageDrawable(h0VarV.g(p144i.j.f43422k2));
        imageView4.setImageDrawable(h0VarV.g(p144i.j.f43482w2));
        imageView5.setImageDrawable(h0VarV.g(p144i.j.f43467t2));
        this.f20650E = h0VarV.g(p144i.j.f43462s2);
        m0.a(imageView, getResources().getString(p144i.h.f43242n));
        this.f20651F = h0VarV.n(p144i.j.f43477v2, p144i.g.f43225q);
        this.f20652G = h0VarV.n(p144i.j.f43427l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f20683o0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f20679k0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(h0VarV.a(p144i.j.f43442o2, true));
        int iF = h0VarV.f(p144i.j.f43407h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f20655J = h0VarV.p(p144i.j.f43432m2);
        this.f20664S = h0VarV.p(p144i.j.f43457r2);
        int iK = h0VarV.k(p144i.j.f43417j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = h0VarV.k(p144i.j.f43412i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(h0VarV.a(p144i.j.f43402g2, true));
        h0VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f20653H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f20654I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f20692x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.f20660O);
        e0();
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f20670b0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f20674f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f20673e0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = b0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f20673e0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = b0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f20673e0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = b0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return A(str2, strN3 == null ? null : Uri.parse(strN3), b0.n(cursor, "suggest_intent_extra_data"), b0.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f20674f0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.f20684p.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.f20647B);
        getLocationInWindow(this.f20648C);
        int[] iArr = this.f20647B;
        int i10 = iArr[1];
        int[] iArr2 = this.f20648C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.f20660O || this.f20650E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f20684p.getTextSize()) * 1.25d);
        this.f20650E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f20650E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f20673e0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f20673e0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f20653H;
            } else {
                intent = this.f20673e0.getVoiceSearchLaunchRecognizer() ? this.f20654I : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.f20663R || this.f20668W) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor cursorC = this.f20662Q.c();
        if (cursorC == null || !cursorC.moveToPosition(i10)) {
            return false;
        }
        M(B(cursorC, i11, str));
        return true;
    }

    private void Z() {
        post(this.f20675g0);
    }

    private void a0(int i10) {
        Editable text = this.f20684p.getText();
        Cursor cursorC = this.f20662Q.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f20662Q.convertToString(cursorC);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f20684p.getText());
        this.f20690v.setVisibility(!zIsEmpty || (this.f20660O && !this.f20671c0) ? 0 : 8);
        Drawable drawable = this.f20690v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f20684p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f20684p.setThreshold(this.f20673e0.getSuggestThreshold());
        this.f20684p.setImeOptions(this.f20673e0.getImeOptions());
        int inputType = this.f20673e0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f20673e0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f20684p.setInputType(inputType);
        p289q1.a aVar = this.f20662Q;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f20673e0.getSuggestAuthority() != null) {
            b0 b0Var = new b0(getContext(), this, this.f20673e0, this.f20677i0);
            this.f20662Q = b0Var;
            this.f20684p.setAdapter(b0Var);
            ((b0) this.f20662Q).w(this.f20665T ? 2 : 1);
        }
    }

    private void g0() {
        this.f20687s.setVisibility((L() && (this.f20689u.getVisibility() == 0 || this.f20691w.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p144i.d.f43112e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p144i.d.f43113f);
    }

    private void h0(boolean z10) {
        this.f20689u.setVisibility((this.f20663R && L() && hasFocus() && (z10 || !this.f20668W)) ? 0 : 8);
    }

    private void i0(boolean z10) {
        this.f20661P = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f20684p.getText());
        this.f20688t.setVisibility(i11);
        h0(!zIsEmpty);
        this.f20685q.setVisibility(z10 ? 8 : 0);
        if (this.f20649D.getDrawable() != null && !this.f20660O) {
            i10 = 0;
        }
        this.f20649D.setVisibility(i10);
        c0();
        j0(zIsEmpty);
        g0();
    }

    private void j0(boolean z10) {
        int i10 = 8;
        if (this.f20668W && !J() && z10) {
            this.f20689u.setVisibility(8);
            i10 = 0;
        }
        this.f20691w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f20684p.setText(charSequence);
        this.f20684p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f20684p);
            return;
        }
        o oVar = f20645p0;
        oVar.b(this.f20684p);
        oVar.a(this.f20684p);
    }

    public boolean J() {
        return this.f20661P;
    }

    void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.f20684p.getText())) {
            this.f20684p.setText("");
            this.f20684p.requestFocus();
            this.f20684p.setImeVisibility(true);
        } else if (this.f20660O) {
            l lVar = this.f20657L;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f20684p.setImeVisibility(false);
        E();
        return true;
    }

    boolean R(int i10) {
        a0(i10);
        return true;
    }

    protected void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.f20684p.requestFocus();
        this.f20684p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f20659N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.f20684p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f20656K;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f20673e0 != null) {
                N(0, null, text.toString());
            }
            this.f20684p.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f20673e0 != null && this.f20662Q != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f20684p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f20684p.setSelection(i10 == 21 ? 0 : this.f20684p.length());
                this.f20684p.setListSelection(0);
                this.f20684p.clearListSelection();
                this.f20684p.b();
                return true;
            }
            if (i10 == 19) {
                this.f20684p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.f20684p.getText();
        this.f20670b0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        h0(!zIsEmpty);
        j0(zIsEmpty);
        c0();
        g0();
        if (this.f20656K != null && !TextUtils.equals(charSequence, this.f20669a0)) {
            this.f20656K.a(charSequence.toString());
        }
        this.f20669a0 = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.f20684p.hasFocus()) {
            F();
        }
    }

    void Y() {
        SearchableInfo searchableInfo = this.f20673e0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.f20653H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.f20654I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f20684p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f20684p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f20670b0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f20666U = true;
        super.clearFocus();
        this.f20684p.clearFocus();
        this.f20684p.setImeVisibility(false);
        this.f20666U = false;
    }

    void d0() {
        int[] iArr = this.f20684p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f20686r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f20687s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f20684p.getImeOptions();
    }

    public int getInputType() {
        return this.f20684p.getInputType();
    }

    public int getMaxWidth() {
        return this.f20667V;
    }

    public CharSequence getQuery() {
        return this.f20684p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f20664S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f20673e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f20655J : getContext().getText(this.f20673e0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f20652G;
    }

    int getSuggestionRowLayout() {
        return this.f20651F;
    }

    public p289q1.a getSuggestionsAdapter() {
        return this.f20662Q;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f20684p.setImeOptions(this.f20672d0);
        this.f20671c0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f20671c0) {
            return;
        }
        this.f20671c0 = true;
        int imeOptions = this.f20684p.getImeOptions();
        this.f20672d0 = imeOptions;
        this.f20684p.setImeOptions(imeOptions | 33554432);
        this.f20684p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f20675g0);
        post(this.f20676h0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f20684p, this.f20694z);
            Rect rect = this.f20646A;
            Rect rect2 = this.f20694z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f20693y;
            if (qVar != null) {
                qVar.a(this.f20646A, this.f20694z);
                return;
            }
            q qVar2 = new q(this.f20646A, this.f20694z, this.f20684p);
            this.f20693y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f20667V;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f20667V;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f20667V) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f());
        i0(pVar.f20713c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f20713c = J();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f20666U || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f20684p.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f20674f0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f20660O == z10) {
            return;
        }
        this.f20660O = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f20684p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f20684p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f20667V = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f20657L = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f20658M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f20656K = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f20659N = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f20664S = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f20665T = z10;
        p289q1.a aVar = this.f20662Q;
        if (aVar instanceof b0) {
            ((b0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f20673e0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.f20668W = zI;
        if (zI) {
            this.f20684p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f20663R = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(p289q1.a aVar) {
        this.f20662Q = aVar;
        this.f20684p.setAdapter(aVar);
    }

    void z() {
        if (this.f20692x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f20686r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = s0.b(this);
            int dimensionPixelSize = this.f20660O ? resources.getDimensionPixelSize(p144i.d.f43110c) + resources.getDimensionPixelSize(p144i.d.f43111d) : 0;
            this.f20684p.getDropDownBackground().getPadding(rect);
            this.f20684p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f20684p.setDropDownWidth((((this.f20692x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
