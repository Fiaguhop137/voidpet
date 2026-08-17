package Ic;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Parcelable, Serializable, Hc.a {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Number f5380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f5382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long[] f5384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JSONObject f5385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Fc.d f5386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Number f5387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f5389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5390n;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f5391a = new e();

        public b() {
            n();
            o();
        }

        public e a() {
            return this.f5391a;
        }

        public b b(boolean z10) {
            this.f5391a.f5388l = z10;
            return this;
        }

        public b c(Number number) {
            this.f5391a.f5380d = number;
            return this;
        }

        public b d(JSONObject jSONObject) {
            this.f5391a.f5385i = jSONObject;
            return this;
        }

        public b e(String str) {
            this.f5391a.f5389m = str;
            return this;
        }

        public b f(Number number) {
            this.f5391a.f5387k = number;
            return this;
        }

        public b g(Fc.d dVar) {
            this.f5391a.f5386j = dVar;
            return this;
        }

        public b h(Uri uri) {
            this.f5391a.f5381e = false;
            this.f5391a.f5382f = uri;
            return this;
        }

        public b i(boolean z10) {
            this.f5391a.f5390n = z10;
            return this;
        }

        public b j(String str) {
            this.f5391a.f5379c = str;
            return this;
        }

        public b k(String str) {
            this.f5391a.f5378b = str;
            return this;
        }

        public b l(String str) {
            this.f5391a.f5377a = str;
            return this;
        }

        public b m(long[] jArr) {
            this.f5391a.f5383g = false;
            this.f5391a.f5384h = jArr;
            return this;
        }

        public b n() {
            this.f5391a.f5381e = true;
            this.f5391a.f5382f = null;
            return this;
        }

        public b o() {
            this.f5391a.f5383g = true;
            this.f5391a.f5384h = null;
            return this;
        }
    }

    protected e() {
    }

    protected e(Parcel parcel) {
        this.f5377a = parcel.readString();
        this.f5378b = parcel.readString();
        this.f5379c = parcel.readString();
        this.f5380d = (Number) parcel.readSerializable();
        this.f5381e = parcel.readByte() != 0;
        this.f5382f = (Uri) parcel.readParcelable(getClass().getClassLoader());
        this.f5383g = parcel.readByte() != 0;
        this.f5384h = parcel.createLongArray();
        try {
            this.f5385i = new JSONObject(parcel.readString());
        } catch (NullPointerException | JSONException unused) {
        }
        Number number = (Number) parcel.readSerializable();
        if (number != null) {
            this.f5386j = Fc.d.h(number.intValue());
        }
        this.f5387k = (Number) parcel.readSerializable();
        this.f5388l = parcel.readByte() == 1;
        this.f5389m = parcel.readString();
        this.f5390n = parcel.readByte() == 1;
    }

    @Override // Hc.a
    public Number E3() {
        return this.f5380d;
    }

    @Override // Hc.a
    public Object K1(Context context, Ed.b bVar) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!applicationInfo.metaData.containsKey("expo.modules.notifications.large_notification_icon")) {
                return null;
            }
            return BitmapFactory.decodeResource(context.getResources(), applicationInfo.metaData.getInt("expo.modules.notifications.large_notification_icon"));
        } catch (PackageManager.NameNotFoundException | ClassCastException e10) {
            Log.e("expo-notifications", "Could not have fetched large notification icon.", e10);
            return null;
        }
    }

    @Override // Hc.a
    public boolean N3() {
        return this.f5390n;
    }

    @Override // Hc.a
    public Fc.d P() {
        return this.f5386j;
    }

    @Override // Hc.a
    public boolean P2() {
        return this.f5381e;
    }

    @Override // Hc.a
    public Number Q1() {
        return this.f5387k;
    }

    @Override // Hc.a
    public String W3() {
        return this.f5379c;
    }

    @Override // Hc.a
    public String c3() {
        Uri uri = this.f5382f;
        if (uri != null) {
            return uri.getLastPathSegment();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // Hc.a
    public JSONObject getBody() {
        return this.f5385i;
    }

    @Override // Hc.a
    public String getText() {
        return this.f5378b;
    }

    @Override // Hc.a
    public String getTitle() {
        return this.f5377a;
    }

    @Override // Hc.a
    public long[] k1() {
        return this.f5384h;
    }

    @Override // Hc.a
    public boolean l2() {
        return this.f5383g;
    }

    @Override // Hc.a
    public boolean o2() {
        return true;
    }

    @Override // Hc.a
    public String o3() {
        return this.f5389m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5377a);
        parcel.writeString(this.f5378b);
        parcel.writeString(this.f5379c);
        parcel.writeSerializable(this.f5380d);
        parcel.writeByte(this.f5381e ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f5382f, 0);
        parcel.writeByte(this.f5383g ? (byte) 1 : (byte) 0);
        parcel.writeLongArray(this.f5384h);
        JSONObject jSONObject = this.f5385i;
        parcel.writeString(jSONObject != null ? jSONObject.toString() : null);
        Fc.d dVar = this.f5386j;
        parcel.writeSerializable(dVar != null ? Integer.valueOf(dVar.o()) : null);
        parcel.writeSerializable(this.f5387k);
        parcel.writeByte(this.f5388l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5389m);
        parcel.writeByte(this.f5390n ? (byte) 1 : (byte) 0);
    }

    @Override // Hc.a
    public boolean y0() {
        return this.f5388l;
    }
}
