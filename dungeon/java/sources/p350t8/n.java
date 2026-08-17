package p350t8;

import android.os.Parcel;
import android.os.Parcelable;
import p170j8.AbstractC3851p;
import p404w8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends p implements c {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54552a;

    public n(int i10) {
        this.f54552a = i10;
    }

    static int a4(c cVar) {
        return AbstractC3851p.b(Integer.valueOf(cVar.a2()));
    }

    static boolean b4(c cVar, Object obj) {
        if (obj instanceof c) {
            return obj == cVar || ((c) obj).a2() == cVar.a2();
        }
        return false;
    }

    static String c4(c cVar) {
        AbstractC3851p.a aVarC = AbstractC3851p.c(cVar);
        aVarC.a("FriendsListVisibilityStatus", Integer.valueOf(cVar.a2()));
        return aVarC.toString();
    }

    @Override // p350t8.c
    public final int a2() {
        return this.f54552a;
    }

    public final boolean equals(Object obj) {
        return b4(this, obj);
    }

    @Override // p153i8.a
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    public final int hashCode() {
        return a4(this);
    }

    public final String toString() {
        return c4(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        o.a(this, parcel, i10);
    }
}
