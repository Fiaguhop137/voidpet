package p093f2;

import R1.x;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f41690c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f41693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f41694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f41695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f41696f;

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f41691a = i10;
            this.f41692b = i11;
            this.f41693c = str;
            this.f41694d = str2;
            this.f41695e = str3;
            this.f41696f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f41691a == aVar.f41691a && this.f41692b == aVar.f41692b && TextUtils.equals(this.f41693c, aVar.f41693c) && TextUtils.equals(this.f41694d, aVar.f41694d) && TextUtils.equals(this.f41695e, aVar.f41695e) && TextUtils.equals(this.f41696f, aVar.f41696f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f41691a * 31) + this.f41692b) * 31;
            String str = this.f41693c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f41694d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f41695e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f41696f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public h(String str, String str2, List list) {
        this.f41688a = str;
        this.f41689b = str2;
        this.f41690c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (TextUtils.equals(this.f41688a, hVar.f41688a) && TextUtils.equals(this.f41689b, hVar.f41689b) && this.f41690c.equals(hVar.f41690c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f41688a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f41689b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f41690c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f41688a != null) {
            str = " [" + this.f41688a + ", " + this.f41689b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
