package Ge;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompareTo = g().compareTo(other.g());
        if (iCompareTo == 0 && !h() && other.h()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract b g();

    public abstract boolean h();
}
