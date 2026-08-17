package C9;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: C9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0860c extends AbstractC0861d implements y {
    protected AbstractC0860c(Map map) {
        super(map);
    }

    @Override // C9.AbstractC0861d, C9.C
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // C9.AbstractC0863f, C9.C
    public Map asMap() {
        return super.asMap();
    }

    @Override // C9.AbstractC0863f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // C9.AbstractC0861d, C9.C
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // C9.AbstractC0861d
    Collection x(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // C9.AbstractC0861d
    Collection y(Object obj, Collection collection) {
        return z(obj, (List) collection, null);
    }
}
