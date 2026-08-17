package O8;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class I implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f8468a;

    public I(Context context, H h10) {
        ArrayList arrayList = new ArrayList();
        this.f8468a = arrayList;
        if (h10.c()) {
            arrayList.add(new S(context, h10));
        }
    }
}
