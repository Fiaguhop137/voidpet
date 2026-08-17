package U5;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: U5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1481d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f13124b;

    public C1481d(int i10) {
        this.f13123a = i10;
        this.f13124b = new LinkedHashSet(i10);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f13124b.size() == this.f13123a) {
                LinkedHashSet linkedHashSet = this.f13124b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f13124b.remove(obj);
        } catch (Throwable th) {
            throw th;
        }
        return this.f13124b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f13124b.contains(obj);
    }
}
