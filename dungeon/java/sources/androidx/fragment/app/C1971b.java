package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1987j;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1971b implements Parcelable {
    public static final Parcelable.Creator<C1971b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f23919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f23920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f23921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f23922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f23923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f23924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f23925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f23926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f23927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f23928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f23929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList f23930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList f23931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f23932n;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1971b createFromParcel(Parcel parcel) {
            return new C1971b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1971b[] newArray(int i10) {
            return new C1971b[i10];
        }
    }

    C1971b(Parcel parcel) {
        this.f23919a = parcel.createIntArray();
        this.f23920b = parcel.createStringArrayList();
        this.f23921c = parcel.createIntArray();
        this.f23922d = parcel.createIntArray();
        this.f23923e = parcel.readInt();
        this.f23924f = parcel.readString();
        this.f23925g = parcel.readInt();
        this.f23926h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f23927i = (CharSequence) creator.createFromParcel(parcel);
        this.f23928j = parcel.readInt();
        this.f23929k = (CharSequence) creator.createFromParcel(parcel);
        this.f23930l = parcel.createStringArrayList();
        this.f23931m = parcel.createStringArrayList();
        this.f23932n = parcel.readInt() != 0;
    }

    C1971b(C1970a c1970a) {
        int size = c1970a.f24198c.size();
        this.f23919a = new int[size * 6];
        if (!c1970a.f24204i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f23920b = new ArrayList(size);
        this.f23921c = new int[size];
        this.f23922d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            x.a aVar = (x.a) c1970a.f24198c.get(i11);
            int i12 = i10 + 1;
            this.f23919a[i10] = aVar.f24215a;
            ArrayList arrayList = this.f23920b;
            i iVar = aVar.f24216b;
            arrayList.add(iVar != null ? iVar.f24018f : null);
            int[] iArr = this.f23919a;
            iArr[i12] = aVar.f24217c ? 1 : 0;
            iArr[i10 + 2] = aVar.f24218d;
            iArr[i10 + 3] = aVar.f24219e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f24220f;
            i10 += 6;
            iArr[i13] = aVar.f24221g;
            this.f23921c[i11] = aVar.f24222h.ordinal();
            this.f23922d[i11] = aVar.f24223i.ordinal();
        }
        this.f23923e = c1970a.f24203h;
        this.f23924f = c1970a.f24206k;
        this.f23925g = c1970a.f23917v;
        this.f23926h = c1970a.f24207l;
        this.f23927i = c1970a.f24208m;
        this.f23928j = c1970a.f24209n;
        this.f23929k = c1970a.f24210o;
        this.f23930l = c1970a.f24211p;
        this.f23931m = c1970a.f24212q;
        this.f23932n = c1970a.f24213r;
    }

    private void f(C1970a c1970a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f23919a.length) {
                c1970a.f24203h = this.f23923e;
                c1970a.f24206k = this.f23924f;
                c1970a.f24204i = true;
                c1970a.f24207l = this.f23926h;
                c1970a.f24208m = this.f23927i;
                c1970a.f24209n = this.f23928j;
                c1970a.f24210o = this.f23929k;
                c1970a.f24211p = this.f23930l;
                c1970a.f24212q = this.f23931m;
                c1970a.f24213r = this.f23932n;
                return;
            }
            x.a aVar = new x.a();
            int i12 = i10 + 1;
            aVar.f24215a = this.f23919a[i10];
            if (q.H0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1970a + " op #" + i11 + " base fragment #" + this.f23919a[i12]);
            }
            aVar.f24222h = AbstractC1987j.b.values()[this.f23921c[i11]];
            aVar.f24223i = AbstractC1987j.b.values()[this.f23922d[i11]];
            int[] iArr = this.f23919a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f24217c = z10;
            int i14 = iArr[i13];
            aVar.f24218d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f24219e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f24220f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f24221g = i18;
            c1970a.f24199d = i14;
            c1970a.f24200e = i15;
            c1970a.f24201f = i17;
            c1970a.f24202g = i18;
            c1970a.f(aVar);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C1970a j(q qVar) {
        C1970a c1970a = new C1970a(qVar);
        f(c1970a);
        c1970a.f23917v = this.f23925g;
        for (int i10 = 0; i10 < this.f23920b.size(); i10++) {
            String str = (String) this.f23920b.get(i10);
            if (str != null) {
                ((x.a) c1970a.f24198c.get(i10)).f24216b = qVar.d0(str);
            }
        }
        c1970a.t(1);
        return c1970a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f23919a);
        parcel.writeStringList(this.f23920b);
        parcel.writeIntArray(this.f23921c);
        parcel.writeIntArray(this.f23922d);
        parcel.writeInt(this.f23923e);
        parcel.writeString(this.f23924f);
        parcel.writeInt(this.f23925g);
        parcel.writeInt(this.f23926h);
        TextUtils.writeToParcel(this.f23927i, parcel, 0);
        parcel.writeInt(this.f23928j);
        TextUtils.writeToParcel(this.f23929k, parcel, 0);
        parcel.writeStringList(this.f23930l);
        parcel.writeStringList(this.f23931m);
        parcel.writeInt(this.f23932n ? 1 : 0);
    }
}
