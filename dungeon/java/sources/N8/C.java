package N8;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f7986a;

    public C(Context context, B b10) {
        ArrayList arrayList = new ArrayList();
        this.f7986a = arrayList;
        if (b10.c()) {
            arrayList.add(new K(context, b10));
        }
    }
}
