package R1;

import U1.AbstractC1459a;
import U1.S;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Comparator, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f10196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10199d;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f10201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f10204e;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        b(Parcel parcel) {
            this.f10201b = new UUID(parcel.readLong(), parcel.readLong());
            this.f10202c = parcel.readString();
            this.f10203d = (String) S.i(parcel.readString());
            this.f10204e = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f10201b = (UUID) AbstractC1459a.e(uuid);
            this.f10202c = str;
            this.f10203d = y.u((String) AbstractC1459a.e(str2));
            this.f10204e = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f10202c, bVar.f10202c) && Objects.equals(this.f10203d, bVar.f10203d) && Objects.equals(this.f10201b, bVar.f10201b) && Arrays.equals(this.f10204e, bVar.f10204e);
        }

        public boolean f(b bVar) {
            return k() && !bVar.k() && l(bVar.f10201b);
        }

        public int hashCode() {
            if (this.f10200a == 0) {
                int iHashCode = this.f10201b.hashCode() * 31;
                String str = this.f10202c;
                this.f10200a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f10203d.hashCode()) * 31) + Arrays.hashCode(this.f10204e);
            }
            return this.f10200a;
        }

        public b j(byte[] bArr) {
            return new b(this.f10201b, this.f10202c, this.f10203d, bArr);
        }

        public boolean k() {
            return this.f10204e != null;
        }

        public boolean l(UUID uuid) {
            return AbstractC1348h.f10156a.equals(this.f10201b) || uuid.equals(this.f10201b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f10201b.getMostSignificantBits());
            parcel.writeLong(this.f10201b.getLeastSignificantBits());
            parcel.writeString(this.f10202c);
            parcel.writeString(this.f10203d);
            parcel.writeByteArray(this.f10204e);
        }
    }

    n(Parcel parcel) {
        this.f10198c = parcel.readString();
        b[] bVarArr = (b[]) S.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f10196a = bVarArr;
        this.f10199d = bVarArr.length;
    }

    public n(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    private n(String str, boolean z10, b... bVarArr) {
        this.f10198c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f10196a = bVarArr;
        this.f10199d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public n(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public n(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public n(b... bVarArr) {
        this((String) null, bVarArr);
    }

    private static boolean j(ArrayList arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (((b) arrayList.get(i11)).f10201b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static n l(n nVar, n nVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (nVar != null) {
            str = nVar.f10198c;
            for (b bVar : nVar.f10196a) {
                if (bVar.k()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (nVar2 != null) {
            if (str == null) {
                str = nVar2.f10198c;
            }
            int size = arrayList.size();
            for (b bVar2 : nVar2.f10196a) {
                if (bVar2.k() && !j(arrayList, size, bVar2.f10201b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n(str, arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f10198c, nVar.f10198c) && Arrays.equals(this.f10196a, nVar.f10196a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = AbstractC1348h.f10156a;
        if (uuid.equals(bVar.f10201b)) {
            return uuid.equals(bVar2.f10201b) ? 0 : 1;
        }
        return bVar.f10201b.compareTo(bVar2.f10201b);
    }

    public int hashCode() {
        if (this.f10197b == 0) {
            String str = this.f10198c;
            this.f10197b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f10196a);
        }
        return this.f10197b;
    }

    public n k(String str) {
        return Objects.equals(this.f10198c, str) ? this : new n(str, false, this.f10196a);
    }

    public b m(int i10) {
        return this.f10196a[i10];
    }

    public n n(n nVar) {
        String str;
        String str2 = this.f10198c;
        AbstractC1459a.g(str2 == null || (str = nVar.f10198c) == null || TextUtils.equals(str2, str));
        String str3 = this.f10198c;
        if (str3 == null) {
            str3 = nVar.f10198c;
        }
        return new n(str3, (b[]) S.R0(this.f10196a, nVar.f10196a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10198c);
        parcel.writeTypedArray(this.f10196a, 0);
    }
}
