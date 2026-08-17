package Ic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.T;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements Hc.a {

    @NotNull
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f5397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f5398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f5403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f5404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f5405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f5406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f5407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f5408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f5409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f5410n;

    public static final class a implements Parcelable.Creator {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(T.class.getClassLoader());
        Intrinsics.c(parcelable);
        this((T) parcelable);
    }

    public i(T remoteMessage) {
        long[] jArrZ;
        String strS;
        String strA;
        String strW;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        this.f5397a = remoteMessage;
        Map mapB4 = remoteMessage.b4();
        Intrinsics.checkNotNullExpressionValue(mapB4, "getData(...)");
        Map mapA = f.a(mapB4);
        this.f5398b = mapA;
        T.b bVarG4 = remoteMessage.g4();
        this.f5399c = (bVarG4 == null || (strW = bVarG4.w()) == null) ? f.l(mapA) : strW;
        T.b bVarG5 = remoteMessage.g4();
        this.f5400d = (bVarG5 == null || (strA = bVarG5.a()) == null) ? f.g(mapA) : strA;
        T.b bVarG6 = remoteMessage.g4();
        this.f5401e = (bVarG6 != null ? bVarG6.s() : null) == null && f.h(mapA);
        T.b bVarG7 = remoteMessage.g4();
        this.f5402f = (bVarG7 == null || (strS = bVarG7.s()) == null) ? f.j(mapA) : strS;
        T.b bVarG8 = remoteMessage.g4();
        this.f5403g = (bVarG8 == null || (jArrZ = bVarG8.z()) == null) ? f.m(mapA) : jArrZ;
        this.f5404h = f.d(mapA);
        this.f5405i = f.b(mapA);
        this.f5406j = remoteMessage.g4() == null;
        this.f5407k = f.e(mapA);
        this.f5408l = f.n(mapA);
        this.f5409m = f.k(mapA);
        this.f5410n = f.c(mapA);
    }

    @Override // Hc.a
    public Object K1(Context context, Ed.b bVar) {
        T.b bVarG4 = this.f5397a.g4();
        Uri uriL = bVarG4 != null ? bVarG4.l() : null;
        if (uriL == null) {
            return null;
        }
        Object objB = Lc.c.b(uriL, 0L, 0L, bVar, 6, null);
        return objB == Fd.b.e() ? objB : (Bitmap) objB;
    }

    @Override // Hc.a
    public boolean N3() {
        return this.f5408l;
    }

    @Override // Hc.a
    public Fc.d P() {
        return this.f5397a.i4() == 1 ? Fc.d.HIGH : Fc.d.DEFAULT;
    }

    @Override // Hc.a
    public boolean P2() {
        return this.f5401e;
    }

    @Override // Hc.a
    public Number Q1() {
        String strF;
        T.b bVarG4 = this.f5397a.g4();
        if (bVarG4 == null || (strF = bVarG4.f()) == null) {
            strF = f.f(this.f5398b);
        }
        if (strF != null) {
            return Integer.valueOf(Color.parseColor(strF));
        }
        return null;
    }

    @Override // Hc.a
    public String W3() {
        return this.f5409m;
    }

    @Override // Hc.a
    public String c3() {
        return this.f5402f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Hc.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer E3() {
        return this.f5410n;
    }

    @Override // Hc.a
    public JSONObject getBody() {
        return this.f5404h;
    }

    @Override // Hc.a
    public String getText() {
        return this.f5400d;
    }

    @Override // Hc.a
    public String getTitle() {
        return this.f5399c;
    }

    public final boolean j() {
        return this.f5406j;
    }

    @Override // Hc.a
    public long[] k1() {
        return this.f5403g;
    }

    @Override // Hc.a
    public boolean l2() {
        T.b bVarG4 = this.f5397a.g4();
        return bVarG4 != null ? bVarG4.i() : f.i(this.f5398b);
    }

    @Override // Hc.a
    public boolean o2() {
        T.b bVarG4 = this.f5397a.g4();
        return (bVarG4 != null ? bVarG4.l() : null) != null;
    }

    @Override // Hc.a
    public String o3() {
        return this.f5407k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f5397a, i10);
    }

    @Override // Hc.a
    public boolean y0() {
        return this.f5405i;
    }
}
