package U1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: U1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1471m implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12916a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f12917b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f12918c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f12919d = Collections.EMPTY_LIST;

    public void a(Object obj) {
        synchronized (this.f12916a) {
            try {
                ArrayList arrayList = new ArrayList(this.f12919d);
                arrayList.add(obj);
                this.f12919d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f12917b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f12918c);
                    hashSet.add(obj);
                    this.f12918c = Collections.unmodifiableSet(hashSet);
                }
                this.f12917b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int c(Object obj) {
        int iIntValue;
        synchronized (this.f12916a) {
            try {
                iIntValue = this.f12917b.containsKey(obj) ? ((Integer) this.f12917b.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void e(Object obj) {
        synchronized (this.f12916a) {
            try {
                Integer num = (Integer) this.f12917b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f12919d);
                arrayList.remove(obj);
                this.f12919d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f12917b.remove(obj);
                    HashSet hashSet = new HashSet(this.f12918c);
                    hashSet.remove(obj);
                    this.f12918c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f12917b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f12916a) {
            it = this.f12919d.iterator();
        }
        return it;
    }

    public Set r2() {
        Set set;
        synchronized (this.f12916a) {
            set = this.f12918c;
        }
        return set;
    }
}
