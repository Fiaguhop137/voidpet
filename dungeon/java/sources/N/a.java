package N;

import java.util.Map;
import kotlin.collections.AbstractC3948j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC3948j {
    public final boolean c(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return e(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean e(Map.Entry entry);

    public final boolean g(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return h(entry);
    }

    public abstract boolean h(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }
}
