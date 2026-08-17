package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.T;
import androidx.core.view.Z;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    NestedScrollView f19885A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Drawable f19887C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ImageView f19888D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f19889E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f19890F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f19891G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ListAdapter f19892H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f19894J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f19895K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f19896L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f19897M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f19898N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f19899O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f19900P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Handler f19902R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f19905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f19906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f19908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f19909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f19910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f19911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19916m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f19918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f19919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f19920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f19921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f19922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f19923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f19924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f19925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f19926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f19927x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f19928y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f19929z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f19917n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f19886B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f19893I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f19901Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f19903S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f19930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19931b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p144i.j.f43382c2);
            this.f19931b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p144i.j.f43387d2, -1);
            this.f19930a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p144i.j.f43392e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f19930a, getPaddingRight(), z11 ? getPaddingBottom() : this.f19931b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f19918o && (message3 = alertController.f19920q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f19922s || (message2 = alertController.f19924u) == null) {
                messageObtain = (view != alertController.f19926w || (message = alertController.f19928y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f19902R.obtainMessage(1, alertController2.f19905b).sendToTarget();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f19933A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f19934B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f19935C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f19936D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f19938F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f19939G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f19940H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f19942J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f19943K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f19944L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f19945M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f19946N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f19948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f19949b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f19951d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f19953f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f19954g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f19955h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f19956i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f19957j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f19958k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f19959l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f19960m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f19961n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f19962o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f19963p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f19964q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f19966s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f19967t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f19968u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f19969v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f19970w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f19971x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f19972y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f19973z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19950c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19952e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f19937E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f19941I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f19947O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f19965r = true;

        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f19974a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f19974a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f19938F;
                if (zArr != null && zArr[i10]) {
                    this.f19974a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0250b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f19976a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f19977b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f19978c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f19979d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0250b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f19978c = recycleListView;
                this.f19979d = alertController;
                Cursor cursor2 = getCursor();
                this.f19976a = cursor2.getColumnIndexOrThrow(b.this.f19944L);
                this.f19977b = cursor2.getColumnIndexOrThrow(b.this.f19945M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f19976a));
                this.f19978c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f19977b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f19949b.inflate(this.f19979d.f19897M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f19981a;

            c(AlertController alertController) {
                this.f19981a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f19971x.onClick(this.f19981a.f19905b, i10);
                if (b.this.f19940H) {
                    return;
                }
                this.f19981a.f19905b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f19983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f19984b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f19983a = recycleListView;
                this.f19984b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f19938F;
                if (zArr != null) {
                    zArr[i10] = this.f19983a.isItemChecked(i10);
                }
                b.this.f19942J.onClick(this.f19984b.f19905b, i10, this.f19983a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f19948a = context;
            this.f19949b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f19949b.inflate(alertController.f19896L, (ViewGroup) null);
            if (!this.f19939G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f19940H ? alertController2.f19898N : alertController2.f19899O;
                if (bVar.f19943K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f19948a, i10, bVar.f19943K, new String[]{bVar.f19944L}, new int[]{16908308});
                } else {
                    dVar = bVar.f19970w;
                    if (dVar == null) {
                        dVar = new d(bVar.f19948a, i10, 16908308, bVar.f19969v);
                    }
                }
            } else if (this.f19943K == null) {
                bVar = this;
                dVar = bVar.new a(this.f19948a, alertController.f19897M, 16908308, this.f19969v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0250b(bVar.f19948a, bVar.f19943K, false, recycleListView, alertController2);
            }
            alertController2.f19892H = dVar;
            alertController2.f19893I = bVar.f19941I;
            if (bVar.f19971x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f19942J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f19946N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f19940H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f19939G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f19910g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f19954g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f19953f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f19951d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f19950c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f19952e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f19955h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f19956i;
            if (charSequence3 == null && this.f19957j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f19958k, null, this.f19957j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f19959l;
            if (charSequence4 != null || this.f19960m != null) {
                alertController2.j(-2, charSequence4, this.f19961n, null, this.f19960m);
            }
            CharSequence charSequence5 = this.f19962o;
            if (charSequence5 != null || this.f19963p != null) {
                alertController2.j(-3, charSequence5, this.f19964q, null, this.f19963p);
            }
            if (this.f19969v != null || this.f19943K != null || this.f19970w != null) {
                b(alertController2);
            }
            View view2 = this.f19973z;
            if (view2 != null) {
                if (this.f19937E) {
                    alertController2.s(view2, this.f19933A, this.f19934B, this.f19935C, this.f19936D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i12 = this.f19972y;
            if (i12 != 0) {
                alertController2.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f19986a;

        public c(DialogInterface dialogInterface) {
            this.f19986a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f19986a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f19904a = context;
        this.f19905b = rVar;
        this.f19906c = window;
        this.f19902R = new c(rVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p144i.j.f43272F, p144i.a.f43083k, 0);
        this.f19894J = typedArrayObtainStyledAttributes.getResourceId(p144i.j.f43277G, 0);
        this.f19895K = typedArrayObtainStyledAttributes.getResourceId(p144i.j.f43287I, 0);
        this.f19896L = typedArrayObtainStyledAttributes.getResourceId(p144i.j.f43297K, 0);
        this.f19897M = typedArrayObtainStyledAttributes.getResourceId(p144i.j.f43302L, 0);
        this.f19898N = typedArrayObtainStyledAttributes.getResourceId(p144i.j.f43312N, 0);
        this.f19899O = typedArrayObtainStyledAttributes.getResourceId(p144i.j.f43292J, 0);
        this.f19900P = typedArrayObtainStyledAttributes.getBoolean(p144i.j.f43307M, true);
        this.f19907d = typedArrayObtainStyledAttributes.getDimensionPixelSize(p144i.j.f43282H, 0);
        typedArrayObtainStyledAttributes.recycle();
        rVar.j(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.f19895K;
        return (i10 != 0 && this.f19901Q == 1) ? i10 : this.f19894J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f19906c.findViewById(p144i.f.f43205w);
        View viewFindViewById2 = this.f19906c.findViewById(p144i.f.f43204v);
        Z.E0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f19918o = button;
        button.setOnClickListener(this.f19903S);
        if (TextUtils.isEmpty(this.f19919p) && this.f19921r == null) {
            this.f19918o.setVisibility(8);
            i10 = 0;
        } else {
            this.f19918o.setText(this.f19919p);
            Drawable drawable = this.f19921r;
            if (drawable != null) {
                int i11 = this.f19907d;
                drawable.setBounds(0, 0, i11, i11);
                this.f19918o.setCompoundDrawables(this.f19921r, null, null, null);
            }
            this.f19918o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f19922s = button2;
        button2.setOnClickListener(this.f19903S);
        if (TextUtils.isEmpty(this.f19923t) && this.f19925v == null) {
            this.f19922s.setVisibility(8);
        } else {
            this.f19922s.setText(this.f19923t);
            Drawable drawable2 = this.f19925v;
            if (drawable2 != null) {
                int i12 = this.f19907d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f19922s.setCompoundDrawables(this.f19925v, null, null, null);
            }
            this.f19922s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f19926w = button3;
        button3.setOnClickListener(this.f19903S);
        if (TextUtils.isEmpty(this.f19927x) && this.f19929z == null) {
            this.f19926w.setVisibility(8);
        } else {
            this.f19926w.setText(this.f19927x);
            Drawable drawable3 = this.f19929z;
            if (drawable3 != null) {
                int i13 = this.f19907d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f19926w.setCompoundDrawables(this.f19929z, null, null, null);
            }
            this.f19926w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f19904a)) {
            if (i10 == 1) {
                b(this.f19918o);
            } else if (i10 == 2) {
                b(this.f19922s);
            } else if (i10 == 4) {
                b(this.f19926w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f19906c.findViewById(p144i.f.f43206x);
        this.f19885A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f19885A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f19890F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f19909f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f19885A.removeView(this.f19890F);
        if (this.f19910g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f19885A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f19885A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f19910g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f19911h;
        if (viewInflate == null) {
            viewInflate = this.f19912i != 0 ? LayoutInflater.from(this.f19904a).inflate(this.f19912i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f19906c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f19906c.findViewById(p144i.f.f43197o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f19917n) {
            frameLayout.setPadding(this.f19913j, this.f19914k, this.f19915l, this.f19916m);
        }
        if (this.f19910g != null) {
            ((LinearLayout.LayoutParams) ((T.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f19891G != null) {
            viewGroup.addView(this.f19891G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f19906c.findViewById(p144i.f.f43181P).setVisibility(8);
            return;
        }
        this.f19888D = (ImageView) this.f19906c.findViewById(16908294);
        if (TextUtils.isEmpty(this.f19908e) || !this.f19900P) {
            this.f19906c.findViewById(p144i.f.f43181P).setVisibility(8);
            this.f19888D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f19906c.findViewById(p144i.f.f43193k);
        this.f19889E = textView;
        textView.setText(this.f19908e);
        int i10 = this.f19886B;
        if (i10 != 0) {
            this.f19888D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f19887C;
        if (drawable != null) {
            this.f19888D.setImageDrawable(drawable);
        } else {
            this.f19889E.setPadding(this.f19888D.getPaddingLeft(), this.f19888D.getPaddingTop(), this.f19888D.getPaddingRight(), this.f19888D.getPaddingBottom());
            this.f19888D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f19906c.findViewById(p144i.f.f43203u);
        View viewFindViewById4 = viewFindViewById3.findViewById(p144i.f.f43182Q);
        View viewFindViewById5 = viewFindViewById3.findViewById(p144i.f.f43196n);
        View viewFindViewById6 = viewFindViewById3.findViewById(p144i.f.f43194l);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(p144i.f.f43198p);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(p144i.f.f43182Q);
        View viewFindViewById8 = viewGroup.findViewById(p144i.f.f43196n);
        View viewFindViewById9 = viewGroup.findViewById(p144i.f.f43194l);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(p144i.f.f43177L)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f19885A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f19909f == null && this.f19910g == null) ? null : viewGroupH.findViewById(p144i.f.f43180O);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(p144i.f.f43178M)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f19910g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f19910g;
            if (view == null) {
                view = this.f19885A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f19910g;
        if (listView2 == null || (listAdapter = this.f19892H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f19893I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p144i.a.f43082j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f19904a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f19910g;
    }

    public void e() {
        this.f19905b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f19885A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f19885A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f19902R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f19927x = charSequence;
            this.f19928y = message;
            this.f19929z = drawable;
        } else if (i10 == -2) {
            this.f19923t = charSequence;
            this.f19924u = message;
            this.f19925v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f19919p = charSequence;
            this.f19920q = message;
            this.f19921r = drawable;
        }
    }

    public void k(View view) {
        this.f19891G = view;
    }

    public void l(int i10) {
        this.f19887C = null;
        this.f19886B = i10;
        ImageView imageView = this.f19888D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f19888D.setImageResource(this.f19886B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f19887C = drawable;
        this.f19886B = 0;
        ImageView imageView = this.f19888D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f19888D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f19909f = charSequence;
        TextView textView = this.f19890F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f19908e = charSequence;
        TextView textView = this.f19889E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f19911h = null;
        this.f19912i = i10;
        this.f19917n = false;
    }

    public void r(View view) {
        this.f19911h = view;
        this.f19912i = 0;
        this.f19917n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f19911h = view;
        this.f19912i = 0;
        this.f19917n = true;
        this.f19913j = i10;
        this.f19914k = i11;
        this.f19915l = i12;
        this.f19916m = i13;
    }
}
