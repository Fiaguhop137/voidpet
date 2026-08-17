package T3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12119a = new ArrayList();

    void a(u uVar) {
        this.f12119a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f12119a.size() - 1; size >= 0; size--) {
            p077e4.r.b(path, (u) this.f12119a.get(size));
        }
    }
}
