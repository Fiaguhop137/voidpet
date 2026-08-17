package p289q1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, q1.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f51197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f51198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Cursor f51199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f51200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f51201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0612a f51202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected DataSetObserver f51203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p289q1.b f51204h;

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    private class C0612a extends ContentObserver {
        C0612a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f51197a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f51197a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorI = i(cursor);
        if (cursorI != null) {
            cursorI.close();
        }
    }

    @Override // q1.b.a
    public Cursor c() {
        return this.f51199c;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f51198b = true;
        } else {
            this.f51198b = false;
        }
        boolean z10 = cursor != null;
        this.f51199c = cursor;
        this.f51197a = z10;
        this.f51200d = context;
        this.f51201e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f51202f = new C0612a();
            this.f51203g = new b();
        } else {
            this.f51202f = null;
            this.f51203g = null;
        }
        if (z10) {
            C0612a c0612a = this.f51202f;
            if (c0612a != null) {
                cursor.registerContentObserver(c0612a);
            }
            DataSetObserver dataSetObserver = this.f51203g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f51197a || (cursor = this.f51199c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f51197a) {
            return null;
        }
        this.f51199c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f51200d, this.f51199c, viewGroup);
        }
        d(view, this.f51200d, this.f51199c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f51204h == null) {
            this.f51204h = new p289q1.b(this);
        }
        return this.f51204h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f51197a || (cursor = this.f51199c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f51199c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f51197a && (cursor = this.f51199c) != null && cursor.moveToPosition(i10)) {
            return this.f51199c.getLong(this.f51201e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f51197a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f51199c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f51200d, this.f51199c, viewGroup);
            }
            d(view, this.f51200d, this.f51199c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f51198b || (cursor = this.f51199c) == null || cursor.isClosed()) {
            return;
        }
        this.f51197a = this.f51199c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f51199c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0612a c0612a = this.f51202f;
            if (c0612a != null) {
                cursor2.unregisterContentObserver(c0612a);
            }
            DataSetObserver dataSetObserver = this.f51203g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f51199c = cursor;
        if (cursor == null) {
            this.f51201e = -1;
            this.f51197a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0612a c0612a2 = this.f51202f;
        if (c0612a2 != null) {
            cursor.registerContentObserver(c0612a2);
        }
        DataSetObserver dataSetObserver2 = this.f51203g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f51201e = cursor.getColumnIndexOrThrow("_id");
        this.f51197a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
