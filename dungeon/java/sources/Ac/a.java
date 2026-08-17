package Ac;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements k, p227mb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f268a;

    public a(Context context) {
        this.f268a = context;
    }

    @Override // p227mb.d
    public List h() {
        return Collections.singletonList(k.class);
    }
}
