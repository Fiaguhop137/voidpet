package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f20312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f20313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f20314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f20315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f20316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f20317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f20318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j.a f20319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f20320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20321j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f20322a = -1;

        public a() {
            a();
        }

        void a() {
            g gVarX = c.this.f20314c.x();
            if (gVarX != null) {
                ArrayList arrayListB = c.this.f20314c.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) arrayListB.get(i10)) == gVarX) {
                        this.f20322a = i10;
                        return;
                    }
                }
            }
            this.f20322a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList arrayListB = c.this.f20314c.B();
            int i11 = i10 + c.this.f20316e;
            int i12 = this.f20322a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f20314c.B().size() - c.this.f20316e;
            return this.f20322a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f20313b.inflate(cVar.f20318g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.f20318g = i10;
        this.f20317f = i11;
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f20312a = context;
        this.f20313b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f20320i == null) {
            this.f20320i = new a();
        }
        return this.f20320i;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f20319h;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public k c(ViewGroup viewGroup) {
        if (this.f20315d == null) {
            this.f20315d = (ExpandedMenuView) this.f20313b.inflate(p144i.g.f43215g, viewGroup, false);
            if (this.f20320i == null) {
                this.f20320i = new a();
            }
            this.f20315d.setAdapter((ListAdapter) this.f20320i);
            this.f20315d.setOnItemClickListener(this);
        }
        return this.f20315d;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f20319h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f20319h;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f20321j;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        if (this.f20315d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        a aVar = this.f20320i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(Context context, e eVar) {
        if (this.f20317f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f20317f);
            this.f20312a = contextThemeWrapper;
            this.f20313b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f20312a != null) {
            this.f20312a = context;
            if (this.f20313b == null) {
                this.f20313b = LayoutInflater.from(context);
            }
        }
        this.f20314c = eVar;
        a aVar = this.f20320i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f20315d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f20315d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f20314c.P(this.f20320i.getItem(i10), this, 0);
    }
}
