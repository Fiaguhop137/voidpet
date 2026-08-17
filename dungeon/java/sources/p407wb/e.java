package p407wb;

import android.net.Uri;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f56733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f56734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f56735c;

    public e(Uri uri, String str, r pickerType) {
        Intrinsics.checkNotNullParameter(pickerType, "pickerType");
        this.f56733a = uri;
        this.f56734b = str;
        this.f56735c = pickerType;
    }

    public final Uri a() {
        return this.f56733a;
    }

    public final String b() {
        return this.f56734b;
    }

    public final r c() {
        return this.f56735c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.b(this.f56733a, eVar.f56733a) && Intrinsics.b(this.f56734b, eVar.f56734b) && this.f56735c == eVar.f56735c;
    }

    public int hashCode() {
        Uri uri = this.f56733a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f56734b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f56735c.hashCode();
    }

    public String toString() {
        return "FilePickerContractOptions(initialUri=" + this.f56733a + ", mimeType=" + this.f56734b + ", pickerType=" + this.f56735c + ")";
    }
}
