package com.applovin.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f28226b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f28227c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m1 f28228d;

    public n1(Context context) {
        this.f28225a = context.getApplicationContext();
    }

    public abstract int a();

    public abstract List a(int i10);

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b(int i10);

    public abstract h2 c(int i10);

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f28226b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return (l1) this.f28226b.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i10) {
        return e.a(((l1) this.f28226b.get(i10)).f28100a);
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        j1 j1Var;
        int i11;
        l1 l1Var = (l1) this.f28226b.get(i10);
        if (view == null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            int i12 = l1Var.f28100a;
            if (i12 == 0) {
                throw null;
            }
            if (i12 == 1) {
                i11 = R.layout.debugger_list_section;
            } else if (i12 == 2) {
                i11 = R.layout.debugger_list_section_centered;
            } else if (i12 == 3) {
                i11 = 17367043;
            } else {
                i11 = i12 == 4 ? R.layout.debugger_list_item_detail : R.layout.debugger_list_item_right_detail;
            }
            view = layoutInflaterFrom.inflate(i11, viewGroup, false);
            j1Var = new j1();
            j1Var.f28070a = (TextView) view.findViewById(16908308);
            j1Var.f28071b = (TextView) view.findViewById(16908309);
            j1Var.f28072c = (ImageView) view.findViewById(R.id.imageView);
            j1Var.f28073d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(j1Var);
            view.setOnClickListener(this);
            Drawable background = view.getBackground();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.f28225a.getColor(R.color.axon_sdk_highlightListItemColor));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
            stateListDrawable.addState(new int[0], background);
            view.setBackground(stateListDrawable);
        } else {
            j1Var = (j1) view.getTag();
        }
        j1Var.f28075f = i10;
        j1Var.f28074e = l1Var;
        j1Var.f28070a.setText(l1Var.f28102c);
        j1Var.f28070a.setTextColor(l1Var.f28105f);
        if (j1Var.f28071b != null) {
            if (TextUtils.isEmpty(l1Var.f28103d)) {
                j1Var.f28071b.setVisibility(8);
            } else {
                j1Var.f28071b.setTypeface(null, 0);
                j1Var.f28071b.setVisibility(0);
                j1Var.f28071b.setText(l1Var.f28103d);
                j1Var.f28071b.setTextColor(l1Var.f28106g);
            }
        }
        ImageView imageView = j1Var.f28072c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = j1Var.f28073d;
        if (imageView2 != null) {
            int i13 = l1Var.f28104e;
            if (i13 > 0) {
                imageView2.setImageResource(i13);
                j1Var.f28073d.setColorFilter(l1Var.f28107h);
                j1Var.f28073d.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
        view.setEnabled(l1Var.f28101b);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 5;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i10) {
        return ((l1) this.f28226b.get(i10)).f28101b;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.f28226b = new ArrayList();
        int iA = a();
        this.f28227c = new HashMap(iA);
        int i10 = 0;
        for (int i11 = 0; i11 < iA; i11++) {
            int iB = b(i11);
            if (iB != 0) {
                this.f28226b.add(c(i11));
                this.f28226b.addAll(a(i11));
                this.f28227c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 = iB + 1 + i10;
            }
        }
        this.f28226b.add(new h2(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h1 h1Var;
        j1 j1Var = (j1) view.getTag();
        l1 l1Var = j1Var.f28074e;
        int i10 = j1Var.f28075f;
        int i11 = 0;
        while (true) {
            if (i11 >= a()) {
                h1Var = null;
                break;
            }
            Integer num = (Integer) this.f28227c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + b(i11)) {
                    h1Var = new h1(i11, i10 - (num.intValue() + 1));
                    break;
                }
            }
            i11++;
        }
        m1 m1Var = this.f28228d;
        if (m1Var == null || h1Var == null) {
            return;
        }
        m1Var.a(h1Var, l1Var);
    }
}
