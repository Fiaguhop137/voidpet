package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f25778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f25779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f25782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25785k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C4101a(), new C4101a(), new C4101a());
    }

    private b(Parcel parcel, int i10, int i11, String str, C4101a c4101a, C4101a c4101a2, C4101a c4101a3) {
        super(c4101a, c4101a2, c4101a3);
        this.f25778d = new SparseIntArray();
        this.f25783i = -1;
        this.f25785k = -1;
        this.f25779e = parcel;
        this.f25780f = i10;
        this.f25781g = i11;
        this.f25784j = i10;
        this.f25782h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f25779e.writeInt(-1);
        } else {
            this.f25779e.writeInt(bArr.length);
            this.f25779e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f25779e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f25779e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f25779e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f25779e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f25783i;
        if (i10 >= 0) {
            int i11 = this.f25778d.get(i10);
            int iDataPosition = this.f25779e.dataPosition();
            this.f25779e.setDataPosition(i11);
            this.f25779e.writeInt(iDataPosition - i11);
            this.f25779e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f25779e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f25784j;
        if (i10 == this.f25780f) {
            i10 = this.f25781g;
        }
        return new b(parcel, iDataPosition, i10, this.f25782h + "  ", this.f25775a, this.f25776b, this.f25777c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f25779e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i10 = this.f25779e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f25779e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f25779e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f25784j < this.f25781g) {
            int i11 = this.f25785k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f25779e.setDataPosition(this.f25784j);
            int i12 = this.f25779e.readInt();
            this.f25785k = this.f25779e.readInt();
            this.f25784j += i12;
        }
        return this.f25785k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f25779e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f25779e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f25779e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f25783i = i10;
        this.f25778d.put(i10, this.f25779e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f25779e.writeInt(z10 ? 1 : 0);
    }
}
