package G1;

import androidx.fragment.app.C1975f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3835a;

    public /* synthetic */ e(ArrayList arrayList) {
        this.f3835a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1975f.N(this.f3835a);
    }
}
