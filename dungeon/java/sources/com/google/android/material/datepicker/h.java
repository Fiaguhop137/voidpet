package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class h extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f36536d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f36537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36539c;

    static {
        f36536d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar calendarI = t.i();
        this.f36537a = calendarI;
        this.f36538b = calendarI.getMaximum(7);
        this.f36539c = calendarI.getFirstDayOfWeek();
    }

    public h(int i10) {
        Calendar calendarI = t.i();
        this.f36537a = calendarI;
        this.f36538b = calendarI.getMaximum(7);
        this.f36539c = i10;
    }

    private int b(int i10) {
        int i11 = i10 + this.f36539c;
        int i12 = this.f36538b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f36538b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f36538b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Y8.g.f17160m, viewGroup, false);
        }
        this.f36537a.set(7, b(i10));
        textView.setText(this.f36537a.getDisplayName(7, f36536d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(Y8.i.f17186q), this.f36537a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
