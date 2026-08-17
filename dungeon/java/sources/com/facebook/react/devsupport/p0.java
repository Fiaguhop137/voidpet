package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.react.AbstractC2232l;
import com.facebook.react.AbstractC2234n;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends LinearLayout implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p456z6.e f29713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f29714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z6.i.a f29715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View.OnClickListener f29716d;

    private static final class a extends AsyncTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0377a f29717b = new C0377a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p339sf.x f29718c = p339sf.x.f54081e.a("application/json; charset=utf-8");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p456z6.e f29719a;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.p0$a$a, reason: collision with other inner class name */
        public static final class C0377a {
            private C0377a() {
            }

            public /* synthetic */ C0377a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final JSONObject b(p456z6.j jVar) {
                return new JSONObject(kotlin.collections.N.l(Ad.v.a("file", jVar.getFile()), Ad.v.a("methodName", jVar.getMethod()), Ad.v.a("lineNumber", Integer.valueOf(jVar.a())), Ad.v.a("column", Integer.valueOf(jVar.getColumn()))));
            }
        }

        public a(p456z6.e devSupportManager) {
            Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
            this.f29719a = devSupportManager;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(p456z6.j... stackFrames) {
            Intrinsics.checkNotNullParameter(stackFrames, "stackFrames");
            try {
                String string = Uri.parse(this.f29719a.t()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                p339sf.A a10 = new p339sf.A();
                for (p456z6.j jVar : stackFrames) {
                    C0377a c0377a = f29717b;
                    if (jVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = c0377a.b(jVar).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    a10.b(new sf.C.a().l(string).h(p339sf.D.f53738a.e(f29718c, string2)).b()).t();
                }
            } catch (Exception e10) {
                W4.a.n("ReactNative", "Could not open stack frame", e10);
            }
            return null;
        }
    }

    private static final class b extends BaseAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f29720c = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p456z6.j[] f29722b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.p0$b$b, reason: collision with other inner class name */
        private static final class C0378b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextView f29723a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TextView f29724b;

            public C0378b(View v10) {
                Intrinsics.checkNotNullParameter(v10, "v");
                View viewFindViewById = v10.findViewById(AbstractC2232l.f29838x);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.f29723a = (TextView) viewFindViewById;
                View viewFindViewById2 = v10.findViewById(AbstractC2232l.f29837w);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.f29724b = (TextView) viewFindViewById2;
            }

            public final TextView a() {
                return this.f29724b;
            }

            public final TextView b() {
                return this.f29723a;
            }
        }

        public b(String title, p456z6.j[] stack) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(stack, "stack");
            this.f29721a = title;
            this.f29722b = stack;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f29722b.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return i10 == 0 ? this.f29721a : this.f29722b[i10 - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i10) {
            return i10 == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup parent) {
            TextView textView;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (i10 == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    View viewInflate = LayoutInflater.from(parent.getContext()).inflate(AbstractC2234n.f30007f, parent, false);
                    Intrinsics.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) viewInflate;
                }
                textView.setText(new Regex("\\x1b\\[[0-9;]*m").replace(this.f29721a, ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(parent.getContext()).inflate(AbstractC2234n.f30006e, parent, false);
                Intrinsics.c(view);
                view.setTag(new C0378b(view));
            }
            p456z6.j jVar = this.f29722b[i10 - 1];
            Object tag = view.getTag();
            Intrinsics.d(tag, "null cannot be cast to non-null type com.facebook.react.devsupport.RedBoxContentView.StackAdapter.FrameViewHolder");
            C0378b c0378b = (C0378b) tag;
            c0378b.b().setText(jVar.getMethod());
            c0378b.a().setText(u0.f29773a.c(jVar));
            c0378b.b().setTextColor(jVar.b() ? -5592406 : -1);
            c0378b.a().setTextColor(jVar.b() ? -8355712 : -5000269);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return i10 > 0;
        }
    }

    public static final class c implements z6.i.a {
        c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Context context, p456z6.e devSupportManager, p456z6.i iVar) {
        super(context);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.f29713a = devSupportManager;
        this.f29715c = new c();
        this.f29716d = new m0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p0 p0Var, View view) {
        p0Var.f29713a.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p0 p0Var, View view) {
        p0Var.f29713a.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(p0 p0Var, View view) {
        p0Var.getClass();
    }

    public final void d() {
        LayoutInflater.from(getContext()).inflate(AbstractC2234n.f30008g, this);
        ListView listView = (ListView) findViewById(AbstractC2232l.f29807A);
        listView.setOnItemClickListener(this);
        this.f29714b = listView;
        ((Button) findViewById(AbstractC2232l.f29840z)).setOnClickListener(new n0(this));
        ((Button) findViewById(AbstractC2232l.f29839y)).setOnClickListener(new o0(this));
    }

    public final void g() {
        String strL = this.f29713a.l();
        p456z6.j[] jVarArrX = this.f29713a.x();
        if (jVarArrX == null) {
            jVarArrX = new p456z6.j[0];
        }
        if (this.f29713a.r() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        p456z6.e eVar = this.f29713a;
        Pair pairCreate = Pair.create(strL, jVarArrX);
        Intrinsics.checkNotNullExpressionValue(pairCreate, "create(...)");
        Pair pairP = eVar.p(pairCreate);
        if (pairP == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object first = pairP.first;
        Intrinsics.checkNotNullExpressionValue(first, "first");
        Object second = pairP.second;
        Intrinsics.checkNotNullExpressionValue(second, "second");
        i((String) first, (p456z6.j[]) second);
        this.f29713a.v();
    }

    public final void i(String title, p456z6.j[] stack) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stack, "stack");
        ListView listView = this.f29714b;
        if (listView == null) {
            Intrinsics.r("stackView");
            listView = null;
        }
        listView.setAdapter((ListAdapter) new b(title, stack));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Intrinsics.checkNotNullParameter(view, "view");
        a aVar = new a(this.f29713a);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        p456z6.j[] jVarArr = new p456z6.j[1];
        ListView listView = this.f29714b;
        if (listView == null) {
            Intrinsics.r("stackView");
            listView = null;
        }
        Object item = listView.getAdapter().getItem(i10);
        Intrinsics.d(item, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.StackFrame");
        jVarArr[0] = item;
        aVar.executeOnExecutor(executor, jVarArr);
    }
}
