package p283pd;

import Ad.j;
import android.util.Log;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p050cd.g;
import p050cd.h;
import p050cd.i;
import p050cd.m;
import p050cd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f50946g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f50947h = n.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f50951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f50952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f50953f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject a(String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                Map map = new p050cd.n(str).B().get();
                for (String str2 : map.keySet()) {
                    Object obj = map.get(str2);
                    Intrinsics.c(obj);
                    h hVar = (h) obj;
                    if ((hVar instanceof o) || (hVar instanceof p050cd.a) || (hVar instanceof i)) {
                        jSONObject.put(str2, ((g) hVar).get());
                    }
                }
                return jSONObject;
            } catch (m e10) {
                Log.e(n.f50947h, "Failed to parse manifest header content", e10);
                return null;
            } catch (JSONException e11) {
                Log.e(n.f50947h, "Failed to parse manifest header content", e11);
                return null;
            }
        }
    }

    public n(String str, String str2, String str3) {
        this.f50948a = str;
        this.f50949b = str2;
        this.f50950c = str3;
        this.f50951d = str != null ? Integer.valueOf(str) : null;
        this.f50952e = j.b(new l(this));
        this.f50953f = j.b(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject g(n nVar) {
        String str = nVar.f50950c;
        if (str != null) {
            return f50946g.a(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject h(n nVar) {
        String str = nVar.f50949b;
        if (str != null) {
            return f50946g.a(str);
        }
        return null;
    }

    public final JSONObject d() {
        return (JSONObject) this.f50953f.getValue();
    }

    public final Integer e() {
        return this.f50951d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.b(this.f50948a, nVar.f50948a) && Intrinsics.b(this.f50949b, nVar.f50949b) && Intrinsics.b(this.f50950c, nVar.f50950c);
    }

    public final JSONObject f() {
        return (JSONObject) this.f50952e.getValue();
    }

    public int hashCode() {
        String str = this.f50948a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f50949b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50950c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ResponseHeaderData(protocolVersionRaw=" + this.f50948a + ", serverDefinedHeadersRaw=" + this.f50949b + ", manifestFiltersRaw=" + this.f50950c + ")";
    }
}
