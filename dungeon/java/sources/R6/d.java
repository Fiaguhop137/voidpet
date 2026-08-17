package R6;

import Ad.v;
import android.webkit.CookieManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends CookieHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f10877b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CookieManager f10878a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(String str) {
            return StringsKt.z(str, "Set-cookie", true) || StringsKt.z(str, "Set-cookie2", true);
        }
    }

    public d() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(ReactContext reactContext) {
        this();
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final void b(String str, String str2) {
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.setCookie(str, str2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Callback callback, Boolean bool) {
        callback.invoke(bool);
    }

    private final CookieManager g() {
        if (this.f10878a == null) {
            try {
                this.f10878a = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.f10878a;
    }

    public final void c(String url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            b(url, (String) it.next());
        }
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.flush();
        }
    }

    public final void d(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CookieManager cookieManagerG = g();
        if (cookieManagerG != null) {
            cookieManagerG.removeAllCookies(new c(callback));
        }
    }

    public final void f() {
    }

    @Override // java.net.CookieHandler
    public Map get(URI uri, Map headers) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(headers, "headers");
        CookieManager cookieManagerG = g();
        String cookie = cookieManagerG != null ? cookieManagerG.getCookie(uri.toString()) : null;
        return (cookie == null || cookie.length() == 0) ? N.i() : N.f(v.a("Cookie", CollectionsKt.e(cookie)));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map headers) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(headers, "headers");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        for (Map.Entry entry : headers.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (f10877b.b(str)) {
                c(string, list);
            }
        }
    }
}
