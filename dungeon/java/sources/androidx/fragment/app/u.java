package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1987j;

/* JADX INFO: loaded from: classes.dex */
final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f24170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f24171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f24172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f24173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f24174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f24175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f24176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f24177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f24178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f24179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f24180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f24181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f24182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f24183n;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i10) {
            return new u[i10];
        }
    }

    u(Parcel parcel) {
        this.f24170a = parcel.readString();
        this.f24171b = parcel.readString();
        this.f24172c = parcel.readInt() != 0;
        this.f24173d = parcel.readInt();
        this.f24174e = parcel.readInt();
        this.f24175f = parcel.readString();
        this.f24176g = parcel.readInt() != 0;
        this.f24177h = parcel.readInt() != 0;
        this.f24178i = parcel.readInt() != 0;
        this.f24179j = parcel.readInt() != 0;
        this.f24180k = parcel.readInt();
        this.f24181l = parcel.readString();
        this.f24182m = parcel.readInt();
        this.f24183n = parcel.readInt() != 0;
    }

    u(i iVar) {
        this.f24170a = iVar.getClass().getName();
        this.f24171b = iVar.f24018f;
        this.f24172c = iVar.f24027o;
        this.f24173d = iVar.f24036x;
        this.f24174e = iVar.f24037y;
        this.f24175f = iVar.f24038z;
        this.f24176g = iVar.f23987C;
        this.f24177h = iVar.f24025m;
        this.f24178i = iVar.f23986B;
        this.f24179j = iVar.f23985A;
        this.f24180k = iVar.f24003S.ordinal();
        this.f24181l = iVar.f24021i;
        this.f24182m = iVar.f24022j;
        this.f24183n = iVar.f23995K;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    i f(m mVar, ClassLoader classLoader) {
        i iVarA = mVar.a(classLoader, this.f24170a);
        iVarA.f24018f = this.f24171b;
        iVarA.f24027o = this.f24172c;
        iVarA.f24029q = true;
        iVarA.f24036x = this.f24173d;
        iVarA.f24037y = this.f24174e;
        iVarA.f24038z = this.f24175f;
        iVarA.f23987C = this.f24176g;
        iVarA.f24025m = this.f24177h;
        iVarA.f23986B = this.f24178i;
        iVarA.f23985A = this.f24179j;
        iVarA.f24003S = AbstractC1987j.b.values()[this.f24180k];
        iVarA.f24021i = this.f24181l;
        iVarA.f24022j = this.f24182m;
        iVarA.f23995K = this.f24183n;
        return iVarA;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f24170a);
        sb2.append(" (");
        sb2.append(this.f24171b);
        sb2.append(")}:");
        if (this.f24172c) {
            sb2.append(" fromLayout");
        }
        if (this.f24174e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f24174e));
        }
        String str = this.f24175f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f24175f);
        }
        if (this.f24176g) {
            sb2.append(" retainInstance");
        }
        if (this.f24177h) {
            sb2.append(" removing");
        }
        if (this.f24178i) {
            sb2.append(" detached");
        }
        if (this.f24179j) {
            sb2.append(" hidden");
        }
        if (this.f24181l != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f24181l);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f24182m);
        }
        if (this.f24183n) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f24170a);
        parcel.writeString(this.f24171b);
        parcel.writeInt(this.f24172c ? 1 : 0);
        parcel.writeInt(this.f24173d);
        parcel.writeInt(this.f24174e);
        parcel.writeString(this.f24175f);
        parcel.writeInt(this.f24176g ? 1 : 0);
        parcel.writeInt(this.f24177h ? 1 : 0);
        parcel.writeInt(this.f24178i ? 1 : 0);
        parcel.writeInt(this.f24179j ? 1 : 0);
        parcel.writeInt(this.f24180k);
        parcel.writeString(this.f24181l);
        parcel.writeInt(this.f24182m);
        parcel.writeInt(this.f24183n ? 1 : 0);
    }
}
