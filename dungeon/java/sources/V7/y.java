package V7;

import android.database.Cursor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements M.b {
    @Override // V7.M.b
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).getCount() > 0);
    }
}
