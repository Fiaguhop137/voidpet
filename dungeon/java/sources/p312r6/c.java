package p312r6;

import android.net.Uri;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52400b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52401c = "\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52402a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String d(String str) {
            List listL;
            List listG = new Regex("/").g(str, 0);
            if (listG.isEmpty()) {
                listL = CollectionsKt.l();
            } else {
                ListIterator listIterator = listG.listIterator(listG.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listL = CollectionsKt.N0(listG, listIterator.nextIndex() + 1);
                    }
                }
                listL = CollectionsKt.l();
            }
            return (String) AbstractC3952n.o0((String[]) listL.toArray(new String[0]));
        }

        public final c a(String url, String reason, String extra, Throwable th) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(extra, "extra");
            return new c(reason + StringsKt.I(c.f52401c, "<PORT>", String.valueOf(Uri.parse(url).getPort()), false, 4, null) + extra, th);
        }

        public final c b(String url, String reason, Throwable th) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return a(url, reason, "", th);
        }

        public final c c(String str, String str2) {
            if (str2 != null && str2.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("filename");
                    String string2 = jSONObject.getString("message");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Intrinsics.c(string);
                    return new c(string2, d(string), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), null);
                } catch (JSONException e10) {
                    W4.a.J("ReactNative", "Could not parse DebugServerException from: " + str2, e10);
                }
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
        this.f52402a = description;
    }

    private c(String str, String str2, int i10, int i11) {
        super(str + "\n  at " + str2 + ":" + i10 + ":" + i11);
        this.f52402a = str;
    }

    public /* synthetic */ c(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String detailMessage, Throwable th) {
        super(detailMessage, th);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        this.f52402a = detailMessage;
    }
}
