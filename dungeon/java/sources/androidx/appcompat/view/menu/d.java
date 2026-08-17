package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f20324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20325b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f20328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20329f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f20327d = z10;
        this.f20328e = layoutInflater;
        this.f20324a = eVar;
        this.f20329f = i10;
        a();
    }

    void a() {
        g gVarX = this.f20324a.x();
        if (gVarX != null) {
            ArrayList arrayListB = this.f20324a.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListB.get(i10)) == gVarX) {
                    this.f20325b = i10;
                    return;
                }
            }
        }
        this.f20325b = -1;
    }

    public e b() {
        return this.f20324a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListB = this.f20327d ? this.f20324a.B() : this.f20324a.G();
        int i11 = this.f20325b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f20326c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListB = this.f20327d ? this.f20324a.B() : this.f20324a.G();
        return this.f20325b < 0 ? arrayListB.size() : arrayListB.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f20328e.inflate(this.f20329f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f20324a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f20326c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
