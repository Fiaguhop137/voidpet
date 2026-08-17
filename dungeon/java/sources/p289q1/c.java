package p289q1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f51210k;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f51209j = i10;
        this.f51208i = i10;
        this.f51210k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p289q1.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f51210k.inflate(this.f51209j, viewGroup, false);
    }

    @Override // p289q1.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f51210k.inflate(this.f51208i, viewGroup, false);
    }
}
