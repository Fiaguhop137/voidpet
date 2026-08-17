package expo.modules.adapters.react;

import com.facebook.react.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p227mb.d;

/* JADX INFO: loaded from: classes2.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f40888a = new ArrayList();

    public void a(P p10) {
        this.f40888a.add(p10);
    }

    public Collection b() {
        return this.f40888a;
    }

    @Override // p227mb.d
    public List h() {
        return Collections.singletonList(c.class);
    }
}
