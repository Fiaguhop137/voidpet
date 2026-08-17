package p135h8;

import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC2311d;
import com.google.android.gms.common.api.internal.InterfaceC2313f;
import com.google.android.gms.common.api.internal.InterfaceC2321n;
import com.google.android.gms.common.api.internal.InterfaceC2324q;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f42665a = Collections.newSetFromMap(new WeakHashMap());

    public interface a extends InterfaceC2313f {
    }

    public interface b extends InterfaceC2321n {
    }

    public static Set c() {
        Set set = f42665a;
        synchronized (set) {
        }
        return set;
    }

    public abstract AbstractC2311d a(AbstractC2311d abstractC2311d);

    public abstract AbstractC2311d b(AbstractC2311d abstractC2311d);

    public abstract Looper d();

    public boolean e(InterfaceC2324q interfaceC2324q) {
        throw new UnsupportedOperationException();
    }

    public void f() {
        throw new UnsupportedOperationException();
    }
}
